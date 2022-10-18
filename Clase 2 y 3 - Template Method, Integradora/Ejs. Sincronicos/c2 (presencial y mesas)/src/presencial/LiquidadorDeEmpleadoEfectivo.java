package presencial;

public class LiquidadorDeEmpleadoEfectivo extends Liquidador{
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double respuesta=0;
        if (empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo emp= (EmpleadoEfectivo) empleado;
            respuesta=emp.getSueldoBase()+emp.getPremios()-emp.getDescuentos();
        }
        return respuesta;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {
        return "La liquidación generada es un documento digital.";
    }
}
