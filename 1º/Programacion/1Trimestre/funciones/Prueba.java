import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * hello world en eclipse
 * @author victor paez
 *
 */

public class Prueba {
	/**
	 * Este es el método principal de ejecución
	 * @param args
	 */
	//1 tipo de acceso --> public, private, protected, dafault
	//2 static (opcional)
	//3 ¿Cuál es la salida del metodo?
	// int, float, boolean, char, String... void
	//4 El nombre (identificador) de la función
	//5 () son los parametros que recibe la función
	public static void main(String[] args) {
		int edad=leeEntero("dime tu edad");
		System.out.println("Tienes "+edad+" años");
		/*
		int contador=0;
		contador++;
		System.out.println(contador);
		contador=incrementa(contador);
		System.out.println(contador);
		contador=incrementa(contador);
		System.out.println(contador);
		
		System.out.println("hello world");
		for (int i=0; i<=10; i++) {
		saluda();
		}
		
		suma(7, 8);
		suma(7, 4);
		*/
	}
	public static int leeEntero(String frase) {
		int n=0;
		boolean valido=false;
		Scanner teclado = new Scanner (System.in);
		do{
            try{
                System.out.println(frase);
                n=teclado.nextInt();
                valido=true;
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido || n<0);
		
		teclado.close();
		return n;
		
	}
	
	
	public static int incrementa(int n) {
		/*
		n++;
		System.out.println(n);
		return n;
		*/
		return ++n;
	}
	/**
	 * Imprime por pantalla la suma de 2 números
	 * @param n1 primer sumando
	 * @param n2 segundo sumando
	 */
	public static void suma(int n1, int n2) {
		int suma=n1+n2;
		System.out.println("la suma es: "+suma);
	}
	public static void saluda() {
		System.out.println("hola mundo!");
	}

}
