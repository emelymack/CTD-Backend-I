package mesas;

public class SQLAux {
    public static final String SQL_CREATE = "DROP TABLE IF EXISTS ODONTOLOGOS;" +
                        "CREATE TABLE ODONTOLOGOS " +
                        "(" +
                        "ID INT PRIMARY KEY AUTO_INCREMENT, " +
                        "APELLIDO VARCHAR(255) NOT NULL, " +
                        "NOMBRE VARCHAR(255) NOT NULL, " +
                        "MATRICULA VARCHAR(255) NOT NULL" +
                        ")";

    public static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS (APELLIDO, NOMBRE, MATRICULA) " +
                        "VALUES(?,?,?)";

    public static final String SQL_UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID=?";

    public static final String SQL_SELECT_ALL = "SELECT * FROM ODONTOLOGOS";
}
