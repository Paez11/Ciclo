package ejemplosBasicos;

public class Ejercicio1Extends extends Thread {
    private int id;

    public Ejercicio1Extends(int id) {
        this.id = id;
    }

    public void run() {
        while (true) {
            System.out.println("proceso hilo " + id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            new Ejercicio1Extends(i).start();
        }
        System.out.println("main terminado");
    }
}
