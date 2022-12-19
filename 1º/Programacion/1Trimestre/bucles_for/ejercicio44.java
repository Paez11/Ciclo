/*
Programa que muestre los múltiplos de 3, comprendidos entre 1 y 100 (ordenados de menor a mayor)
 */

package bucles_for;

public class ejercicio44 {

	public static void main(String[] args) {
		for(int i=100;i>0;i--) {
			if (i%3==0) {
				System.out.println(i);
			}
		}

	}

}
