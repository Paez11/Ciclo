/*
 * Escribe un programa que pida 10 números por teclado, los almacene en un array, y a
continuación muestre esos elementos en orden inverso al que fueron introducidos
 */



package Ejercicios;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[] miArray = new int[10];
		for (int j=0; j<miArray.length;j++) {
			System.out.print("Introduce un numero: ");
			miArray[j]=teclado.nextInt();
		}
			for (int i=miArray.length-1; i>=0; i--) {													
				System.out.println("elemento en la posicion "+i+" es "+miArray[i]);
			}
	}

}
