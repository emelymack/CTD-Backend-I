package presencial;

public abstract class Liquidador {
    public String liquidarSueldo(Empleado empleado){
        String respuesta="la liquidación no pudo ser calculada.";
        //calcular el sueldo
        double sueldo= calcularSueldo(empleado);
        if (sueldo>0){
            // emitir el recibo
            String recibo=emitirRecibo(empleado);
            System.out.println(depositarSueldo(empleado));
            respuesta=recibo+" Sueldo a liquidar: "+sueldo;
            // depositar el sueldo
        }
        // retornar
        return respuesta;
    }

    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String emitirRecibo(Empleado empleado);

    private String depositarSueldo(Empleado empleado){
        return "Orden de deposito en la cuenta "+empleado.getNumeroDeCuenta();
    }
}
