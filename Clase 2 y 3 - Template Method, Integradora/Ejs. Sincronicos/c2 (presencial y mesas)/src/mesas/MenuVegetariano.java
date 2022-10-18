package mesas;

public class MenuVegetariano extends Menu{
    private int cantidadDeSalsas;

    public MenuVegetariano(double precioBase, int cantidadDeSalsas) {
        super(precioBase);
        this.cantidadDeSalsas = cantidadDeSalsas;
    }

    public int getCantidadDeSalsas() {
        return cantidadDeSalsas;
    }

    public void setCantidadDeSalsas(int cantidadDeSalsas) {
        this.cantidadDeSalsas = cantidadDeSalsas;
    }
}
