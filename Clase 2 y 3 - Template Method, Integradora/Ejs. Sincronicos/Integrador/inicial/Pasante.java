package inicial.inicial;

public class Pasante extends Vendedor {

    public Pasante(String nombre){
        super.nombre = nombre;
        super.PUNTOS_POR_VENTA = 5;
    }

    @Override
    public int calcularPuntos() {
        return this.ventas * PUNTOS_POR_VENTA;
    }
}
