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
public class Ej2V2 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Cadena(numeros);
		int v=leeEntero("Introduce numero a buscar");
		int pos=buscador(v, numeros);
		if(pos==-1) {
			System.out.println("no se ha encontrado");
		}else {
			System.out.println("esta en la posicion"+pos);
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
	/**
	 * Para rellenar un array por teclado
	 * @param miArray
	 */
	public static void Cadena(int [] miArray) {
		System.out.println("Introduzca la cadena de numeros");
		for (int i=0; i<miArray.length;i++) {
			miArray[i]=leeEntero("Introduce numero para posicion "+i+ " : ");
		}
	}
	/**
	 * para buscar el numero introducido en el array
	 * @param a numero pedido
	 * @param miArray cadena
	 * @return
	 */
	public static int buscador(int a, int [] miArray) {
		for (int i=0; i<miArray.length;i++) {
			if(miArray[i]==a) {
				return i;
			}
		}
		return -1;
	}
}