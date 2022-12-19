package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InOut {
	public static void S(String frase) {
		System.out.println(frase);
	}
	
	public static void s(String frase) {
		System.out.print(frase);
	}
	
	public static int leeEntero() {
		int n=0;
		Scanner t=new Scanner (System.in);
		try {
			n=t.nextInt();
		}catch(InputMismatchException ex) {
			t.next();
		}
		return n;
	}
	/*
	try {
		Thread.sleep(3000);
	}catch
	*/
}
