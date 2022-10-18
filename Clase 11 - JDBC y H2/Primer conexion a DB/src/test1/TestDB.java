package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {

    public static void main(String[] args) throws Exception {
        // hacemos una nueva instancia del Driver
        Class.forName("org.h2.Driver").newInstance();

        // armamos un objeto Connection, usando el DriverManager
        Connection connection = DriverManager.getConnection("jdbc:h2:" + "./Database/my");

        // ahora que tenemos la conexión, podemos crear objetos Statement
        Statement stmt = connection.createStatement();

        // creamos una tabla en nuestra DB
        String createTable = "DROP TABLE IF EXISTS TEST; " +
                            "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";
        stmt.execute(createTable);

        // insertamos filas en la tabla TEST
        String insertFila = "INSERT INTO TEST VALUES(1, 'Emely')";
        String insertFila2 = "INSERT INTO TEST VALUES(2, 'Joaquin')";
        stmt.execute(insertFila);
        stmt.execute(insertFila2);

        // obtenemos los datos insertados en la tabla, que nos va a devolver un objeto de tipo ResultSet
        String sql = "SELECT * FROM TEST";
        ResultSet rd = stmt.executeQuery(sql);
        // lo iteramos mientras tenga un próximo elemento
        while(rd.next()){
            System.out.println(rd.getInt(1) + rd.getString(2) );
        }

    }

}
