package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IGrillaDePeliculasTest {
    @Test
    public void peliculaDisponibleTest() {
        IP direccion = new IP(30, 25, 98, 14);
        GrillaDePeliculasProxy proxy = new GrillaDePeliculasProxy(direccion, new GrillaDePeliculas());
        String respEsperada="www.tuspeliculas.com/peli1";
        try {
            assertEquals(respEsperada,proxy.getPelicula("Peli1").getLink());
        } catch (PeliculaNoHabilitadaException e) {
            System.out.println(e);
        }
    }
        @Test
        public void peliculaNoDisponibleTest(){
            IP direccion= new IP(30,25,98,14);
            GrillaDePeliculasProxy proxy= new GrillaDePeliculasProxy(direccion,new GrillaDePeliculas());
        String respEsperada="Peli2 no disponible en Argentina";
            try{
            System.out.println(proxy.getPelicula("Peli2").getLink());
        }
        catch (PeliculaNoHabilitadaException e){
            assertEquals(respEsperada,e.getMessage());
        }

    }
}