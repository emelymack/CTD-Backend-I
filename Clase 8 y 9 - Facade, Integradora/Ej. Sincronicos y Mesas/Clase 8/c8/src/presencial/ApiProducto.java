package presencial;

public class ApiProducto {
    public int descuentoXProducto(Producto producto){
        int respuesta=0;
        //preguntamos por el tipo
        if(producto.getTipo().equals("Latas")){
            respuesta=10;
        }
        return respuesta;
    }


    // NO ES DEL EJERCICIO
// ES UNA PREGUNTA
    public static int descuentoXProductoS(Producto producto){
        int respuesta=0;
        //preguntamos por el tipo
        if(producto.getTipo().equals("Latas")){
            respuesta=10;
        }
        return respuesta;
    }
}
