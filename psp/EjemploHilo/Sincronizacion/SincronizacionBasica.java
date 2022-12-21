package Sincronizacion;

public class SincronizacionBasica implements Runnable{

    private static boolean valid=false;
    public synchronized void metodo1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Cuenta metodo 1: "+i);
            if (i==6){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        //this.notify();
    }

    @Override
    public void run() {
        if (!valid){
            valid=true;
            metodo1();
        }
    }
}
