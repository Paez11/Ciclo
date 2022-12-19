package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lee {
	
	public static int entero() {
		int n=0;
		boolean valid=false;
		Scanner teclado = new Scanner (System.in);
		
		do {
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}catch(Exception ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<0);
		
		return n;
	}
	
	public static double decimal() {
		double n=0;
		boolean valid=false;
		Scanner teclado = new Scanner (System.in);
		
		do {
			try {
				n=teclado.nextDouble();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}catch(Exception ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<0);
		
		return n;
	}
	
	public static int entero2() {
		int n=0;
		boolean valid=false;
		Scanner teclado = new Scanner (System.in);
		
		do {
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}catch(Exception ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<3 || n>9);
		
		return n;
	}
	
	public static int entero3() {
		int n=0;
		boolean valid=false;
		Scanner teclado = new Scanner (System.in);
		
		do {
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}catch(Exception ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<1 || n>4);
		
		return n;
	}
}
