/*
Escribe un programa que pinte por pantalla una pirámide hueca
(se debe ver únicamente el contorno hecho con asteriscos). 
La base de la pirámide debe estar formada por un número de asteriscos entre 5 y 9
*/

package bucles_for;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio52 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n=0;
        boolean valido=false;

        do{
            try{
                System.out.println("Introduce el numero de asteriscos entre 5 y 9 para la base de la piramide");
                n=teclado.nextInt();
                valido=true;
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido || n<5 || n>9);
        
        for (int i=1; i<=n; i++){               //para ordenar el numero de espacios que va a haber o (numero de filas)
            for (int j=0; j<=(n-i); j++){       //para saber donde estara el asterisco o (numero de columnas)
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){     //Para hacer la mitad derecha del triangulo se pone 2*1 para que el asterisco rellene la otra parte del triangulo y -1 para que pare a la derecha
                if (i==n || j==1 || j==(2*i-1)){    //Condicion para que rellene o deje libre el hueco de dentro y rellene la base con n asteriscos
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        } 
    }
}