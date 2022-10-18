package mesas;

import java.time.LocalDate;
import java.util.List;

public class BusquedaVuelo {
    private List<Vuelo> vuelos;
    public BusquedaVuelo(List<Vuelo> vuelos) { this.vuelos = vuelos; }

    public Vuelo buscarVuelo(LocalDate fechaSalida, String origen, String destino){
        Vuelo vuelo = null;
        for(Vuelo v : this.vuelos){
            if(v.getOrigenVuelo().equals(origen) && v.getDestinoVuelo().equals(destino) && v.getFechaSalida().equals(fechaSalida)){
                vuelo = v;
                System.out.println("Se ha encontrado un vuelo: "+vuelo);
            } else {
                System.out.println("No se han encontrado vuelos para sus requerimientos");
            }
        }
        return vuelo;
    }
}
