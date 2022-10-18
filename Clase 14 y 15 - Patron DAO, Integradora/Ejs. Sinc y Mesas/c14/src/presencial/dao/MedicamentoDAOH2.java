package presencial.dao;

import org.apache.log4j.Logger;
import presencial.model.Medicamento;

import java.sql.*;

public class MedicamentoDAOH2 implements IDao<Medicamento>{
    private static final Logger logger=Logger.getLogger(Medicamento.class);
    Connection connection=null;

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        logger.info("Se ejecuta el guardado de un medicamento");
        //conectarnos a la base
        //guardar el elemento en la base
        //devolver el elemento

        try{
            connection=getConnection();
            PreparedStatement ps= connection.prepareStatement("INSERT INTO MEDICAMENTOS" +
                    " (ID, CODIGO, NOMBRE, LABORATORIO, CANTIDAD, PRECIO) VALUES " +
                    "(?,?,?,?,?,?)");
            //DEBEMOS CARGAR 6 ELEMENTOS ANTES DE EJECUTAR
            ps.setInt(1,medicamento.getId());
            ps.setString(2, medicamento.getCodigo());
            ps.setString(3, medicamento.getNombre());
            ps.setString(4, medicamento.getLaboratorio());
            ps.setInt(5,medicamento.getCantidad());
            ps.setDouble(6,medicamento.getPrecio());
            ps.execute();
            ps.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                logger.error("No se pudo cerrar la conexión-"+ex.getMessage());
                ex.printStackTrace();
            }
        }

        return medicamento;
    }

    @Override
    public Medicamento buscar(int id) {
        logger.info("Se ejecuta la búsqueda de un medicamento");

        Medicamento medicamento = null;

        try{
          connection = getConnection();
          PreparedStatement ps = connection.prepareStatement("SELECT * FROM MEDICAMENTOS WHERE ID = ?");
          ps.setInt(1, id);

          ResultSet rs = ps.executeQuery();

          while(rs.next()){
              int idMedicamento = rs.getInt("ID");
              String codigo = rs.getString("CODIGO");
              String nombre = rs.getString("NOMBRE");
              String laboratorio = rs.getString("LABORATORIO");
              int cantidad = rs.getInt("CANTIDAD");
              Double precio = rs.getDouble("PRECIO");
              medicamento = new Medicamento(idMedicamento,codigo,nombre,laboratorio,cantidad,precio);
          }
          ps.close();

          if(medicamento == null){
              logger.error("No se pudo encontrar el medicamento con ID "+id);
          }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            } catch (SQLException ex) {
                logger.error("No se pudo cerrar la conexión - "+ ex.getMessage());
                ex.printStackTrace();
            }
        }

        return medicamento;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9clase14","sa","sa");
    }
}
