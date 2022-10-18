package mesas;

import java.sql.*;

public class Application {
    public static void main(String[] args)  {
        String sql_create = "DROP TABLE IF EXISTS FIGURAS;" +
                "CREATE TABLE FIGURAS" +
                "(" +
                "ID INT PRIMARY KEY AUTO_INCREMENT," +
                "Figura VARCHAR(255)," +
                "Color VARCHAR(255)" +
                ")";

        String sql_insert = "INSERT INTO FIGURAS(Figura, Color) " +
                "VALUES('Circulo','Rojo');" +
                "INSERT INTO FIGURAS(Figura, Color) " +
                "VALUES('Circulo','Azul');" +
                "INSERT INTO FIGURAS(Figura, Color) " +
                "VALUES('Cuadrado','Rojo');" +
                "INSERT INTO FIGURAS(Figura, Color) " +
                "VALUES('Cuadrado','Verde');" +
                "INSERT INTO FIGURAS(Figura, Color) "+
                "VALUES('Cuadrado','Azul');";

        String sql_select_CircRojo = "SELECT * FROM FIGURAS WHERE Figura='Circulo' AND Color='Rojo'";
        String sql_selectAll = "SELECT * FROM FIGURAS";

        // CONEXIÓN A LA DB
        Connection connection = null;
        try{
            connection = getConnection();
            Statement stmt = connection.createStatement();
            //creamos tabla
            stmt.execute(sql_create);
            //insertamos datos
            stmt.execute(sql_insert);

            //consultas
            ResultSet rs1 = stmt.executeQuery(sql_select_CircRojo);
            while (rs1.next()){
                System.out.println(rs1.getInt(1)+"-"+rs1.getString(2)+"-"+rs1.getString(3));
            }

            ResultSet rs2 = stmt.executeQuery(sql_selectAll);
            while (rs2.next()){
                System.out.println(rs2.getInt(1)+"-"+rs2.getString(2)+"-"+rs2.getString(3));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // CREAMOS EL CONECTOR A LA DB
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9g4clase11", "sa", "sa" );
    }
}
