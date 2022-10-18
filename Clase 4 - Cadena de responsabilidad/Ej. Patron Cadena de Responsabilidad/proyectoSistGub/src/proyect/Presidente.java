package proyect;

public class Presidente extends UsuarioSistGub {
    @Override
    public void setTipoAcceso(Integer tipoAcceso) {
        this.tipoAcceso = 3;
    }

    @Override
    public String leerDocumento(Documento doc) {
        System.out.println("Presidente gestionando documento...");
        System.out.println("Presidente:\n Yo me encargo de gestionarlo. En el documento se lee '"+doc.getContenido()+"'");
        return "Documento gestionado por Presidente.";
    }
}