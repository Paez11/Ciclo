package Sincronizacion;

public class SincronizacionBasica2 implements Runnable{

    @Override
    public void run() {
        metodo2();
    }

    public synchronized void metodo2(){
        for (int i = 200; i < 220; i++) {
            System.out.println("Cuenta metodo 2: "+i);
        }
        //this.notify();
        this.notifyAll();
    }


}
