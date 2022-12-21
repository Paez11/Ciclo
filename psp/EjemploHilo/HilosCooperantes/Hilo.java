package HilosCooperantes;

public class Hilo implements Runnable{

    private int numHilo;
    private int miParte;    //La cantidad que tiene que contar este hilo
    private int miCuenta=0; // Lo que lleva contado este hilo

    private final Contador cont;

    public Hilo(int numHilo, int miParte, Contador cont) {
        this.numHilo = numHilo;
        this.miParte = miParte;
        this.cont = cont;
    }

    public int getNumHilo() {
        return numHilo;
    }

    public void setNumHilo(int numHilo) {
        this.numHilo = numHilo;
    }

    public int getMiParte() {
        return miParte;
    }

    public void setMiParte(int miParte) {
        this.miParte = miParte;
    }

    public int getMiCuenta() {
        return miCuenta;
    }

    public void setMiCuenta(int miCuenta) {
        this.miCuenta = miCuenta;
    }

    public Contador getCont() {
        return cont;
    }

    public void run(){
        for (int i = 0; i < miParte; i++){
            /*
            synchronized (cont){
                this.cont.incrementa();
                miCuenta++;
            }

             */
            this.cont.incrementa();
            miCuenta++;
        }

        System.out.println("Hilo " + numHilo + " ha terminado, cuenta: " + miCuenta);
    }
}

