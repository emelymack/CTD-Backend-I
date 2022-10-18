package mesas;

import presencial.*;

public class AnalistaDeCalidad {
    private Controlador inicial;
    // private Articulo articulo;

    public AnalistaDeCalidad(){
        inicial= new ControladorLote();
        Controlador peso = new ControladorPeso();
        Controlador envase = new ControladorEnvase();

        inicial.setSiguienteControlador(peso);
        peso.setSiguienteControlador(envase);
    }

    public String comprobar(Articulo art){
        return inicial.controlarArticulo(art);
    }
}
