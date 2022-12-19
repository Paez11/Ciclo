/*
Codificar el juego “Número Secreto” que consiste en acertar un número entre 1 y 100
 (generado aleatoriamente, int numSecreto= (int) (Math.random()*100+1) ).
Para ello se introduce por teclado una serie de números, para cada uno se indica si es
 mayor o menor que el número secreto. El juego finaliza cuando el usuario acierte o se rinda
(se entiende que se ha rendido cuando introduce -1).
*/

package programacion.bucles;
import java.util.Scanner;
public class ejercicio37 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int numSecreto= (int) (Math.random()*100+1);
        int num=0;


        while(num!=numSecreto){                                                     //while(num!=numSecreto && num!=-1)
            System.out.println("Intenta adivinar el número entre 1 y 100");
            System.out.println("Introduce -1 para rendirte");

            System.out.print("Introduce un número: ");
            num= teclado.nextInt();


            if (num<=100 && num>=1){
                if(num<numSecreto){
                    System.out.println("El número secreto es más grande que: "+num);
                }else{
                    System.out.println("El número secreto es más pequeño que: "+num);
                }
            }else if (num==-1){
                System.out.println("La proxima vez");
                break;
            }else{
                System.out.println("No esta entre 1 y 100");
            }
            if (num==numSecreto){
                System.out.println("Felicidades");
            }
            teclado.close();
        }
    }
}
