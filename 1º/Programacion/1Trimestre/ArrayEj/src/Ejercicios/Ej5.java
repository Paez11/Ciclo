/*
Crea un array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla
el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el
array (que tenga como parámetros los números entre los que tenga que generar), para
mostrar el contenido y la suma del array y un método privado para generar número
aleatorio (lo puedes usar para otros ejercicios).
 */


package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int lon=9;
		int[] numeros = new int[lon];
		RellenaAleatorio(numeros, 0 , 9);
		muestraArray(numeros);
		suma(numeros);
	}
	
	public static int leeEntero(String f) {
		int n=0;
		boolean valido=false;
		Scanner teclado = new Scanner (System.in);
		do{
			System.out.print(f);
            try{
                n=teclado.nextInt();
                valido=true;							//variable para terminar el bucle cuando el valor sea correcto
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido);
		return n;
	}
	private static int longitudArray(int upper, int lower) {
		int valor=0;
		int aux=0;
		if(lower>upper) {
			aux=lower;
			lower=upper;
			upper=aux;
		}
		valor=(int) (Math.random()*(upper - lower)) + lower;
		return valor;
	}
	
	/**
	 * 
	 * @param miArray array que genero entre numeros aleatorios entre dos limites
	 * @param lower inferior
	 * @param upper superior
	 */
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
	
	public static void muestraArray(int [] miArray) {
		for(int i=0; i<miArray.length;i++) {
			System.out.println(miArray[i]);
		}
	}

	public static int suma(int [] miArray) {
		int result=0;
		for (int i=0;i<miArray.length;i++) {
			result=result+miArray[i];							//result+=miArray[i];
		}
		return result;
	}
	

}
