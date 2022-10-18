package dao;

import model.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAOH2 implements IDao<Paciente>{
    @Override
    public Paciente guardar(Paciente paciente) {
        Connection connection=null;

        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            domicilioDAOH2.guardar(paciente.getDomicilio());
            connection=getConnection();
            PreparedStatement ps=connection.prepareStatement("INSERT INTO PACIENTES " +
                    "(NOMBRE, DNI, FECHA, DOMICILIO_ID) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,paciente.getNombre());
            ps.setInt(2,paciente.getDni());
            ps.setDate(3, Date.valueOf(paciente.getFechaIngreso()));
            ps.setInt(4,paciente.getDomicilio().getId());
            ps.execute();
            ResultSet key=ps.getGeneratedKeys();
            while(key.next()){
                paciente.setId(key.getInt(1));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return paciente;
    }

    @Override
    public Paciente buscar(int id) {
        Connection connection=null;
        Paciente paciente=null;
        DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
        try{
            connection=getConnection();

            PreparedStatement ps= connection.prepareStatement("SELECT * FROM " +
                    "PACIENTES WHERE ID=?");
            ps.setInt(1,id);

            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                paciente= new Paciente(rs.getString("NOMBRE"),
                        rs.getInt("DNI"), rs.getDate("FECHA").toLocalDate(),
                        domicilioDAOH2.buscar(rs.getInt("DOMICILIO_ID")));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return paciente;
    }

    @Override
    public void eliminar(int id) {
        Connection connection = null;

        try{
            Paciente pacienteBuscado = buscar(id);
            // eliminamos 1ro el registro del domicilio
            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
            domicilioDAOH2.eliminar(pacienteBuscado.getDomicilio().getId());

            // eliminamos el paciente
            connection = getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM PACIENTES WHERE ID = ?");
            ps.setInt(1, id);
            ps.execute();

        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Paciente> buscarTodos() {
        Connection connection = null;
        List<Paciente> pacientes = new ArrayList<>();

        try{
            connection = getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM PACIENTES");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
                pacientes.add(new Paciente(rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getDate(4).toLocalDate(), domicilioDAOH2.buscar(rs.getInt(5))));
            }
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return pacientes;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9clase15G1Maven","sa","sa");
    }
}
