import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Explicaciones de clase de conversion automatica en java
 * @author victor
 *
 */

public class Converion {
	/*
	public static void main(String[] args) {
		int i=9;
		double d=i; // Casting implicito: int a double
		System.out.println(i); //salida 9
		System.out.println(d); //salida 9.0
	}
	*/
	/**
	 * No se puede convertir con decimales a entero, para ello debemos de añadir las siguientes lineas de codigo
	 */
	public static void Conv() {
		double d=9.78;
		int i = (int) d; // Manual Casting: double a int
		System.out.println(i); //salida 9
		System.out.println(d); 

	}
	/*
	public static void main(String args[]) {
		byte b=42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f= 5.67f;
		double d=1234;
		
		//la expresion resultado
		double result = (f*b)+(i/c)-(d*s);
		
		//Resultado despues de todas las "promociones"
		System.out.println("resultado = "+result);
		System.out.println("Resultadodoopc = "+(f+(i/c)));
	}
	*/
	/*
	public static void main(String args[]) {
		byte b=50;
		
		//casting de tipo byte
		//mostraria error si no detallamos (byte)
		b=(byte)(b*2);
		System.out.println(b);
	}
	*/
	public static void main(String args[]) {
		double n1=12.22;
		double n2=5.44;
		n1=leeEntero("Introduce un valor real");
		n2=leeEntero("Introduce el segundo valor real");
	
		int r = (int)(n1/n2);
		System.out.println("El resultado es: "+r);
	}
	
	public static double leeEntero(String frase) {
		double n=0;
		boolean valido=false;
		Scanner teclado = new Scanner (System.in);
		do{
            try{
                System.out.println(frase);
                n=teclado.nextDouble();
                valido=true;
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido || n<0);
		
		return n;
		
	}


}
