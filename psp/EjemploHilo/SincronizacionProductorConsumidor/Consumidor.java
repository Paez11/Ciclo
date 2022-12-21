package SincronizacionProductorConsumidor;

public class Consumidor extends Thread{
    private Cola cola;
    private int numero;

    public Consumidor(){

    }

    public Consumidor(Cola c, int n){
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
        int valor = 0;
        for (int i = 0; i < 5; i++){
            valor = cola.get();
            System.out.println("Consumidor " + numero + " consume " + valor);
        }
    }
}
