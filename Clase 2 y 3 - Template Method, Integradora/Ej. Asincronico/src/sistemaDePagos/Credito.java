package sistemaDePagos;

import java.time.LocalDate;
import java.util.Date;

public class Credito extends Tarjeta {
    private Double limite;
    private Double saldoUtilizado;
    private Procesador procesador = new ProcesadorCredito();

    public Credito(int nrosFrente, int codSeg, String fechaExp, Double limite, Double saldoUtilizado) {
        super(nrosFrente, codSeg, fechaExp);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(Double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public void realizarCompra(Tarjeta tarjeta, Double monto) {
        procesador.procesarPago(tarjeta, monto);
    }
}
