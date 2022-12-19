/*
Realizar un programa que pida una serie de números, 
y muestre el mayor de los números introducidos. 
El programa finalizará al introducir 0.
*/
package programacion.bucles;
import java.util.Scanner;
public class ejercicio35 {
    public static void main(String args[]){
        int num=1;
        int max=1;
        boolean esprimero=true;

        Scanner teclado= new Scanner (System.in);
        
        while(num!=0){
            System.out.println("Introduce un número: ");
            num= teclado.nextInt();
            if (num!=0){
                if (num!=0 || esprimero){
                    if (num>max){
                    max=num;
                    }
                    esprimero=false;
                }
            }
        }
        System.out.println("el número más grande es: "+max);
        teclado.close();

        /*
        do{
            System.out.println("Introduce un número: ");
            num= teclado.nextInt();
            if (num>max || esprimero){
                max=num;
            }
            esprimero=false;

        }while(num!=0);
        */
    }   
}
