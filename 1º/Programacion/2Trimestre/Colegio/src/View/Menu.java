package View;

public class Menu {

	public static void mainMenu() {
		System.out.println("\n\t   Menu \n\tprincipal");
		System.out.println();
		System.out.println("Pulse 1 para modificar un grupo");
		System.out.println("Pulse 2 para ver un grupo" );
		System.out.println("Pulse 3 para salir");
		
	}
	
	public static void groups() {
		System.out.println("Pulse 1 para el grupo 1");
		System.out.println("Pulse 2 para el grupo 2");
	}
	
	public static void editMenu() {
		System.out.println("1 para insertar un nuevo alumno");
		System.out.println("2 para modificar la nota de un alumno");
		System.out.println("3 para eliminar a un alumno");
		System.out.println("4 para volver al menu principal");
	}
	
	public static void showMenu() {
		System.out.println("1 para mostrar todos los alumnos del grupo");
		System.out.println("2 para buscar a un alumno en el grupo");
		System.out.println("3 para mostrar la nota media del grupo");
		System.out.println("4 para mostrar la nota mas alta del grupo");
		System.out.println("5 para mostrar la nota mas baja del grupo");
		System.out.println("6 para volver al menu");
	}
}
