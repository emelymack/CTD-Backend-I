package inicial.inicial;

/*
Una empresa de ventas digitales nos pide modificar el modelado de su sistema.
El sistema permite clasificar a los Vendedores en base al cumplimiento de ciertos requisitos.
Se debe considerar los siguientes aspectos;

Para cada Empleado o Afiliado devolverá una categoría según su rendimiento
de ventas: novato, aprendiz, bueno, maestro.

Los Vendedores suman puntos positivos según alcancen ciertos objetivos.

El objetivo de los Empleados es conseguir Afiliados y hacer Ventas,
conseguirán 10 puntos por cada nuevo afiliado, 5 puntos por cada venta que realicen y 5 puntos extra por cada anio de antiguedad que posean.

El objetivo de los Afiliados es hacer ventas, conseguirán 15 puntos por cada
nueva venta.

Los Vendedores se categorizan de la siguiente manera:

Menos de 20 puntos = novatos.
Entre 20 y 30 puntos = aprendices.
Entre 31 y 40 puntos = buenos.
Más de 40 puntos = maestros.
--------------------------------------------------------------
EXTRA!!
Se nos solicita crear un tercer tipo de vendedor llamado Pasante, los Pasantes se categorizan según los siguientes aspectos:

El objetivo de los Pasantes es hacer ventas, por cada venta reciben 5 puntos.

Los pasantes categorizaran de la siguiente manera:

Menos de 50 puntos = pasante novato.
50 puntos o mas = pasante experimentado.
-------------------------------------------------------------

EJEMPLOS DE SALIDA:
“Juan tiene un total de 22 puntos, categoriza como aprendiz.”
“Pedro tiene un total de 9 puntos, categoriza como novato.”
“Mauricio tiene un total de 55 puntos, categoriza como pasante experimentado.”

*/
//validacion que use propiedades de las subclases solamente!!
//Clase abstracta Vendedor, aqui va el metodo TEMPLATE
public abstract class Vendedor {
    protected String nombre;
    protected int ventas = 0;
    protected int PUNTOS_POR_VENTA;

    public void vender(int cantVentas){
        this.ventas += cantVentas;
    }

    public abstract int calcularPuntos();

    public String mostrarCategoria(){
        return this.nombre + " tiene un total de "+this.calcularPuntos()+" puntos, " +
                "categoriza como "+this.getNombreCategoria();
    }

    /*Recibe los puntos, y devuelve una categorizacion*/
    public String getNombreCategoria(){
        int puntos = this.calcularPuntos();

        if(this instanceof Pasante){
            if(puntos < 50){
                return "pasante novato";
            } else {
                return "pasante experimentado";
            }
        }
        if(puntos < 20){
            return "novato";
        } else if(puntos <= 30){
            return "aprendiz";
        } else if(puntos <= 40){
            return "bueno";
        } else {
            return "maestro";
        }
    }
}
