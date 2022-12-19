/*
Codificar el juego “Número Secreto” que consiste en acertar un número entre 1 y 100
 (generado aleatoriamente, int numSecreto= (int) (Math.random()*100+1) ).
Para ello se introduce por teclado una serie de números, para cada uno se indica si es
 mayor o menor que el número secreto. El juego finaliza cuando el usuario acierte o se rinda
(se entiende que se ha rendido cuando introduce -1).
*/

package programacion.bucles;
import java.util.Scanner;
public class ejercicio37_2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int numSecreto= (int) (Math.random()*100+1);
        int num1=0;
        int num2=0;
        int num3=0;

        while(num1!=numSecreto || num2!=numSecreto || num3!=numSecreto){
            System.out.println("Intenta adivinar el número entre 1 y 100");
            System.out.println("Introduce -1 para rendirte");

            System.out.print("Introduce el primer número: ");
            num1= teclado.nextInt();
            if(num1==-1){
            System.out.println("La proxima vez");
            break;
            }
        

            System.out.print("Introduce el segundo número: ");
            num2= teclado.nextInt();
            if(num2==-1){
                System.out.println("La proxima vez");
                break;
            }

            System.out.print("Introduce el tercer número: ");
            num3= teclado.nextInt();
            if(num3==-1){
                System.out.println("La proxima vez");
                break;
            }

            if (num1<=100 && num1>=1 && num2<=100 && num2>=1 && num3<=100 && num3>=1){
                if(num1<numSecreto){
                    System.out.println("El número secreto es más grande que: "+num1);
                }else{
                    System.out.println("El número secreto es más pequeño que: "+num1);
                }
                if(num2<numSecreto){
                    System.out.println("El número secreto es más grande que: "+num2);
                }else{
                    System.out.println("El número secreto es más pequeño que: "+num2);
                }
                if(num3<numSecreto){
                    System.out.println("El número secreto es más grande que: "+num3);
                }else{
                    System.out.println("El número secreto es más pequeño que: "+num3);
                }
            }else{
                System.out.println("No esta entre 1 y 100");
            }
            if (num1==numSecreto || num2==numSecreto || num3==numSecreto){
                System.out.println("Felicidades");
                break;
            }
        }
        teclado.close();
    }
}
