package presencial;

import java.sql.*;

public class Programa {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //queremos agregar la cuenta del profe
        Cuenta cuenta= new Cuenta(1,"CA Rodolfo",547485,100);
        Connection connection=null;
        try{
            connection=getConnection();
            //crear la tabla
            Statement statement= connection.createStatement();
            statement.execute(SQLAux.SQL_DROP_CREATE);
            //proceder a insertar la cuenta
            PreparedStatement ps=connection.prepareStatement(SQLAux.SQL_INSERT);
            //tengo que pasarle 4 valores
            ps.setInt(1,cuenta.getId());
            ps.setString(2, cuenta.getNombre());
            ps.setInt(3,cuenta.getNroCuenta());
            ps.setDouble(4,cuenta.getSaldo());
            ps.execute();
            //agregarle 10 al saldo
            PreparedStatement psUpdate=connection.prepareStatement(SQLAux.SQL_UPDATE);
            psUpdate.setDouble(1,cuenta.getSaldo()+10);
            psUpdate.setInt(2,cuenta.getId());
            psUpdate.execute();
            //armamos la transacción, intentamos sumar el saldo y que ocurra una execp
            connection.setAutoCommit(false);
            psUpdate.setDouble(1,cuenta.getSaldo()+25);
            psUpdate.setInt(2,cuenta.getId());
            psUpdate.execute();
            //que tengamos un problema
            int aux=4/0;
            connection.commit();
            connection.setAutoCommit(true);
            //mostrar la información de la base
            PreparedStatement psSelect= connection.prepareStatement(SQLAux.SQL_SELECT);
            psSelect.setInt(1,cuenta.getId());
            ResultSet rs =psSelect.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(2)+"-Saldo: "
                        +rs.getDouble(4));
            }

        }
        catch (Exception e){
            //tenemos que ejecutar el rollback
            if (connection!=null){
                try{
                    connection.rollback();
                    System.out.println("Tuvimos un problema");
                    e.printStackTrace();
                }
                catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
        finally {
            connection.close();
        }

        //consultamos por afuera
        connection=getConnection();
        PreparedStatement psSelect= connection.prepareStatement(SQLAux.SQL_SELECT);
        psSelect.setInt(1,cuenta.getId());
        ResultSet rs =psSelect.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString(2)+"-Saldo: "
                    +rs.getDouble(4));
        }
    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9clase13",
                "sa","sa");
    }
}
