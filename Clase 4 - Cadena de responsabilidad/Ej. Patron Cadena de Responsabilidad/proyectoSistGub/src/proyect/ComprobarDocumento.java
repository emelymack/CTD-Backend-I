package proyect;

public class ComprobarDocumento {
    protected UsuarioSistGub inicial;

        public ComprobarDocumento(){
            inicial = new Diputado();
            UsuarioSistGub ministro = new Ministro();
            UsuarioSistGub presidente= new Presidente();

            inicial.setSiguienteUsuarioGub(ministro);
            ministro.setSiguienteUsuarioGub(presidente);

        }

        public String comprobar(Documento doc){
            return inicial.leerDocumento(doc);
        }
}
