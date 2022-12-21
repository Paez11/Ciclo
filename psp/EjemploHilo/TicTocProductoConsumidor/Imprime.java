package TicTocProductoConsumidor;

public class Imprime {

    private boolean ocupado = false;

    public synchronized void imprimeToc(){
        while(!ocupado){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        ocupado = false;
        notifyAll();
        System.out.print("TOC ");
    }

    public synchronized void imprimeTic(){
        while(ocupado){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        ocupado = true;
        notifyAll();
        System.out.print("TIC ");
    }
}
