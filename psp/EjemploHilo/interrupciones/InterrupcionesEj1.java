package interrupciones;

import java.util.Scanner;

public class InterrupcionesEj1 extends Thread{

    public void run(){
        while (true){
            System.out.println("procesando");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("finalizado");
                return;
            }
        }
    }

    public static String String() {
        String x="";
        Scanner s=new Scanner(System.in);
        boolean valid=true;
        do {
            try {
                x=s.nextLine();
                valid=false;
            } catch (Exception e) {
                System.out.println("Error!!");
                s.next();
            }
        } while (valid);
        return x;
    }

    public static void main(String[] args) {
        InterrupcionesEj1 hilo = new InterrupcionesEj1();
        String cad="";
        hilo.start();

        while (hilo.isAlive()){
            cad=String();
            if (cad.equals("S")){
                hilo.interrupt();
            }
        }
    }
}
