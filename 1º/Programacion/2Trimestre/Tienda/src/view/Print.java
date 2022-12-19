package view;

import model.Store;

public class Print {
	
	public static void MainMenu() {
		System.out.println("1. Introducir producto");
		System.out.println("2. Modificar precio");
		System.out.println("3. Mostrar todos los productos");
		System.out.println("4. Eliminar producto");
		System.out.println("5. Salir");
	}
	
	public static void confirm() {
		System.out.println("Cambios realizados correctamente");
	}
	
	public static void existend() {
		System.out.println("Ya existe un producto con ese codigo");
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void showProducts(Store s) {
		System.out.println(s);
	}
}
