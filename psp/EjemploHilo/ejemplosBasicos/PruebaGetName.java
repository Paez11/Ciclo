package ejemplosBasicos;

public class PruebaGetName extends Thread{
    public PruebaGetName(String name){
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ha terminado "+getName());
    }

    public static void main(String[] args) {
        PruebaGetName hilo1 = new PruebaGetName("hilo1");
        PruebaGetName hilo2 = new PruebaGetName("hilo2");
        hilo1.start();
        hilo2.start();
    }
}
