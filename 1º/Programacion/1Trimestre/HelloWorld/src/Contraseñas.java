
import java.util.Scanner;

public class Contraseñas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num=0, num2=0;
		System.out.println("¿Cuantas contraseñas quieres generar?");
		num=teclado.nextInt();
		System.out.println("¿Que longuitud de caracteres?");
		num2=teclado.nextInt();
		for(int j=0; j<num; j++) {
			for (int i=0; i<num2; i++) {
				System.out.print((char)(Math.random()*(122-48+1)+48));
			}
			System.out.println();
		}
		teclado.close();
		

	}
}
