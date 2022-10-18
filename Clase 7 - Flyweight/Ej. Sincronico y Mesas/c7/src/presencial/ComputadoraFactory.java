package presencial;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private static Map<String,Computadora> computadorasLigeras= new HashMap<>();

    public Computadora getComputadora(int ram, int disco){
        //definir la key para esta computadora
        String clave= "key:"+ram+":"+disco;
        //adicional
        System.out.println("clave creada: "+clave);

        //verificar si está creada o no
        //preguntamos si esta en el mapa
        if (!computadorasLigeras.containsKey(clave)){
            //la compu no está, tenemos que crearla
            //agregar dicha compu al map
            computadorasLigeras.put(clave, new Computadora(ram, disco));
            System.out.println("Computadora creada");
            return computadorasLigeras.get(clave);
        }else {
            System.out.println("Computadora ligera obtenida");
            return computadorasLigeras.get(clave);
        }
        //devolver el objeto correspondiente

    }
}
