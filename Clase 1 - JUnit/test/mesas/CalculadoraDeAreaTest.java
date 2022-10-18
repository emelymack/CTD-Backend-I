package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeAreaTest {
    @Test
    public void areaCirculoTest(){
        CalculadoraDeArea calculadora = new CalculadoraDeArea();
        double radio = 0.5;
        String resultadoEsperado = "El área del círculo es de 0.7853981633974483";
        String resultadoActual = calculadora.areaCirculo(radio);
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void areaCuadradoTest(){
        CalculadoraDeArea calculadora = new CalculadoraDeArea();
        double lado = 5;
        String resultadoEsperado = "El área del cuadrado es de 25.0";
        String resultadoActual = calculadora.areaCuadrado(lado);
        assertEquals(resultadoEsperado, resultadoActual);
    }
}