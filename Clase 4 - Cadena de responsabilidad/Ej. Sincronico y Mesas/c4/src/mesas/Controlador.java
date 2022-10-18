package mesas;

public abstract class Controlador {
    private Controlador siguienteControlador;

    public abstract String controlarArticulo(Articulo articulo);

    public Controlador getSiguienteControlador() {
        return siguienteControlador;
    }

    public void setSiguienteControlador(Controlador siguienteControlador) {
        this.siguienteControlador = siguienteControlador;
    }
}
