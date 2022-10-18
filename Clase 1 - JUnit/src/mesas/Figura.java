package mesas;

public class Figura {
    private String nombre;

    /*public Double calcularArea(Double multiplicador){
        Double multiplicadorPow = Math.pow(multiplicador, 2);

        if(multiplicador <= 0){
            System.out.println("El valor del radio o lado debe ser  mayor que cero.");
            return 0.;
        }

        if(nombre == "círculo"){
            Double resultArea = Math.PI * multiplicadorPow;
            System.out.println("El área del "+nombre+" es "+resultArea);
            return resultArea;

        } else if(nombre == "cuadrado"){
            System.out.println("El área del "+nombre+" es "+multiplicadorPow);
            return multiplicadorPow;

        } else {
            System.out.println("No es posible realizar el cálculo. La figura debe ser un círculo o un cuadrado");
            return 0.;
        }
    }*/

    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
