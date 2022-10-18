package mesas;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    public static final Map<String, Arbol> bosque = new HashMap<>();

    public static Arbol plantarArbol(String tipo){
        Arbol arbol = bosque.get(tipo);

        if(arbol == null){
            if(tipo == "Ornamental") {
                arbol = new Arbol(200,400,"verde");
            } else if(tipo == "Frutal"){
                arbol = new Arbol(500,300, "rojo");
            }
            bosque.put(tipo, arbol);
            System.out.println("Nuevo árbol creado: "+ arbol.toString() +
                    ", tipo=" + tipo);
        } else {
            System.out.println("Árbol del bosque obtenido");
        }
        return arbol;
    }
}
