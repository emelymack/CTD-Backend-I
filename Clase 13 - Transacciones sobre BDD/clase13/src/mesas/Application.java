package mesas;

import java.sql.*;

public class Application {
    public static void main(String[] args) {
        Odontologo odonto1 = new Odontologo("Washington", "Robert", "7217AE");
        Odontologo odonto2 = new Odontologo("Heathers", "Sally", "1168EM");
        Odontologo odonto3 = new Odontologo("Cyrus", "Miley", "2211JA");

        Connection connection = null;

        try {
            connection = getConnection();

            // 1- Creamos la tabla
            Statement stmt = connection.createStatement();
            stmt.execute(SQLAux.SQL_CREATE);

            // 2- Insertamos los datos
            // odonto1
            PreparedStatement psInsert1 = connection.prepareStatement(SQLAux.SQL_INSERT);
            psInsert1.setString(1, odonto1.getApellido());
            psInsert1.setString(2, odonto1.getNombre());
            psInsert1.setString(3, odonto1.getMatricula());
            psInsert1.execute();

            // odonto2
            PreparedStatement psInsert2 = connection.prepareStatement(SQLAux.SQL_INSERT);
            psInsert2.setString(1, odonto2.getApellido());
            psInsert2.setString(2, odonto2.getNombre());
            psInsert2.setString(3, odonto2.getMatricula());
            psInsert2.execute();
            selectAll(stmt);

            // odonto3 - ERROR! no se tiene q ejecutar
            /* connection.setAutoCommit(false);
            PreparedStatement psInsert3 = connection.prepareStatement(SQLAux.SQL_INSERT);
            psInsert3.setString(1, odonto3.getApellido());
            psInsert3.setString(2, odonto3.getNombre());
            psInsert3.setString(3, odonto3.getMatricula());
            psInsert3.execute();
            int aux = 4/0; // ERROR
            connection.commit();
            connection.setAutoCommit(true);
            selectAll(stmt);*/

            // update odonto1
            PreparedStatement psUpdate = connection.prepareStatement(SQLAux.SQL_UPDATE);
            psUpdate.setString(1,"1111EJ");
            psUpdate.setInt(2, 1);
            psUpdate.execute();
            selectAll(stmt);

        } catch (Exception e) {
            if (connection != null) {
                try {
                    connection.rollback();
                    System.out.println("Ups! Hubo un problema");
                    e.printStackTrace();
                } catch (SQLException ex) {
                    System.out.println("UPS! Problema de conexión");
                    ex.printStackTrace();
                }
            }

        }

    }


    public static void selectAll(Statement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery(SQLAux.SQL_SELECT_ALL);
        while (rs.next()){
            System.out.println("Dr. "+rs.getString(2)+", "+rs.getString(3)+" - ID: "+rs.getInt(1)+"\nMatrícula: "+rs.getString(4));
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9MesasC13-G1", "sa", "sa");
    }

}
