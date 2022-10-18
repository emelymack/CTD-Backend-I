package mesas;

public class ArmadorMenuInfantil extends ArmadorDeMenu{
    @Override
    protected String armar(Menu menu) {
        return "1-Agregar adornos.\n2-Agregar comida.\n3-Cocinar comida.";
    }

    @Override
    protected double calcularPrecio(Menu menu) {
        double resp=0;
        if(menu instanceof MenuInfantil){
            resp=menu.getPrecioBase()+(3*((MenuInfantil)menu).getCantidadDeJueguetes());
        }
        return resp;
    }
}
