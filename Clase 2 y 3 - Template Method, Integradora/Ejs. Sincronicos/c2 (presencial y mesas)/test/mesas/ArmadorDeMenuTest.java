package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmadorDeMenuTest{
    @Test
    public void prepararMenuClasicoTest(){
        ArmadorDeMenu armador= new ArmadorMenuClasico();
        String respEsperada="Iniciando el armado del menú.\n" +
                "1-Agregar comida.\n2-Cocinar comida\n"
                +"El precio del menú es: 100.0";
        Menu menu= new Menu(100);
        String respActual=armador.preparar(menu);
        assertEquals(respEsperada,respActual);
    }

    @Test
    public void prepararMenuInfantilTest(){
        ArmadorDeMenu armador= new ArmadorMenuInfantil();
        String respEsperada="Iniciando el armado del menú.\n" +
                "1-Agregar adornos.\n2-Agregar comida.\n3-Cocinar comida."
                +"El precio del menú es: 109.0";
        Menu menu= new MenuInfantil(100,3);
        String respActual=armador.preparar(menu);
        assertEquals(respEsperada,respActual);
    }

    @Test
    public void prepararMenuVegetarianoTest(){
        ArmadorDeMenu armador= new ArmadorMenuVegetariano();
        String respEsperada="Iniciando el armado del menú.\n" +
                "1-Agregar especias\n2-Agregar salsas\n3-Agregar comida"
                +"El precio del menú es: 107.0";
        Menu menu= new MenuVegetariano(100,3);
        String respActual=armador.preparar(menu);
        assertEquals(respEsperada,respActual);
    }
}