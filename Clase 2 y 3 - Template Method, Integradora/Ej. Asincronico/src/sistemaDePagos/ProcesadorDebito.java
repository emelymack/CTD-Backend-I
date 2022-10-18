package sistemaDePagos;

public class ProcesadorDebito extends Procesador {

    @Override
    protected boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        if(((Debito) tarjeta).getSaldoDisponible() >= monto){
            System.out.println("Pago autorizado.");
            return true;
        } else {
            System.out.println("Pago no autorizado. Saldo insuficiente.");
            return false;
        }
    }

    @Override
    public void procesarPago(Tarjeta tarjeta, Double monto) {
        boolean validado = validarPago((Debito)tarjeta);
        boolean autorizado = autorizarPago((Debito)tarjeta, monto);
        if(validado && autorizado){
            Double saldoActual = ((Debito) tarjeta).getSaldoDisponible() - monto;
            ((Debito) tarjeta).setSaldoDisponible(saldoActual);
            System.out.println("Su compra se ha realizado con éxito! Su saldo actual es de "+((Debito) tarjeta).getSaldoDisponible());
        } else{
            System.out.println("ERROR. No se pudo realizar la compra.");
        }

    }
}
