package TicTocProductoConsumidor;

public class Ejecutable {
    public static void main(String[] args) {
        Imprime imprime = new Imprime();
        Productor print = new Productor(imprime);
        Consumidor read = new Consumidor(imprime);
        read.start();
        print.start();
    }
}
