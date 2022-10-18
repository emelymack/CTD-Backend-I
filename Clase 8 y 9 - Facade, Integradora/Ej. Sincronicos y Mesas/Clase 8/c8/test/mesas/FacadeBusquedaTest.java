package mesas;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FacadeBusquedaTest {

    @Test
    public void buscarViajeTest(){
        List<Vuelo> vuelos = new ArrayList<>();
        List<Hotel> hoteles = new ArrayList<>();
        FacadeBusqueda facade = new FacadeBusqueda(new BusquedaVuelo(vuelos), new BusquedaHotel(hoteles));
        LocalDate fecha1 = LocalDate.parse("2022-05-29");
        LocalDate fecha2 = LocalDate.parse("2022-06-09");

        Hotel hotelNY = new Hotel("New York");
        hotelNY.setFechaEntrada(fecha1);
        hotelNY.setFechaSalida(fecha2);

        hoteles.add(hotelNY);



        Vuelo vueloBAaNY = new Vuelo("Buenos Aires", "New York", fecha1);
        vuelos.add(vueloBAaNY);

        String respuestaEsperada = "";
        String respuestaActual = facade.buscarViaje("Buenos Aires", "New York", fecha1, fecha2);

        assertEquals(respuestaEsperada, respuestaActual);
    }
}