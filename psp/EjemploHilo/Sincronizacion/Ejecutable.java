package Sincronizacion;

public class Ejecutable {
    public static void main(String[] args) {
        SincronizacionBasica hilo1 = new SincronizacionBasica();
        SincronizacionBasica2 hilo2 = new SincronizacionBasica2();
        Thread m1 = new Thread(hilo1);
        Thread m2 = new Thread(hilo2);
        m1.start();
        m2.start();
    }
}
