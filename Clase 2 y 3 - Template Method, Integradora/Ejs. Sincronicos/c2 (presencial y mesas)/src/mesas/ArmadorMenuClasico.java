package mesas;

public class ArmadorMenuClasico extends ArmadorDeMenu{
    @Override
    protected String armar(Menu menu) {
        return "1-Agregar comida.\n2-Cocinar comida\n";
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }
}
