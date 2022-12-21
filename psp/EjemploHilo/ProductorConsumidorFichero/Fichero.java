package ProductorConsumidorFichero;

import java.io.*;

public class Fichero {
    private File fichero;
    private Boolean ocupado = false;

    public Fichero(File fichero) {
        this.fichero = fichero;
    }
    public synchronized void escribe(String frase) {
        while (ocupado) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ocupado = true;
        notifyAll();
        FileWriter fw = null;
        try {
            fw = new FileWriter(fichero);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(frase);
            System.out.println("Escribiendo: " + frase);
            fw.close();
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  synchronized void lee() {
        while (!ocupado) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ocupado = false;
        notifyAll();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fichero));
            String linea = br.readLine();
            System.out.println("Leyendo: " + linea);
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
