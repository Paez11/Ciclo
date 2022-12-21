package ProductorConsumidorFichero;

public class Consumidor extends Thread{
    private Fichero f;

    public Consumidor(Fichero f) {
        this.f=f;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            f.lee();
        }
    }
}
