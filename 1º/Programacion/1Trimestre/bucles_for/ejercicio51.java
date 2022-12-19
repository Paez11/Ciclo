/*
Desarrolle un programa que permita leer un número entero mayor a 3 y menor a 10,
 que representa la cantidad de filas y el programa imprima un triángulo con números de
  acuerdo al número de filas que se ingresa como dato. El triángulo se forma con números,
 dejando espacios en blanco al inicio de cada fila tal y como se muestra en los ejemplos:
 */

package bucles_for;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio51 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n=0;
		boolean valido=false;
		 do{
	            try{
	                System.out.println("Introduce un numero entero que sea mayor o igual que 3 y menor que 10");
	                n=teclado.nextInt();
	                valido=true;
	            }catch(InputMismatchException ex){
	                System.out.println("numero no valido");
	                teclado.next();
	            }
	        }while(!valido || n<3 || n>=10);
		 	
		 	for(int z=1;z<=n;z++) {
				for(int i=1;i<=(n-z);i++) {
			 		System.out.print(" ");
					}
				for(int j=1;j<=z;j++) {
					System.out.print(j);
				}
				for(int i=z-1;i>=1;i--) {
					System.out.print(i);
				}
				System.out.println();
		 	}

	}

}
