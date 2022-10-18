package presencial;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobarEmail(Mail email) {
        System.out.println("Tecnico trabajando");
        if (email.getDestino().equals("tecnica@colmena.com")||email.getTema().equals("Técnico")){
            return "Enviando a Tecnica";
        }
        else{
            return this.getSiguienteManejador().comprobarEmail(email);
        }
    }
}
