package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lee {
	
	public static int Entero() {
		int n=0;
		Scanner teclado = new Scanner (System.in);
		boolean valid=false;
		do {
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<0);
		return n;
	}
	
	public static double Double(double n) {
		Scanner teclado = new Scanner (System.in);
		boolean valid=false;
		do {
			try {
				n=teclado.nextDouble();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<=0);
		return n;
	}
	
	public static String String(String n) {
		Scanner teclado = new Scanner (System.in);
		boolean valid=false;
		do {
			try {
				n=teclado.next();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid);
		return n;
	}
}
