/*
Rellenar un array de char con las 26 letras minusculas.
Hacer un bucle que termine cuando la respuesta a ¿Desea continuar? sea n
	-Pedir una posicion correcta del array
	-Concatenar en un String el caracter correspondiente a la posicion
 */


package General;


import java.util.InputMismatchException;
import java.util.Scanner;

import Utils.lee;

public class Abecedario {

	public static void main(String[] args) {
		char [] miArray = new char [26];
		
		char n1=0;
		rellenaArray(miArray);
		//System.out.println();
		//n1=pidePosicion();
		//continuar(n1, miArray);
		String cadena=formaCadena(miArray);
		System.out.println(cadena);

	}
	
	public static void rellenaArray(char []Abc) {
			for (int i=0;i<Abc.length;i++) {
				Abc[i]= (char)(i+97);
				System.out.print(Abc[i]);
			}
	}
	
	public static char pidePosicion() {
		String n="";
		char pos=0;
		System.out.println("Introduce la posicion de la letra a encontrar");
		n=leeRespuesta();
		pos=n.charAt(pos);
		System.out.println(pos);
		
		return pos;
	}
	
	public static void continuar(char n, char[]Array) {
		boolean salir=false;
		Scanner t = new Scanner (System.in);
		
		do {
			for (int i = 0; i < Array.length; i++) {
				if(n==Array[i]) {
					System.out.println("La letra "+n+" es la que estabas buscando, esta en la posicion: "+i);
				}
			}
			
			System.out.println("¿Quieres salir?, escribe false para seguir, escribe true para salir");
			salir=t.nextBoolean();
			if(salir==false)
				n=pidePosicion();
			
			
		}while(salir==false);
	}

	
//----------------------------------------------------------------------------------------------------------------------------------------------
	public static String leeRespuesta() {
		boolean valid=false;
		String n="";
		Scanner t = new Scanner (System.in);
		
		do {
			try {
				n=t.next();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				t.next();
			}catch(Exception e) {
				System.out.println("No vale");
				t.next();
			}
		}while(!valid);
		
		return n;
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------
	
	public static String formaCadena(char[]letraMins) {
		Scanner t = new Scanner (System.in);
		String cad="";
		int p=-1;
		String resp="S";
		do {
			try {
				p=validaRango();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println("¿Desea Continuar?");
			resp=t.nextLine();
		}while(resp!="N");
		return cad;
	}
	
	
	
	public static int validaRango() throws Exception {
		int valor=0;
		valor=lee.entero();
		System.out.println("Introduce valor");
		if(valor<0 || valor>25) {
			throw new Exception("Posicion fuera del rango");
		}
		
		return valor;
	}
}