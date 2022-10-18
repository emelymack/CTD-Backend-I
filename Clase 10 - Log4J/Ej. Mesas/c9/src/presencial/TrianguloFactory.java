package presencial;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class TrianguloFactory {
    private static Map<String,Triangulo> trianguloMap= new HashMap<>();
    private static final Logger logger=Logger.getLogger(TrianguloFactory.class);
    public static Triangulo getTriangulo(String color, int tam){
        //tenemos que crear un nuevo triangulo en el caso de que
        //sea de un color diferente;
        //mi clave en este caso el es color
        //verificar si el color existe en el mapa
        Triangulo triangulo=trianguloMap.get(color);
        if(triangulo==null){
            //no existe, tenemos que agregar un triangulo
            triangulo=new Triangulo(color,tam);
            logger.info("Se ha creado un nuevo triangulo de color "+color);
            //falta incorporar el triangulo
            trianguloMap.put(color,triangulo);
        }
        return triangulo;
    }
}
