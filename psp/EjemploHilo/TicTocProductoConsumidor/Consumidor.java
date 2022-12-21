package TicTocProductoConsumidor;

public class Consumidor extends Thread{
    private Imprime imprime;

    public Consumidor(Imprime imprime) {
        this.imprime = imprime;
    }

    public Imprime getImprime() {
        return imprime;
    }

    public void setImprime(Imprime imprime) {
        this.imprime = imprime;
    }

    public void run(){
        for (int i = 0; i < 20; i++){
            imprime.imprimeTic();
        }
    }
}
