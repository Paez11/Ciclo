/*
Desarrollar una aplicación que ayude a gestionar las notas de un colegio. Los alumnos
se encuentran organizados en grupos de 5 personas. Leer las notas (números enteros)
del primer, segundo y tercer trimestre de un grupo (cada alumno, en cada trimestre
ocupa la misma posición en el array). Debes mostrar al final la nota media del grupo en
cada trimestre y la media del alumno que se encuentra en una posición dada (que el
usuario introduce por teclado). Organiza el programa en funciones.
 */


package Ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ej9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tri1 []= new int[5];
		int tri2 []= new int[5];
		int tri3 []= new int[5];
		
		System.out.println("Notas del grupo de alumnos para el primer trimestre");
		rellenaNotas(tri1);
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Notas del grupo de alumnos para el segundo trimestre");
		rellenaNotas(tri2);
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Notas del grupo de alumnos para el tercer trimestre");
		rellenaNotas(tri3);
		System.out.println("---------------------------------------------------------");
		
		
		System.out.println("---------------------------------------------------------");
		System.out.print("Media en el primer trimestre: ");
		mediaNotas(tri1);
		System.out.print("Media en el segundo trimestre: ");
		mediaNotas(tri2);
		System.out.print("Media en el tercer trimestre: ");
		mediaNotas(tri3);
		System.out.println("---------------------------------------------------------");
		
		System.out.println("---------------------------------------------------------");
		//System.out.print("Media del alumno seleccionado: ");
		mediaAlumno(tri1, tri2, tri3);
		System.out.println("---------------------------------------------------------");
		
		
		
	}
	
	public static int leeEntero(String frase) {
		Scanner teclado = new Scanner (System.in);
		int n=0;
		boolean valid=false;
		do {
			System.out.print(frase);
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<=0 || n>10);
		return n;
	}
	
	public static void rellenaNotas(int[]grupo) {
		for(int i=0;i<grupo.length;i++) {
			grupo[i]=leeEntero("Introduzca la nota del alumno "+(i+1)+" :");
		}
	}
	
	public static int mediaNotas(int[]grupo) {
		int cont=0, media=0, suma=0;
		for(int i=0;i<grupo.length;i++) {
			suma=suma+grupo[i];
			cont++;
		}
		media=suma/cont;
		System.out.println(media);
		
		return media;
	}
		
	public static int mediaAlumno(int[]tri1,int[]tri2,int[]tri3) {
		int cont=0, suma=0, mediaA=0;
		int pos=leeEntero("Seleccione uno de los 5 alumnos: ");
		for(int i=0;i<tri1.length;i++) {
			pos=tri1[i];
			suma+=pos;
			cont++;	
		}
		for(int i=0;i<tri2.length;i++) {
			pos=tri2[i];
			suma+=pos;
			cont++;
			
		}
		for(int i=0;i<tri3.length;i++) {
			pos=tri3[i];
			suma+=pos;
			cont++;
		}

		mediaA=suma/cont;
		
		System.out.println("Esta es la media del alumno: "+mediaA);
		return pos;
	}
	

}
