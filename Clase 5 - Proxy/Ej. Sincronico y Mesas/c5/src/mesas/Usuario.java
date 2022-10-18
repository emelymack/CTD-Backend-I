package mesas;

public class Usuario {
    private Integer id;
    private String tipoUsuario;

    public Usuario(Integer id, String tipoUsuario) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

}
