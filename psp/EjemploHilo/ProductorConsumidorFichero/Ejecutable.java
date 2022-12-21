package ProductorConsumidorFichero;

import java.io.File;

public class Ejecutable {
    public static void main(String[] args) {
        Fichero f = new Fichero(new File("C:/Users/Victor/Desktop/prueba.txt"));
        Productor print = new Productor(f);
        Consumidor read = new Consumidor (f);
        read.start();
        print.start();
    }
}
