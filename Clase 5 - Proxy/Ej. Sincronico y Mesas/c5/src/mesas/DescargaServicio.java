package mesas;

public class DescargaServicio implements Descarga {
    @Override
    public String descargar(Usuario user, Cancion cancion) {
        return "Procediendo a la descarga de "+cancion.getNombreCancion()+"...";
    }
}
