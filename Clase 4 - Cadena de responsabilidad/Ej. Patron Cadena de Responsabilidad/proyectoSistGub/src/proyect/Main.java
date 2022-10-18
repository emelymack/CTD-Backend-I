package proyect;

public class Main {
    public static void main(String[] args) {
        ComprobarDocumento comprobador = new ComprobarDocumento();
        Documento doc = new Documento("Este documento es para el proyect.Presidente de la Nación.",3);

        comprobador.comprobar(doc);
    }
}
