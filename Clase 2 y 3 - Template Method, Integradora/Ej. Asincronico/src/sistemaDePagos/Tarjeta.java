package sistemaDePagos;

import java.time.LocalDate;
import java.util.Date;

public abstract class Tarjeta {
    private int nrosFrente;
    private int codSeg;
    private String fechaExp;


    public Tarjeta(int nrosFrente, int codSeg, String fechaExp) {
        this.nrosFrente = nrosFrente;
        this.codSeg = codSeg;
        this.fechaExp = fechaExp;

    }

    public abstract void realizarCompra(Tarjeta tarjeta, Double monto);

    public int getNrosFrente() {
        return nrosFrente;
    }

    public void setNrosFrente(int nrosFrente) {
        this.nrosFrente = nrosFrente;
    }

    public int getCodSeg() {
        return codSeg;
    }

    public void setCodSeg(int codSeg) {
        this.codSeg = codSeg;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

}
