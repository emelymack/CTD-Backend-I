package mesas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie("The-Big-Bang-Theory");
        Serie serie2 = new Serie("Friends");
        Serie serie3 = new Serie("Breaking-Bad");
        Serie serie4 = new Serie("How-I-Met-Your-Mother");
        Serie serie5 = new Serie("Dexter");
        Serie serie6 = new Serie("The-Office");

        SerieProxy proxy = new SerieProxy(0,new SerieService());

        ArrayList<Serie> listaSeries = new ArrayList<>();

            listaSeries.add(serie1);
            listaSeries.add(serie2);
            listaSeries.add(serie3);
            listaSeries.add(serie4);
            listaSeries.add(serie5);
            listaSeries.add(serie6);

            for (int i = 0; i < 6; i++) {
                try {
                    System.out.println(proxy.getSerie(listaSeries.get(i)));
                } catch (SerieNoHabilitadaException e) {
                    System.out.println(e.getMessage());
                }
            }
    }
}


