package mesas;

public class ArmadorMenuVegetariano extends ArmadorDeMenu{
    @Override
    protected String armar(Menu menu) {
        return "1-Agregar especias\n2-Agregar salsas\n3-Agregar comida";
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        double resp=0;
        if (menu instanceof MenuVegetariano){
            double recargos=(menu.getPrecioBase()*0.01)+(((MenuVegetariano)menu).getCantidadDeSalsas()*2);
            resp=menu.getPrecioBase()+recargos;
        }
        return resp;
    }
}
