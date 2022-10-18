package mesas;

import java.time.LocalDate;

public class FacadeBusqueda implements IBusqueda{
    private BusquedaVuelo vuelos;
    private BusquedaHotel hoteles;

    public FacadeBusqueda(BusquedaVuelo vuelos, BusquedaHotel hoteles) {
        this.vuelos = vuelos;
        this.hoteles = hoteles;
    }

    @Override
    public String buscarViaje(String origen, String destino, LocalDate fechaSalida, LocalDate fechaRegreso) {
        Vuelo vueloEncontrado = vuelos.buscarVuelo(fechaSalida,origen,destino);
        Hotel hotelEncontrado = hoteles.buscarHotel(destino, fechaSalida, fechaRegreso);
        return "Hemos encontrado vuelo y hotel para su viaje: \n" +
                "Su vuelo: " + vueloEncontrado.toString() +"\n" +
                "Su hotel: " + hotelEncontrado.toString();
    }
}
