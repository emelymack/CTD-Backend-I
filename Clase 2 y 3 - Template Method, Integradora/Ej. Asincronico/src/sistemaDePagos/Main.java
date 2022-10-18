package sistemaDePagos;

public class Main {
    public static void main(String[] args) {
        Tarjeta debito = new Debito(123456, 123, "02/2023", 2000.);
        Tarjeta credito = new Credito(987654,987,"04/2023", 5000., 2000.);

        debito.realizarCompra(debito, 500.);
        credito.realizarCompra(credito, 4000.);
    }
}
