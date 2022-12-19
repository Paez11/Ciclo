/*
Realizar un algoritmo que muestre la siguiente gráfica
 */

package bucles_for;

public class ejercicio50 {

	public static void main(String[] args) {
		for(int i=9;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
