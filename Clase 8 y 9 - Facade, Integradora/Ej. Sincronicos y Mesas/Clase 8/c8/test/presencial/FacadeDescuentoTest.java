package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeDescuentoTest {
    @Test
    public void descuento25Test(){
        FacadeDescuento facade=new FacadeDescuento();
        Tarjeta tarjeta= new Tarjeta("54516584218484","Star Link");
        Producto producto= new Producto("Tomates","Latas");
        int cantidad=20;
        int respuestaEsperada=25;

        int respuestaActual=facade.calcularDescuento(tarjeta,producto,cantidad);

        assertEquals(respuestaEsperada,respuestaActual);
    }
    @Test
    public void descuento45Test(){
        FacadeDescuento facade=new FacadeDescuento();
        Tarjeta tarjeta= new Tarjeta("54516584218484","Star Bank");
        Producto producto= new Producto("Tomates","Latas");
        int cantidad=20;
        int respuestaEsperada=45;

        int respuestaActual=facade.calcularDescuento(tarjeta,producto,cantidad);

        assertEquals(respuestaEsperada,respuestaActual);
    }

}