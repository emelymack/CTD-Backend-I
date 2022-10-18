package mesas;

import java.time.LocalDate;

public interface IBusqueda {
    String buscarViaje(String origen, String destino, LocalDate fechaIda, LocalDate fechaRegreso);
}
