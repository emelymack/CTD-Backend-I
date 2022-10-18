package service;

import dao.OdontologoDAO;
import model.Odontologo;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    @Test
    public void buscarTodosTest(){
        Connection connection = null;

        try{
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/parcialIMack","sa","");
            OdontologoService service = new OdontologoService(new OdontologoDAO());

            List<Odontologo> odontologosResult = service.buscarAllOdontologos();
            for ( Odontologo o : odontologosResult ) {
                System.out.println("{\n" +
                        "ID: " + o.getId() + "\n" +
                        "MATRICULA: " + o.getMatricula() + "\n" +
                        "APELLIDO: " + o.getApellido() + "\n" +
                        "NOMBRE: " + o.getNombre() + "\n" +
                        "}");
            }

            assertTrue(odontologosResult.size() > 0);

        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}