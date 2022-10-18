package proyect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarDocumentoTest {
    @Test
    public void enviarDocumentoPresidente(){
        ComprobarDocumento comprobador = new ComprobarDocumento();
        Documento doc = new Documento("Este documento es para el Presidente de la Nación.",3);

        String rtaEsperada = "Documento gestionado por Presidente.";
        String rtaActual = comprobador.comprobar(doc);

        assertEquals(rtaEsperada, rtaActual);
    }

    @Test
    public void enviarDocumentoMinistro(){
        ComprobarDocumento comprobador = new ComprobarDocumento();
        Documento doc = new Documento("Este documento es para el Ministro de la Nación.",2);

        String rtaEsperada = "Documento gestionado por Ministro.";
        String rtaActual = comprobador.comprobar(doc);

        assertEquals(rtaEsperada, rtaActual);
    }

    @Test
    public void enviarDocumentoDiputado(){
        ComprobarDocumento comprobador = new ComprobarDocumento();
        Documento doc = new Documento("Este documento es para el Diputado de la Nación.",1);

        String rtaEsperada = "Documento gestionado por Diputado.";
        String rtaActual = comprobador.comprobar(doc);

        assertEquals(rtaEsperada, rtaActual);
    }
}