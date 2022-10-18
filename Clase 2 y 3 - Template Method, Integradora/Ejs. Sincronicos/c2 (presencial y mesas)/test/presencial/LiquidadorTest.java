package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    public void emitirReciboEmpleadoEfectivo(){
        Liquidador liquidador= new LiquidadorDeEmpleadoEfectivo();
        Empleado empleado= new EmpleadoEfectivo("Martín","Martini"
        ,"CA2547889247",400,40,60);
        String respEsperada="La liquidación generada es un documento digital. "
                +"Sueldo a liquidar: 420.0";
        String respActual=liquidador.liquidarSueldo(empleado);
        assertEquals(respEsperada,respActual);
    }
}