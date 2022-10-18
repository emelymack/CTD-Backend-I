package presencial;

public class CompruebaMail {
    private Manejador inicial;

    public CompruebaMail(){
        inicial= new ManejadorComercial();
        Manejador gerencial= new ManejadorGerencial();
        Manejador tecnico= new ManejadorTecnico();
        Manejador spam= new ManejadorSpam();

        inicial.setSiguienteManejador(gerencial);
        gerencial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(spam);
    }

    public String comprobar(Mail correo){
        return inicial.comprobarEmail(correo);
    }
}
