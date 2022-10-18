package proyect;

public class Ministro extends UsuarioSistGub {
    @Override
    public void setTipoAcceso(Integer tipoAcceso) {
        this.tipoAcceso = 2;
    }

    @Override
    public String leerDocumento(Documento doc) {
        System.out.println("Ministro gestionando documento...");
        if(doc.getTipo() <= 2){
            System.out.println("Ministro:\n Yo me encargo de gestionarlo. En el documento se lee '"+doc.getContenido()+"'");
            this.siguienteUsuarioGub.leerDocumento(doc);
            return "Documento gestionado por Ministro.";
        } else {
            System.out.println("Ministro:\n Acceso inválido. Enviando a Presidente...");
            return this.siguienteUsuarioGub.leerDocumento(doc);
        }
    }
}
