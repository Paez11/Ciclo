/*
Elaborar un programa que permita
 ingresar un número entero del 1 al 12 y muestre
  la tabla de multiplicar de dicho número.
 */

package bucles_for;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio45 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n=0;
		boolean valido=false;
		do {
	        try{
	        System.out.println("introduce un numero entre 1 y 12");
	        n=teclado.nextInt();
	        valido=true;
	        }catch(InputMismatchException ex){
	            System.out.println("numero no valido");
	            teclado.next();
	        }
		}while(!valido || n<=0 || n>12);
        
        for( int i=1;i<=10;i++) {
        	int n2=n*i;
        	System.out.println(n2);
        }
        teclado.close();
	}

}
