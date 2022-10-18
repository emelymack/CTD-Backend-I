package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescargaTest {
    @Test
    public void realizarDescargaFree(){
        Usuario user1 = new Usuario(1,"FREE");
        Cancion can1 = new Cancion("Love on the brain - Rihanna");
        DescargaProxy proxy = new DescargaProxy();

        String rtaEsperada = "El usuario no está habilitado a realizar descargas. Cambie su plan a 'PREMIUM'";
        String rtaActual = proxy.descargar(user1, can1);

        assertEquals(rtaEsperada, rtaActual);
    }

    @Test
    public void realizarDescargaPremium(){
        Usuario user2 = new Usuario(2,"PREMIUM");
        Cancion can2 = new Cancion("Fly on the wall - Miley Cyrus");
        DescargaProxy proxy = new DescargaProxy();


        String rtaEsperada = "Procediendo a la descarga de Fly on the wall - Miley Cyrus...";
        String rtaActual = proxy.descargar(user2, can2);

        assertEquals(rtaEsperada, rtaActual);
    }
}