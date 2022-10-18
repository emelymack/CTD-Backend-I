package presencial;

public class Main{
    public static void main(String[] args) {
        IP direccion= new IP(30,25,98,14);
        GrillaDePeliculasProxy proxy= new GrillaDePeliculasProxy(direccion,new GrillaDePeliculas());
        try{
            System.out.println(proxy.getPelicula("Peli1").getLink());
        }
        catch (PeliculaNoHabilitadaException e){
            System.out.println(e);
        }

        try{
            System.out.println(proxy.getPelicula("Peli2").getLink());
        }
        catch (PeliculaNoHabilitadaException e){
            System.out.println(e);
        }

    }
}
