/*
Escribe un programa que pida 10 números por teclado y los almacene en un array. A
continuación pide un número por teclado. El programa devolverá la posición de ese
elemento dentro del array (si existe) o un mensaje indicando que el elemento no existe
en el array.
*/


package Ejercicios;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * busca elemento escrito dentro de un array
 * @author victo
 *
 */
public class Ej2 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		boolean encontrado=false;
		System.out.println("Introduzca la cadena de numeros");
		for (int i=0; i<10;i++) {
			numeros[i]=leeEntero("Introduce numero para posicion "+i+ " : ");
		}
		int v=leeEntero("Introduce numero a buscar");
		for (int i=0; i<10 && !encontrado;i++) {
			if (numeros[i]==v){
				System.out.println(v+" Esta, en la posicion: "+i);
				//i=10;
				encontrado=true;
			}
		}
		if(!encontrado) {
			System.out.println("No esta");
		}
	}
	
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
