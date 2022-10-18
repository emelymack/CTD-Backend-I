package sistemaDePagos;

import java.time.LocalDate;
import java.util.Date;

public class Debito extends Tarjeta {
    private Double saldoDisponible;
    private Procesador procesador = new ProcesadorDebito();

    public Debito(int nrosFrente, int codSeg, String fechaExp, Double saldoDisponible) {
        super(nrosFrente, codSeg, fechaExp);
        this.saldoDisponible = saldoDisponible;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public void realizarCompra(Tarjeta tarjeta, Double monto) {
        procesador.procesarPago(tarjeta, monto);
    }
}
