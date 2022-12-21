package interrupciones;

public class interrupcionesBasico extends Thread {
    public void run(){
        int cont =0;
        while (true){
            cont++;
            System.out.println(cont);
            try {
                if (cont == 3) {
                    this.interrupt();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("Ha finalizado el hilo");
                return;
            }
        }
    }

    public static void main(String[] args) {
        interrupcionesBasico hilo = new interrupcionesBasico();
        hilo.start();
        try {
            Thread.sleep(5000);
            hilo.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
