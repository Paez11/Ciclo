package Interfaz;

import java.util.Scanner;

public class Vista implements IVista {

	@Override
	public void mostrarMenuPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Pulse 1 para la suma");
		System.out.println("Pulse 2 para la resta");
		System.out.println("Pulse 3 para salir");
	}

	@Override
	public int leeEntero(String frase) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print(frase+ " :");
		return teclado.nextInt();
	}

	@Override
	public void muestraResultado(int resultado) {
		// TODO Auto-generated method stub
		System.out.println(resultado);
	}

}
