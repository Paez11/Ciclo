package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import view.Error;

public class Read {

	public static int integrer() {
		int n=0;
		Scanner teclado = new Scanner (System.in);
		boolean valid=false;
		do {
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				Error.invalidInteger();
				teclado.next();
			}
		}while(!valid || n<0);
		
		return n;
	}
	
	public static float Float() {
		Float n=0f;
		Scanner teclado = new Scanner (System.in);
		boolean valid=false;
		do {
			try {
				n=teclado.nextFloat();
				valid=true;
			}catch(InputMismatchException ex) {
				Error.invalidDouble();
				teclado.next();
			}
		}while(!valid || n<=0);
		return n;
	}
	
	public static String String() {
		String n="";
		Scanner teclado = new Scanner (System.in);
		boolean valid=false;
		do {
			try {
				n=teclado.next();
				valid=true;
			}catch(InputMismatchException ex) {
				Error.invalidString();
				teclado.next();
			}
		}while(!valid);
		
		return n;
	}
}
