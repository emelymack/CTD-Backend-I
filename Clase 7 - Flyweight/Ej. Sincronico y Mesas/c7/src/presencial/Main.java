package presencial;

public class Main {
    public static void main(String[] args) {
        ComputadoraFactory fabrica= new ComputadoraFactory();
        Computadora windows1=fabrica.getComputadora(2,128);
        Computadora mac1=fabrica.getComputadora(16,500);
        Computadora windows2=fabrica.getComputadora(2,128);

        System.out.println(windows1);
        System.out.println(mac1);
        System.out.println(windows2);
        System.out.println("id original:"+windows1.getId());
        windows2.setId("nuevoID");
        System.out.println("id original:"+windows1.getId());

        for (int i=1;i<=100;i++){
            fabrica.getComputadora(16,500);
        }
        System.out.println("Computadora creadas (real):"+Computadora.getContador());
    }
}
