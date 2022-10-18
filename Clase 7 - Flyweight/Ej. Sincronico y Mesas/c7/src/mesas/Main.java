package mesas;

public class Main {
    public static void main(String[] args) {
        ArbolFactory factoryArbol = new ArbolFactory();

        for(int i=1; i<= 50000; i++){
            factoryArbol.plantarArbol("Ornamental");
        }

        for(int i=1; i<= 50000; i++){
            factoryArbol.plantarArbol("Frutal");
        }

        System.out.println(factoryArbol.bosque.size());
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() -
                runtime.freeMemory()) / (1024 * 1024));
    }
}
