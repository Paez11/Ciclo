/*
Realizar un programa que muestre las tablas de multiplicar de los 12 primeros números.
 */

package bucles_for;

public class ejercicio49 {

	public static void main(String[] args) {
		for(int i=1;i<=12;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}
