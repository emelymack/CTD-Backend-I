package presencial;
// NO ES DEL EJERCICIO
// ES UNA PREGUNTA


public class FacadeDescuento implements IDescuento{
    private ApiTarjeta apiTarjeta;
    private ApiCantidad apiCantidad;
    private ApiProducto apiProducto;

    //el constructor crea las APIs
    public FacadeDescuento(){
        apiTarjeta= new ApiTarjeta();
        apiProducto= new ApiProducto();
        apiCantidad= new ApiCantidad();
    }

    @Override
    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        //comenzamos con un descuento igual a 0
        int respuesta=0;
        //comenzamos a invocar a cada Api para conocer si corresponde el
        //descuento en cada item correspondiente a cada parametro
        respuesta=respuesta+apiTarjeta.descuentoXTarjeta(tarjeta);
        respuesta=respuesta+apiProducto.descuentoXProducto(producto);
        respuesta=respuesta+apiCantidad.descuentoXCantidad(cantidad);

        return respuesta;
    }
}
