package service;

import dao.PacienteDAOH2;
import model.Domicilio;
import model.Paciente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.util.List;


class PacienteServiceTest {
    @Test
    public void agregarPacienteYBuscar(){
        Connection connection= null;
        try{
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/cam9clase15G1M;INIT=RUNSCRIPT FROM 'src/create.sql';","sa","sa");

            PacienteService service = new PacienteService(new PacienteDAOH2());

            Domicilio domicilio1 = new Domicilio("AAAA",222, "yoro", "Santa Fe");
            Paciente paciente1 = new Paciente("PEPITA PEREZZZ", 46598758, LocalDate.of(2022, 03,14), domicilio1);
            paciente1.setDomicilio(domicilio1);
            service.guardarPaciente(paciente1);


            Paciente searchResult = service.buscarPaciente(1);
            System.out.println(searchResult.getNombre());
            assertEquals(searchResult.getNombre(), "Emely Mack");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }

    @Test
    public void pacienteNoExiste(){
        Connection connection= null;
        try{
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/cam9clase15G1Maven;","sa","sa");

            PacienteService service = new PacienteService(new PacienteDAOH2());
            Paciente searchResult = service.buscarPaciente(1000);
            assertNull(searchResult);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

/*    @Test
    public void eliminarPacienteID4(){
        Connection connection= null;
        try{
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/cam9clase15G1Maven;","sa","sa");

            PacienteService service = new PacienteService(new PacienteDAOH2());

            service.eliminarPaciente(5);
            Paciente searchResult = service.buscarPaciente(5);
            assertNull(searchResult);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }*/

/*    @Test
    public void buscarTodosTest(){
        Connection connection= null;
        try{
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/cam9clase15G1Maven;","sa","sa");

            PacienteService service = new PacienteService(new PacienteDAOH2());

            List<Paciente> pacientesResult = service.buscarTodosPacientes();
            for (Paciente p : pacientesResult) {
                System.out.println(p.getNombre());
            }

            assertTrue(pacientesResult.size()>0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }*/
}


