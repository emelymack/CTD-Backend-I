package presencial;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    // Métodos
    private int cantLetrasNombre(){ return nombre.length(); }

    public boolean esMayorDeEdad(){
        // al estar DENTRO de la clase, no es necesario usar el getter, se puede utilizar directamente el atributo
        // fuera de la clase, hay que usar sí o sí el getter
        // return getEdad() >= 18;
        return edad >= 18;
    }

    public boolean siNombreMayorIgual5Letras(){ return cantLetrasNombre() >= 5; }


    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void add(Persona persona) {
    }
}
