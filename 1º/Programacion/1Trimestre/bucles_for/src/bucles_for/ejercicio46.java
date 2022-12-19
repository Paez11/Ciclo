/*
Escriba un programa que pida un número entero mayor que cero y que escriba sus divisores.
 */

package bucles_for;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio46 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num=0;
		boolean valido=false;
		do {
	        try{
	        System.out.println("introduce un numero entero");
	        num=teclado.nextInt();
	        valido=true;
	        }catch(InputMismatchException ex){
	            System.out.println("numero no valido");
	            teclado.next();
	        }
		}while(!valido || num<=0);
        
        for( int i=1;i>0;i++) {
        	if (num%i==0) {
        		System.out.println(i);
        	}
        }
        teclado.close();
	}

}
