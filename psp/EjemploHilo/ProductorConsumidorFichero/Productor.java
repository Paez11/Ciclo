package ProductorConsumidorFichero;

import java.io.IOException;

public class Productor extends Thread{
    private Fichero f;


    public Productor(Fichero f) {
        this.f=f;

    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            String frase = "L�nea "+i;
            f.escribe(frase);
        }
    }
}
