package mesas;

public class ControladorPeso extends Controlador {
    @Override
    public String controlarArticulo(Articulo articulo) {
        System.out.println("Controlando peso...");
        if(articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            this.getSiguienteControlador().controlarArticulo(articulo);
            return "aceptado";
        } else {
            System.out.println("El artículo fue rechazado");
            return "rechazado";
        }
    }
}
