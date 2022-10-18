package presencial;

import java.sql.*;

public class Programa {
    public static void main(String[] args) {
        String sql_create="DROP TABLE IF EXISTS ANIMALES;" +
                "CREATE TABLE ANIMALES" +
                "(" +
                "ID INT PRIMARY KEY," +
                "NOMBRE varchar(100) NOT NULL," +
                "TIPO varchar(100) NOT NULL" +
                ")";
        String sql_insert1="INSERT INTO ANIMALES (ID, NOMBRE, TIPO) " +
                "VALUES (1,'Manchas','Perro');" +
                "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) " +
                "VALUES (2,'Pepe','Perro');" +
                "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) " +
                "VALUES (3,'Bobby','Perro');" +
                "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) " +
                "VALUES (4,'Bigotes','Gato');" +
                "INSERT INTO ANIMALES (ID, NOMBRE, TIPO) " +
                "VALUES (5,'Tom','Gato');";
        String sql_delete="DELETE FROM ANIMALES WHERE ID=3";
        String sql_select="SELECT * FROM ANIMALES";
        Connection connection=null;
        try{
            //conectarme a la base de datos
            connection=getConnection();
            //crear la tabla en la BD
            Statement statement=connection.createStatement();
            statement.execute(sql_create);
            //agregar a 5 animales
            Statement statement1=connection.createStatement();
            statement1.execute(sql_insert1);
            //consultar los animales de la BD
            ResultSet rs=statement1.executeQuery(sql_select);
            while(rs.next()){
                System.out.println(rs.getInt(1)+"-"+rs.getString(2)
                +"-"+rs.getString(3));
            }
            //borrar a Bobby
            statement1.execute(sql_delete);
            rs=statement1.executeQuery(sql_select);
            while(rs.next()){
                System.out.println(rs.getInt(1)+"-"+rs.getString(2)
                        +"-"+rs.getString(3));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9clase11","sa","sa");
    }
}
