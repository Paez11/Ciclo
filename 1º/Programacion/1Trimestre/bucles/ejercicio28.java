package programacion.bucles;
import java.util.Scanner;
public class ejercicio28 {
    public static void main(String args[]){
        int n;
        int n1;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce un numero: ");
        n=teclado.nextInt();
        while(n<101){
            n1=n%2;                  //if (n%2==0) mas simple 
            if (n1==0){
            System.out.println(n);
            }
            n++;
        }

        /*
        do{
            n1=n%2;
            if (n1==0){
                System.out.println(n);
            }
            n++;
        }while(n<101);
        */
        teclado.close();
    }
}
