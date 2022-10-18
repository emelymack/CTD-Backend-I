package sistemaDePagos;

public class ProcesadorCredito extends Procesador {

    @Override
    protected boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        Double saldoUtilizadoTotal = ((Credito)tarjeta).getSaldoUtilizado() + monto;
        if(saldoUtilizadoTotal <= ((Credito) tarjeta).getLimite()){
            System.out.println("Pago autorizado.");
            return true;
        } else {
            System.out.println("Pago no autorizado. Su saldo llegó a su límite.");
            return false;
        }
    }

    @Override
    public void procesarPago(Tarjeta tarjeta, Double monto) {
        boolean validado = validarPago((Credito)tarjeta);
        boolean autorizado = autorizarPago((Credito)tarjeta, monto);
        if(validado && autorizado){
            Double saldoUtilizadoActual = ((Credito) tarjeta).getSaldoUtilizado() + monto;
            ((Credito) tarjeta).setSaldoUtilizado(saldoUtilizadoActual);
            System.out.println("Su compra se ha realizado con éxito! Su saldo utilizado es de "+((Credito) tarjeta).getSaldoUtilizado());
        } else{
            System.out.println("ERROR. No se pudo realizar la compra.");
        }
    }
}
