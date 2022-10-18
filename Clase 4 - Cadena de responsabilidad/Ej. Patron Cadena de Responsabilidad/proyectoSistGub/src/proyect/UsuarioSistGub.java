package proyect;

public abstract class UsuarioSistGub {
    protected Integer tipoAcceso;
    protected UsuarioSistGub siguienteUsuarioGub;

    public abstract String leerDocumento(Documento doc);

    public Integer getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(Integer tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public UsuarioSistGub getSiguienteUsuarioGub() {
        return siguienteUsuarioGub;
    }

    public void setSiguienteUsuarioGub(UsuarioSistGub siguienteUsuarioGub) {
        this.siguienteUsuarioGub = siguienteUsuarioGub;
    }
}
