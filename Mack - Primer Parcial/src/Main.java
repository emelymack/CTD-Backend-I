import dao.OdontologoDAO;
import model.Odontologo;
import service.OdontologoService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/" +
                    "parcialIMack;INIT=RUNSCRIPT FROM 'script.sql'", "sa", "");

            OdontologoService service = new OdontologoService(new OdontologoDAO());
            Odontologo odonto1 = new Odontologo(123456,"Roberto","Rodríguez");
            Odontologo odonto2 = new Odontologo(456789,"Laura","Esquivel");
            Odontologo odonto3 = new Odontologo(987456,"Federico","Martínez");
            Odontologo odonto4 = new Odontologo(321654,"Sabrina","Ruggeri");
            Odontologo odonto5 = new Odontologo(5879456,"Joaquin","Abraham");

            service.guardarOdontologo(odonto1);
            service.guardarOdontologo(odonto2);
            service.guardarOdontologo(odonto3);
            service.guardarOdontologo(odonto4);
            service.guardarOdontologo(odonto5);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
