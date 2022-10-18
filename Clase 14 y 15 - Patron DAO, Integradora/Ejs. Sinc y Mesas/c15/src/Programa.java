import dao.PacienteDAOH2;
import model.Domicilio;
import model.Paciente;
import service.PacienteService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        Connection connection= null;
        try{
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/" +
                    "cam9clase15G1M;INIT=RUNSCRIPT FROM './create.sql'","sa","sa");

            Domicilio domicilio2 = new Domicilio("Urquiza",1111, "Rosario", "Santa Fe");
            Domicilio domicilio3 = new Domicilio("Santa Fe",333, "Buenos Aires", "Buenos Aires");
            Domicilio domicilio4 = new Domicilio("Rodríguez",888, "Rosario", "Santa Fe");

            Paciente paciente2 = new Paciente("Fabiana Paloma", 20145887, LocalDate.of(2022, 05,17), domicilio2);
            Paciente paciente3 = new Paciente("Pepe Argento", 17854569, LocalDate.of(2022, 04,11), domicilio3);
            Paciente paciente4 = new Paciente("Moni Argento", 22154684, LocalDate.of(2022, 04,13), domicilio4);

            PacienteService service = new PacienteService(new PacienteDAOH2());
            service.guardarPaciente(paciente2);
            service.guardarPaciente(paciente3);
            service.guardarPaciente(paciente4);
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
}
