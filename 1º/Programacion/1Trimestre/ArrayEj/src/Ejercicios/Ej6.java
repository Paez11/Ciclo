/*
Escribe un programa que genere 50 números enteros aleatorios entre 0 y 99 y los
almacene en un array. El programa debe crear un nuevo array con los números primos
que haya entre esos 20 números. Luego debe mostrar los dos arrays. Utiliza funciones.
 */


package Ejercicios;

public class Ej6 {

	public static void main(String[] args) {
		int [] numeros= new int [10];
		RellenaAleatorio(numeros, 0, 99);
		muestraArray(numeros);
		int nPrimos=cuentaPrimos(numeros);
		int []primos=new int[nPrimos];
		rellenaPrimos(numeros, primos);
		muestraArray(primos);
	}
	
	public static void RellenaAleatorio(int [] miArray, int lower, int upper) {
		int aux=0;
		if(lower>upper) {
			aux=lower;
			lower=upper;
			upper=aux;
		}
		for (int i=0; i<miArray.length;i++) {
			miArray[i]=(int) (Math.random() * (upper - lower)) + lower;
		}
	}
	
	public static boolean primo(int n) {
		int i=1;
		boolean primo=true;
		while (i<n) {
			i++;
			if((n%i)==0) {
				primo=false;
				i=n;
			}
		}
		return primo;
	}
	
	public static int cuentaPrimos(int [] miArray) {
		int cont=0;
		for (int i=0;i<miArray.length;i++) {
			if (primo(miArray[i])) {
				cont++;
			}
		}
		return cont;
	}
	public static void rellenaPrimos(int [] miArray, int[] primos) {
		int i=0;
		for (int e:miArray) {
			if(primo(e)) {
				primos[i]=e;
				i++;
			}
		}
	}
	
	public static void muestraArray(int [] miArray) {
		for(int i=0; i<miArray.length;i++) {
			System.out.print(miArray[i]+" ");
		}
		System.out.println();
	}
	
}
