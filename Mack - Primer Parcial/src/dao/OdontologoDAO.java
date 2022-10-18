package dao;

import model.Odontologo;
import model.SQLAux;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAO implements IDao<Odontologo> {
    private static final Logger logger = Logger.getLogger(OdontologoDAO.class);

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;

        try{
            connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(SQLAux.SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,odontologo.getMatricula());
            ps.setString(2,odontologo.getNombre());
            ps.setString(3,odontologo.getApellido());
            ps.execute();
            ResultSet id=ps.getGeneratedKeys();
            while(id.next()){
                odontologo.setId(id.getInt(1));
            }

            logger.info("Se guardó el odontólogo "+odontologo.getApellido() + ", " +odontologo.getNombre());
            ps.close();

        } catch (SQLException | ClassNotFoundException e) {
            logger.error("Ocurrió un error: ", e);
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (SQLException throwables) {
                logger.error("Ocurrió un error: ", throwables);
                throwables.printStackTrace();
            }
        }
        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        Connection connection = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try{
            connection = getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQLAux.SQL_SELECTALL);
            logger.info("Se generó la búsqueda de todos los odontólogos");
            while(rs.next()){
                odontologos.add(new Odontologo(
                        rs.getInt("ID"),
                        rs.getInt("MATRICULA"),
                        rs.getString("NOMBRE"),
                        rs.getString("APELLIDO")
                ));
            }
        }
        catch (SQLException | ClassNotFoundException e) {
            logger.error("Ocurrió un error: ", e);
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }
            catch (SQLException throwables) {
                logger.error("Ocurrió un error: ", throwables);
                throwables.printStackTrace();
            }
        }
        return odontologos;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        logger.info("Generando la conexión a la DB...");
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/parcialIMack","sa","");
    }
}
