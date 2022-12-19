package View;

public class Error {

	public static void invalidNumber() {
		System.out.println("El numero que ha introducido no es valido");
		
	}
	public static void invalidInteger() {
		System.out.println("El numero que ha introducido no es un entero");
		
	}
	
	public static void invalidString() {
		System.out.println("La cadena introducida no es valida");
	}
	
	public static void invalidDouble() {
		System.out.println("El numero que ha introducido no es decimal");
		
	}
	
	public static void invalidOption() {
		System.out.println("La opcion introducida no es valida");
	}
	
	public static void unexistend() {
		System.out.println("El alumno no se encuentra en este grupo o no existe");
	}
	
	public static void error() {
		System.out.println("No se han podido realizar los cambios");
	}
}
