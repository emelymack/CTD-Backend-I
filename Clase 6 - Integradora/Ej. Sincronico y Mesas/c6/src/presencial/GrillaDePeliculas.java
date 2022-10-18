package presencial;

public class GrillaDePeliculas implements IGrillaDePeliculas{
    @Override
    public Pelicula getPelicula(String nombrePelicula) {
        // es como si vamos a buscar en la base de datos
        Pelicula pelicula=null;
        switch (nombrePelicula){
            case "Peli1":
                pelicula= new Pelicula("Peli1","Argentina",
                        "www.tuspeliculas.com/peli1");
                break;
            case "Peli2":
                pelicula= new Pelicula("Peli2","Brasil",
                        "www.tuspeliculas.com/peli2");
                break;
            case "Peli3":
                pelicula= new Pelicula("Peli3","Argentina",
                        "www.tuspeliculas.com/peli3");
                break;
            case "Peli4":
                pelicula= new Pelicula("Peli4","Colombia",
                        "www.tuspeliculas.com/peli4");
                break;
        }
        return pelicula;
    }
}
