/*
Escribe un programa que pida 10 números por teclado, los almacene en un array y que
luego muestre el máximo valor, el mínimo y las posiciones que ocupan en el array.
 */



package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int mayor=0;
		int menor=0;
	
		Cadena(numeros);
		
		System.out.println("El elemento mayor es "+numeros[max(numeros)]+" y esta en la posicion "+max(numeros));
		System.out.println("El elemento menor es "+numeros[min(numeros)]+ " y esta en la posicion "+min(numeros));
	}
	
	public static int leeEntero(String f) {
		int n=0;
		boolean valido=false;
		Scanner teclado = new Scanner (System.in);
		do{
			System.out.print(f);
            try{
                n=teclado.nextInt();
                valido=true;							
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido);
		return n;
	}
	
	public static void Cadena(int [] miArray) {
		System.out.println("Introduzca la cadena de numeros");
		for (int i=0; i<miArray.length;i++) {
			try {
				miArray[i]=pideValor(i);
			} catch (Exception e) {
				i--;
				System.out.println(e);
			}
			
		}
	}
	
	public static int max(int [] miArray) {
		int pos=-1, a=-1;
		for (int i=0; i<miArray.length;i++) {
			
			if (miArray[i]>a) {
				a=miArray[i];
				pos=i;
			}
		}
		return pos;
	}
	
	public static int min(int [] miArray) {
		int a=miArray[0];
		int pos=0;
		for (int i=0; i<miArray.length;i++) {
			
			if (miArray[i]<a) {	
				a=miArray[i];
				pos=i;
			}
		}
		return pos;
	}
	
	public static int pideValor(int i) throws Exception{
		int valor=-1;
		valor=leeEntero("Introduce numero para posicion "+i+ " : ");
		if (valor<0) {
			throw new Exception("Error numero negativo");
		}
		return valor;
	}
	
}
