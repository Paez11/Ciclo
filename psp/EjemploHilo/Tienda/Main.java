package Tienda;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        Trabajador t1 = new Trabajador("Pedro",cliente1, System.currentTimeMillis());
        Trabajador t2 = new Trabajador("Antonio",cliente2, System.currentTimeMillis());

        // Tiempo inicial de referencia
        //long initialTime = System.currentTimeMillis();
        //t1.cobraProducto(cliente1, initialTime);
        //t2.cobraProducto(cliente2, initialTime);

        Thread hilo1 = new Thread(t1);
        Thread hilo2 = new Thread(t2);

        hilo1.start();
        hilo2.start();


    }
}
