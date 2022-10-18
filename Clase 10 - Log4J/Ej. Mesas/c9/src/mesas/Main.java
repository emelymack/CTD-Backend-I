package mesas;

import org.apache.log4j.Logger;
import presencial.TrianguloFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Logger logger=Logger.getLogger(Main.class);

        List<Integer> listaEnteros5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> listaEnteros10 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        List<Integer> listanull = new ArrayList<>();

        int promedio5 = 0;
        int promedio10 = 0;
        for (int i =0; i<listaEnteros5.size(); i++) {
            promedio5 = promedio5 + listaEnteros5.get(i);
        }
        promedio5 = promedio5/listaEnteros5.size();

        for (int i =0; i<listaEnteros10.size(); i++) {
            promedio10 = promedio10 + listaEnteros10.get(i);
        }
        promedio10 = promedio10/listaEnteros10.size();

        if(listaEnteros5.size() > 5) {
            logger.info("La longitud de listaEnteros5 es mayor a 5");
        }
        if (listaEnteros10.size() > 10) {
            logger.info("La longitud de la listaEnteros10 es mayor a 10");
        }
        if(listanull.size() == 0) {
            logger.error("La longitud es cero");
        }

        //loguear promedio
        logger.info("El promedio de lista5 es " + promedio5);
        logger.info("El promedio de lista10 es " + promedio10);

    }
}
