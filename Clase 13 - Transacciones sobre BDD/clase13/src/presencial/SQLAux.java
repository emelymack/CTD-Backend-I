package presencial;

public class SQLAux {
    public static final String SQL_DROP_CREATE="DROP TABLE IF EXISTS CUENTAS;" +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL," +
            "NRO_CUENTA INT NOT NULL," +
            "SALDO NUMERIC(10,2) NOT NULL)";
    public static final String SQL_INSERT="INSERT INTO CUENTAS (ID, NOMBRE, " +
            " NRO_CUENTA,SALDO)" +
            " VALUES (?,?,?,?)";
    public static final String SQL_UPDATE="UPDATE CUENTAS SET SALDO=? WHERE ID=?";
    public static final String SQL_SELECT="SELECT * FROM CUENTAS WHERE ID=?";
}
