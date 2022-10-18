package mesas;

import java.time.LocalDate;
import java.util.List;

public class BusquedaHotel {
    private List<Hotel> hoteles;

    public BusquedaHotel(List<Hotel> hoteles){ this.hoteles = hoteles; }

    public Hotel buscarHotel(String ciudad, LocalDate fechaEntrada, LocalDate fechaSalida){
        Hotel hotel = null;
        for(Hotel h : this.hoteles){
            if(h.getCiudad().equals(ciudad) && h.getFechaEntrada().equals(fechaEntrada) && h.getFechaSalida().equals(fechaSalida)){
                hotel = h;
                System.out.println("Se ha encontrado un hotel: "+hotel);
            } else {
                System.out.println("No se han encontrado hoteles para sus requerimientos");
            }
        }
        return hotel;
    }
}
