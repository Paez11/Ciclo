package programacion.bucles;
import java.util.Scanner;
public class ejercicio32 {
    public static void main(String args[]){
        int n;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce un numero");
        n=teclado.nextInt();
        int c=n;
        if (n==0){
            System.out.println("1");
        }
        while(c>=1){
            n=n*--c;
            System.out.println(n);
        }
        teclado.close();

        /*
        do{
            n=n*--c;
        }while(c>=1);
        System.out.println(n);
        */
    }
}