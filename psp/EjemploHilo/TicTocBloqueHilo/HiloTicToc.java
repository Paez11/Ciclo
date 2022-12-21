package TicTocBloqueHilo;

public class HiloTicToc extends Thread{
    private Imprime imprime;
    private String mensaje;

    public HiloTicToc(Imprime imprime, String mensaje) {
        this.imprime = imprime;
        this.mensaje = mensaje;
    }

    public void run() {
         synchronized (imprime){
             for (int i = 0; i < 20; i++) {
                 try {
                     imprime.Print(mensaje);
                     imprime.notify();
                     imprime.wait();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
    }
}
