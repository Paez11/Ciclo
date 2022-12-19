package General;

import java.util.Scanner;

public class ExamenArray {

	public static void main(String[] args) {
		int [] miArray = {5,6,7,8,9};
		Scanner teclado = new Scanner (System.in);
		System.out.println("Primera posicion");
		int p1=teclado.nextInt();
		System.out.println("Segunda posicion");
		int p2=teclado.nextInt();
		int[] ArrayVacio= new int [5];
		ArrayVacio=SubArray(miArray, ArrayVacio, p1, p2);
		for (int i = 0; i < ArrayVacio.length; i++) {
			if (ArrayVacio[i]!=0)
			System.out.print("["+ArrayVacio[i]+","+"]");
		}

	}
	
	public static int [] SubArray(int [] Array, int[]Array2, int p1, int p2) {
		int n=0;
			for(int j=0;j<Array.length;j++) {
				if (j>=p1 && j<=p2 ) {
					Array2[n]=Array[j];
					n++;
				}
		}
		
		
		return Array2;
	}
}
