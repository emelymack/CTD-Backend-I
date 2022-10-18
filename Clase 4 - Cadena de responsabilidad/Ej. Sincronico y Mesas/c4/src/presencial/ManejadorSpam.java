package presencial;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarEmail(Mail email) {
        System.out.println("Spam trabajando");
        return "Marcado como spam";
    }
}
