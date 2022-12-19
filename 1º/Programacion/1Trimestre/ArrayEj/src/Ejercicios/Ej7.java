/*
Rellenar aleatoriamente dos arrays del mismo tamaño con números entre 1 y 100 (el
tamaño se pide por teclado, y se realizará un método para rellenar aleatoriamente), y
realizar un método que reciba como argumentos los dos arrays, y devuelva otro array
que contendrá la suma de cada uno de los elementos de los dos arrays.
*/


package Ejer;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Ej7 {

	public static void main(String[] args) {
		int lon=leeEntero("Introduce la longuitud del array");
		int [] numeros1= new int[lon];
		int [] numeros2= new int[lon];
		int [] suma= new int[lon];
		rellenaAleatorio(numeros1, 1, 100);
		rellenaAleatorio(numeros2, 1, 100);
		sumaArrays(numeros1, numeros2, suma);
	}
	
	public static int leeEntero(String frase) {
		Scanner teclado = new Scanner (System.in);
		int n=0;
		boolean valid=false;
		do {
			System.out.println(frase);
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid);
		return n;
	}
	
	public static void rellenaAleatorio(int[]miArray, int upper, int lower) {
		int aux=0;
		if(lower>upper) {
			aux=lower;
			lower=upper;
			upper=aux;
		}
		for (int i=0;i<miArray.length;i++) {
			miArray[i]=(int) (Math.random() * (upper - lower)) + lower;
		}
	}
	
	public static int[] sumaArrays(int[]miArray1, int[]miArray2, int []sumaArray) {
		for (int i=0; i<sumaArray.length;i++) {
			sumaArray[i]=miArray1[i]+miArray2[i];
			System.out.print(sumaArray[i]+" ");
		}
		return sumaArray;
	}
	

}
