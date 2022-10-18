package mesas;

public class ControladorLote extends Controlador{
    @Override
    public String controlarArticulo(Articulo articulo) {
        System.out.println("Controlando lote...");
        if(articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            this.getSiguienteControlador().controlarArticulo(articulo);
            return "aceptado";
        } else {
            System.out.println("El artículo fue rechazado");
            return "rechazado";
        }
    }
}
