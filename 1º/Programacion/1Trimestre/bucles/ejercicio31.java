package programacion.bucles;
import java.util.Scanner;
public class ejercicio31 {
    public static void main(String args[]){
        int num;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce un numero");
        num=teclado.nextInt();

        while (num<0){
            System.out.println(num++);
        }
        while (num>0){
            System.out.println(num--);
        }

        /*
        do{
            System.out.println(num++);
        }while(num<0);
        do{
            System.out.println(num--);
        }while(num>0);
        */
        teclado.close();
    }
}