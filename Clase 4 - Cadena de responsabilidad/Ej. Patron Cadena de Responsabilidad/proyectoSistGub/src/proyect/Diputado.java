package proyect;

public class Diputado extends UsuarioSistGub {

    @Override
    public void setTipoAcceso(Integer tipoAcceso) {
        this.tipoAcceso = 1;
    }

    @Override
    public String leerDocumento(Documento doc) {
        System.out.println("Diputado gestionando documento...");
        if(doc.getTipo() == 1){
            System.out.println("Diputado:\n Yo me encargo de gestionarlo. En el documento se lee '"+doc.getContenido()+"'");
            this.siguienteUsuarioGub.leerDocumento(doc);
            return "Documento gestionado por Diputado.";
        } else {
            System.out.println("Diputado:\n Acceso inválido. Enviando a Ministro...");
            return this.siguienteUsuarioGub.leerDocumento(doc);
        }
    }
}
