package test2;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:" + "./Database/my");
        // dsp de los : en "jdbc:h2:", se coloca el nombre de la BD. Si esta no existe, la CREA. Lo mismo sucede c usuario y contraseña
        Statement stmt = connection.createStatement();

        // MANEJANDO LA BDD
        String createTable = "DROP TABLE IF EXISTS EMPLOYEE; " +
                            "CREATE TABLE EMPLOYEE(ID int PRIMARY KEY," +
                                                "NAME VARCHAR(255)," +
                                                "AGE INT," +
                                                "COMPANY VARCHAR(255)," +
                                                "STARTDATE VARCHAR(255))";
        stmt.execute(createTable);

        String insertLine = "INSERT INTO EMPLOYEE VALUES(1, 'Emely Mack', 22, 'Google', '2022-11-11')";
        String insertLine2 = "INSERT INTO EMPLOYEE VALUES(2, 'Augusto', 32, 'Digital', '2023-05-10')";
        String insertLine3 = "INSERT INTO EMPLOYEE VALUES(3, 'Francisco', 25, 'Facebook', '2023-03-11')";
        stmt.execute(insertLine);
        stmt.execute(insertLine2);
        stmt.execute(insertLine3);

        String sql = "SELECT * FROM EMPLOYEE";
        ResultSet rd = stmt.executeQuery(sql);
        while(rd.next()){
            System.out.println(rd.getInt(1)+" "+rd.getString(2)+" "+rd.getInt(3)+" "+rd.getString(4)+" "+rd.getDate(5));
        }
    }
}
