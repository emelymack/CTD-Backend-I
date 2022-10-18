package presencial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    private Sistema sistema = new Sistema();

    @Test
    public void agregarPersonasTest(){
        Persona persona1 = new Persona("Juan", 20);
        Persona persona2 = new Persona("Pedro", 25);
        Persona persona3 = new Persona("Ana", 29);
        Persona persona4 = new Persona("Luz", 48);
        Persona persona5 = new Persona("Julian", 37);

        sistema.agregarPersona(persona1);
        sistema.agregarPersona(persona2);
        sistema.agregarPersona(persona3);
        sistema.agregarPersona(persona4);
        sistema.agregarPersona(persona5);

        assertEquals(2, sistema.cantidadPersonas());
    }

}