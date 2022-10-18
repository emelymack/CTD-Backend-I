package presencial;

public class GrillaDePeliculasProxy implements IGrillaDePeliculas{
    private IP dirIP;
    private GrillaDePeliculas grillaDePeliculas;

    public GrillaDePeliculasProxy(IP dirIP, GrillaDePeliculas grillaDePeliculas) {
        this.dirIP = dirIP;
        this.grillaDePeliculas = grillaDePeliculas;
    }

    public IP getDirIP() {
        return dirIP;
    }

    public void setDirIP(IP dirIP) {
        this.dirIP = dirIP;
    }

    public GrillaDePeliculas getGrillaDePeliculas() {
        return grillaDePeliculas;
    }

    public void setGrillaDePeliculas(GrillaDePeliculas grillaDePeliculas) {
        this.grillaDePeliculas = grillaDePeliculas;
    }

    @Override
    public Pelicula getPelicula(String nombrePelicula) throws PeliculaNoHabilitadaException {
        Pelicula peliculaEncontrada= grillaDePeliculas.getPelicula(nombrePelicula);
        // si la pelicula encontrada corresponde al pais de origen
        String paisDelaPeli=peliculaEncontrada.getPais();
        String paisDeOrigenSegunIP=dirIP.getPais();
        if(!paisDelaPeli.equals(paisDeOrigenSegunIP))
            throw new PeliculaNoHabilitadaException(nombrePelicula+
                    " no disponible en "+paisDeOrigenSegunIP);
        return peliculaEncontrada;
    }
}
