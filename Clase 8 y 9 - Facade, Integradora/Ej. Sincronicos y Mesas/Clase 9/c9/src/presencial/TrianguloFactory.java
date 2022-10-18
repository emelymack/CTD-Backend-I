package presencial;

import java.util.HashMap;
import java.util.Map;

public class TrianguloFactory {
    private static Map<String,Triangulo> trianguloMap= new HashMap<>();

    public static Triangulo getTriangulo(String color, int tam){
        //tenemos que crear un nuevo triangulo en el caso de que
        //sea de un color diferente;
        //mi clave en este caso el es color
        //verificar si el color existe en el mapa
        Triangulo triangulo=trianguloMap.get(color);
        if(triangulo==null){
            //no existe, tenemos que agregar un triangulo
            triangulo=new Triangulo(color,tam);
            //falta incorporar el triangulo
            trianguloMap.put(color,triangulo);
        }
        return triangulo;
    }
}
