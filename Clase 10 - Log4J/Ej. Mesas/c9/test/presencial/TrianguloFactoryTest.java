package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloFactoryTest {
    @Test
    public void obtenerTriangulosVariosTest(){
        Triangulo triangulo1=TrianguloFactory.getTriangulo("rojo",2);
        Triangulo triangulo2=TrianguloFactory.getTriangulo("rojo",4);
        triangulo2.setTamanio(4);
        System.out.println("info de tam de triangulo1: "+triangulo1.getTamanio());
        assertEquals(4,triangulo2.getTamanio());
    }

}