package SincronizacionObjetos;

public class HiloEnvio extends Thread {
    private Bolsa bolsa;

    public HiloEnvio(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsa getBolsa() {
        return bolsa;
    }

    public void setBolsa(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public void run(){
        if (!bolsa.estaLlena()){
            synchronized (bolsa){
                try {
                    bolsa.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Enviando la bolsa con "+bolsa.getSize()+" productos");
    }
}
