package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaMailTest {
    @Test
    public void debeResponderSpamTest(){
        CompruebaMail comprobador= new CompruebaMail();
        Mail correo= new Mail("rodolfo@gmail.com","ezequiel@gmail.com","Queja");
        String respuestaEsperada="Marcado como spam";

        String resultadoActual=comprobador.comprobar(correo);

        assertEquals(respuestaEsperada,resultadoActual);
    }
    @Test
    public void debeResponderTecnicaTest(){
        CompruebaMail comprobador= new CompruebaMail();
        Mail correo= new Mail("rodolfo@gmail.com","ezequiel@gmail.com","Técnico");
        String respuestaEsperada="Enviando a Tecnica";

        String resultadoActual=comprobador.comprobar(correo);

        assertEquals(respuestaEsperada,resultadoActual);
    }

}