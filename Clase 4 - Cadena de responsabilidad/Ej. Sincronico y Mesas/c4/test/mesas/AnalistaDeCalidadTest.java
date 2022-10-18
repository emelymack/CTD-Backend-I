package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaDeCalidadTest {
    @Test
    public void comprobarCalidadArticuloOK(){
        AnalistaDeCalidad analistaCalidad = new AnalistaDeCalidad();
        Articulo art1 = new Articulo("PC", 1200, 1250, "sano");

        String resultadoEsperado="aceptado";
        String resultadoActual=analistaCalidad.comprobar(art1);

        assertEquals(resultadoEsperado,resultadoActual);
    }

    @Test
    public void comprobarCalidadArticuloERROR(){
        AnalistaDeCalidad analistaCalidad = new AnalistaDeCalidad();
        Articulo art2 = new Articulo("Mouse", 2200, 900, "sano");

        String resultadoEsperado="aceptado";
        String resultadoActual=analistaCalidad.comprobar(art2);

        assertEquals(resultadoEsperado,resultadoActual);
    }

}