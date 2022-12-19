package programacion.bucles;
import java.util.Scanner;
public class ejercicio29 {
    public static void main(String args[]){
        int n1;
        int n2;
        int aux=0;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce el primer numero");
        n1=teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        n2=teclado.nextInt();
        if (n2<n1){
          n2=aux;
          n1=n2;
          aux=n1;
        }
        while (n1<n2){
          if (n1%2!=0){
            System.out.println(n1);
          }
          n1++;  
        }

        /*
        do{
          if (n1%2!=0){
            System.out.println(n1);
          }
          n1++;
        }while(n1<n2);
        */
        teclado.close();
    }
}