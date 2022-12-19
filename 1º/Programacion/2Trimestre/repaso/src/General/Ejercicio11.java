/*
Implementa una función que reciba un array de enteros y lo ordene. Realiza un
programa principal que pruebe esta función.
 */

package General;

import Utils.lee;

public class Ejercicio11 {

	public static void main(String[] args) {
		int [] Array = new int [4];
		rellenaArray(Array);
		muestraArray(Array);
		System.out.println();
		arrayOrdenado(Array);
		muestraArray(Array);
	}
	
	public static int[] arrayOrdenado(int[]array) {
		int [] ordenado = new int [array.length];
		int aux=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=(i+1);j<array.length;j++) {
				if(array[i]>array[j]) {
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		
		return array;
	}
	
	public static void rellenaArray(int[]array) {
		for (int i=0;i<array.length;i++) {
			System.out.println("Introduce nº para "+i+" :");
			array[i]=lee.entero();
		}
	}
	
	public static void muestraArray(int[]array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
}
