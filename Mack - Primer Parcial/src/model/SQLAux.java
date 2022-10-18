package model;

public class SQLAux {
    public static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS " +
            "(MATRICULA, NOMBRE, APELLIDO) VALUES (?,?,?)";

    public static final String SQL_SELECTALL = "SELECT * FROM ODONTOLOGOS";
}
