package mesas;

public class ControladorEnvase extends Controlador{
    @Override
    public String controlarArticulo(Articulo articulo) {
        System.out.println("Controlando envase...");
        if(articulo.getEnvasado() == "sano" || articulo.getEnvasado() == "casi sano"){
            System.out.println("El artículo ha pasado todos los test de calidad");
            return "aceptado";
        } else {
            System.out.println("El artículo ha sido rechazado");
            return "rechazado";
        }
    }
}
