package ejemplosBasicos;

public class Ejercicio1Runneable implements Runnable {
    private int id;

    public Ejercicio1Runneable(int id){
        this.id = id;
    }

    public void run(){
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
            new Thread(new Ejercicio1Runneable(i)).start();
        }
        System.out.println("main terminado");
    }
}
