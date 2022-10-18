package presencial;

public class FacadeDescuentoEstatica implements IDescuento {

    @Override
    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        //comenzamos con un descuento igual a 0
        int respuesta=0;
        //comenzamos a invocar a cada Api para conocer si corresponde el
        //descuento en cada item correspondiente a cada parametro
        respuesta=respuesta+ApiTarjeta.descuentoXTarjetaS(tarjeta);
        respuesta=respuesta+ApiProducto.descuentoXProductoS(producto);
        respuesta=respuesta+ApiCantidad.descuentoXCantidadS(cantidad);


        return respuesta;
    }
}
