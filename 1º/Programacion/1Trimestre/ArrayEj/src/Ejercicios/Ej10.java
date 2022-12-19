/*
Implementa la función: int [] suma(int []t, int nElem), que cree y devuelva un array con
las sumas de los nElem elementos consegutivos del array t. Mira este ejemplo:
t={8,7,9,3,4,11,2}
nElem=3
solución:
8+7+9=24
7+9+3=19
9+3+4=16
3+4+11=18
4+11+2=17
La función devolverá un array con el contenido {24,19,16,18,17}
 */


package Ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ej10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int i=0;
		int lon=0;
		try {
			lon = pideValor(i);
		} catch (Exception e) {
			System.out.println(e);
		}
		int [] Array1 = new int [lon];
		suma(Array1, 3);
		System.out.println(Array1);
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
		}while(!valid || n<=0);
		return n;
	}
	
	public static int pideValor(int i) throws Exception {
		int valor=-1;
		valor=leeEntero("introduce la longitud del array");
		if(valor<=0) {
			throw new Exception("Error,numero negativo");
		}
		return valor;
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
	
	public static int [] suma(int []t, int nElem) {
		rellenaAleatorio(t,1,100);
		int suma=0;
		int lon=t.length;
		int []sumaArray = new int [lon] ;
		for (int i=0;i<n.Elem;i++) {
				suma+=t[i];
				for(int j=0;j<sumaArray.length;j++) {
					sumaArray[j]=suma;
				}
				System.out.println(suma);
		}
		return sumaArray;
	}

}
