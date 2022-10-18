package presencial;

public class ManejadorComercial extends Manejador{
    @Override
    public String comprobarEmail(Mail email) {
        System.out.println("Comercial trabajando");
        if (email.getDestino().equals("comercial@colmena.com")||email.getTema().equals("Comercial")){
            return "Enviando a comercial";
        }
        else{
            return this.getSiguienteManejador().comprobarEmail(email);
        }
    }
}
