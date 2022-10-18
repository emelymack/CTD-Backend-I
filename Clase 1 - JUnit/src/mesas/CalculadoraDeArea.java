package mesas;

public class CalculadoraDeArea {
    public String areaCirculo(double radio){
        String resp = "El valor del radio debe ser mayor a 0.";
        // calcular el área
        if(radio > 0){
            resp = "El área del círculo es de "+ Math.PI * Math.pow(radio,2);
        }
        return resp;
    }

    public String areaCuadrado(double lado){
        String resp = "El valor del lado debe ser mayor a 0.";
        // calcular el área
        if(lado > 0){
            resp = "El área del cuadrado es de "+ Math.pow(lado,2);
        }
        return resp;
    }
}
