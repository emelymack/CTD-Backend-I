package presencial;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Persona> personas;

    public Sistema(){ personas = new ArrayList<>(); }

    public void agregarPersona(Persona persona){
        if (persona.esMayorDeEdad() && persona.siNombreMayorIgual5Letras())
            personas.add(persona);
        else
            System.out.println("No se puede agregar a "+persona.getNombre());
    }

    public int cantidadPersonas(){ return personas.size(); }
}
