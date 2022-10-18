package presencial;

public class ApiTarjeta {
    public int descuentoXTarjeta(Tarjeta tarjeta){
        int respuesta=0;
        //es una tarjeta de Star Bank
        if(tarjeta.getBanco().equals("Star Bank")){
            respuesta=20;
        }
        return respuesta;
    }

    // NO ES DEL EJERCICIO
// ES UNA PREGUNTA
    public static int descuentoXTarjetaS(Tarjeta tarjeta){
        int respuesta=0;
        //es una tarjeta de Star Bank
        if(tarjeta.getBanco().equals("Star Bank")){
            respuesta=20;
        }
        return respuesta;
    }
}
