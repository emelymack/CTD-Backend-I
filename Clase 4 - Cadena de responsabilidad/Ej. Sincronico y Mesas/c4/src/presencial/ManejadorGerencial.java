package presencial;

public class ManejadorGerencial extends Manejador{
    @Override
    public String comprobarEmail(Mail email) {
        System.out.println("Gerencial trabajando");
        if (email.getDestino().equals("gerencial@colmena.com")||email.getTema().equals("Gerencial")){
            return "Enviando a gerencia";
        }
        else{
            return this.getSiguienteManejador().comprobarEmail(email);
        }
    }
}
