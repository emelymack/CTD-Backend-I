package mesas;

public class SerieService implements ISerie {
    @Override
    public String getSerie(Serie serie) {
        return "www.seriesGratis.com/"+serie.getNombre();
    }
}
