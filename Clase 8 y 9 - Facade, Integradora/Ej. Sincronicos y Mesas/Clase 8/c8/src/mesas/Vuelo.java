package mesas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vuelo {
    private String origenVuelo;
    private String destinoVuelo;
    private LocalDate fechaSalida;


    public Vuelo(String origenVuelo, String destinoVuelo, LocalDate fechaSalida) {
        this.origenVuelo = origenVuelo;
        this.destinoVuelo = destinoVuelo;
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "origen='" + origenVuelo + '\'' +
                ", destino='" + destinoVuelo + '\'' +
                ", fecha de salida=" + fechaSalida +
                '}';
    }

    public String getOrigenVuelo() {
        return origenVuelo;
    }

    public void setOrigenVuelo(String origenVuelo) {
        this.origenVuelo = origenVuelo;
    }

    public String getDestinoVuelo() {
        return destinoVuelo;
    }

    public void setDestinoVuelo(String destinoVuelo) {
        this.destinoVuelo = destinoVuelo;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
