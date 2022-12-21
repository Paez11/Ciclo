package SincronizacionProductorConsumidor;

public class Ejecutable  {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Productor p1 = new Productor(cola, 1);
        Consumidor c1 = new Consumidor(cola, 1);
        p1.start();
        c1.start();
    }
}
