package presencial;

public class Computadora {
    private int ram;
    private int disco;
    private String id;
    private static int contador;

    public Computadora(int ram, int disco){
        this.ram=ram;
        this.disco=disco;
        id=ram+"-"+disco;
        contador++;
        System.out.println("Valor del contador actual: "+contador);
    }

    @Override
    public String toString(){
        return "Computadora[ram:"+ram+", disco:"+disco+"]";
    }

    public int getRam() {
        return ram;
    }

    public int getDisco() {
        return disco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }
}
