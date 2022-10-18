package presencial;

public class ApiCantidad {
    public int descuentoXCantidad(int cantidad){
        //devolver 15 de descuento si es mayores a 12 cantidades
        int respuesta=0;
        if (cantidad>12){
            respuesta=15;
        }
        return respuesta;
    }

    // NO ES DEL EJERCICIO
// ES UNA PREGUNTA
    public static int descuentoXCantidadS(int cantidad){
        //devolver 15 de descuento si es mayores a 12 cantidades
        int respuesta=0;
        if (cantidad>12){
            respuesta=15;
        }
        return respuesta;
    }
}
