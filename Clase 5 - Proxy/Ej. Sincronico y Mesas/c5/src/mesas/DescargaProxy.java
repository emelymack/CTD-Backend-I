package mesas;

public class DescargaProxy implements Descarga {
    private DescargaServicio servicioSpotify;

    @Override
    public String descargar(Usuario user, Cancion cancion) {
        servicioSpotify = new DescargaServicio();
        return puedeDescargar(user) ? servicioSpotify.descargar(user, cancion) :  "El usuario no está habilitado a realizar descargas. Cambie su plan a 'PREMIUM'";
    }

    private boolean puedeDescargar(Usuario user){ return user.getTipoUsuario() == "PREMIUM"; }
}
