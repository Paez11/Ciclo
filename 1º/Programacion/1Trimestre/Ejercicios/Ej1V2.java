/*
 * Escribe un programa que pida 10 números por teclado, los almacene en un array, y a
continuación muestre esos elementos en orden inverso al que fueron introducidos
 */

package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * programa que muestra una cadena de numeros introducidos al reves
 * @author victo
 *
 */
public class Ej1V2 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		for (int i=0; i<10;i++) {
			numeros[i]=leeEntero("Introduce numero para posicion "+i+ " : ");
		}
		for (int j=9; j>=0;j--) {
			System.out.println(numeros[j]);
		}
	}
	/**
	 * lee un entero por teclado y valide el dato
	 * @param f : cadena para mostrar mensaje
	 * @return un entero con el valor recibido
	 */
	public static int leeEntero(String f) {
		int n=0;
		boolean valido=false;
		Scanner teclado = new Scanner (System.in);
		do{
			System.out.print(f);
            try{
                n=teclado.nextInt();
                valido=true;							//variable para terminar el bucle cuando el valor sea correcto
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido);
		return n;
	}


}