package mesas;

import java.time.LocalDate;

public class Hotel {
    private String ciudad;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Hotel(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Hotel {" +
                "ciudad='" + ciudad + '\'' +
                ", fecha de entrada=" + fechaEntrada +
                ", fecha de salida=" + fechaSalida +
                '}';
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
