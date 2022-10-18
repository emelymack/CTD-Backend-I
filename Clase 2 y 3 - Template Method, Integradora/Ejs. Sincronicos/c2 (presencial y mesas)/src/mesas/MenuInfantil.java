package mesas;

public class MenuInfantil extends Menu {
    private int cantidadDeJueguetes;

    public MenuInfantil(double precioBase, int cantidadDeJueguetes) {
        super(precioBase);
        this.cantidadDeJueguetes = cantidadDeJueguetes;
    }

    public int getCantidadDeJueguetes() {
        return cantidadDeJueguetes;
    }

    public void setCantidadDeJueguetes(int cantidadDeJueguetes) {
        this.cantidadDeJueguetes = cantidadDeJueguetes;
    }
}
