package mesas;

public class SerieProxy implements ISerie {
    private int cantVistas;
    private int limiteVistas = 5;
    private SerieService service;

    @Override
    public String getSerie(Serie serie) throws SerieNoHabilitadaException {
        String serieEncontrada = service.getSerie(serie);
        if(cantVistas >= limiteVistas){
            throw new SerieNoHabilitadaException("No puede ver más de 5 series por semana.");
        }
        this.setCantVistas(cantVistas+1);
        System.out.println(cantVistas);
        return serieEncontrada;
    }

    public SerieProxy(int cantVistas, SerieService service) {
        this.cantVistas = cantVistas;
        this.service = service;
    }

    public int getCantVistas() {
        return cantVistas;
    }

    public void setCantVistas(int cantVistas) {
        this.cantVistas = cantVistas;
    }
}
