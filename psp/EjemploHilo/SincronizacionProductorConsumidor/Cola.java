package SincronizacionProductorConsumidor;

public class Cola {
    private int numero;
    private Boolean disponible = false; //inicialmente la cola esta vacia

    public synchronized int get(){
        while(!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        disponible = false;
        notifyAll();
        return numero;
    }

    public synchronized void put (int valor){
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        numero = valor; // poner el valor en la cola
        disponible = true; // informar si la cola esta llena
        notifyAll();

    }

}
