package sistemaDePagos;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Procesador {
    LocalDate fechaSinFormat = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
    String fechaActual = fechaSinFormat.format(formatter);

    protected abstract boolean autorizarPago(Tarjeta tarjeta, Double monto);

    protected boolean validarPago(Tarjeta tarjeta){
        String[] fechaActualSplit = fechaActual.split("/");
        int mesActual = Integer.parseInt(fechaActualSplit[0]);
        int anoActual = Integer.parseInt(fechaActualSplit[1]);

        String[] fechaExpSplit = tarjeta.getFechaExp().split("/");
        int mesTarjeta = Integer.parseInt(fechaExpSplit[0]);
        int anoTarjeta = Integer.parseInt(fechaExpSplit[1]);
        System.out.println("Fecha actual: "+mesActual+anoActual);
        System.out.println("Fecha tarjeta: "+mesTarjeta+anoTarjeta);

        if((mesTarjeta < mesActual) && (anoTarjeta >= anoActual)){
            System.out.println("Pago validado.");
            return true;
        } else {
            System.out.println("Pago rechazado. La tarjeta expiró.");
            return false;
        }
    };

    public abstract void procesarPago(Tarjeta tarjeta, Double monto);

}
