package presencial.auxbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BDAux {
    private final static String SQL_DROP_CREATE="DROP TABLE IF EXISTS MEDICAMENTOS;" +
            "CREATE TABLE MEDICAMENTOS (ID INT PRIMARY KEY, CODIGO VARCHAR(100)," +
            " NOMBRE VARCHAR(100), LABORATORIO VARCHAR(100), CANTIDAD INT, " +
            "PRECIO NUMERIC(10,2))";
    public static void crearBD(){
        //se conecta y crea la BD
        Connection connection=null;
        try{
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/cam9clase14","sa","sa");
            Statement statement= connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
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
    }
}
