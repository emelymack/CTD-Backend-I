package inicial.inicial;

import java.util.ArrayList;

public class Empleado extends Vendedor {

    private int aniosAntiguedad;

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Empleado(String nombre, int aniosAntiguedad){
        super.nombre = nombre;
        super.PUNTOS_POR_VENTA = 5;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    /*agrega un afiliado al empleado, y a su vez suma los puntos*/
    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nombre+ " ahora es afiliado de "+this.nombre);
    }

    /*implementacion de metodo abstracto*/
    /*por cada anio de antiguedad obtiene 5 puntos, por cada afiliado obtiene 5*/
    @Override
    public int calcularPuntos() {
        int puntosTotal = 0;
        int puntosXAfiliado = afiliados.size() * 10;
        int puntosXAntiguedad = this.aniosAntiguedad * 5;
        int puntosXVenta = this.ventas * PUNTOS_POR_VENTA;
        puntosTotal += puntosXAfiliado + puntosXAntiguedad + puntosXVenta;

        return puntosTotal;
    }
}

