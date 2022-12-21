package SincronizacionProductorConsumidor;

public class Productor extends Thread{
    private Cola cola;
    private int numero;

    public Productor(){

    }

    public Productor(Cola c, int n){
        cola = c;
        numero = n;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void run(){
        for (int i = 0; i < 5; i++){
            cola.put(i);
            System.out.println("Productor " + numero + " produce " + i);
            try{
                sleep(100);
            }catch (InterruptedException e){
                e.getMessage();
            }
        }
    }
}
