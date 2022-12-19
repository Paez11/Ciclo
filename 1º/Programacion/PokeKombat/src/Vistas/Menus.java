package Vistas;


import Modelo.Personaje;

public class Menus {
	

	
	public static void menuPrincipal() {
		System.out.println();
		System.out.println("\t\tMenu \n\t     Principal");
		System.out.println();
		System.out.println("Pulse 1 para jugar contra otro jugador");
		System.out.println("Pulse 2 para jugar contra la máquina");
		System.out.println("Pulse 3 para ver todos los personajes");
		System.out.println("Pulse 0 para salir");
	}
	

	
	public static void menuSelectPersonaje() {
		System.out.println("Pulsa 1 para elegir a Spike");
		System.out.println("Pulsa 2 para elegir a Malko");
		System.out.println("Pulsa 3 para elegir a Boxhot");
		System.out.println("Pulsa 4 para elegir a Wanda");
		System.out.println("Pulsa 5 para elegir a Shoto");
		System.out.println("Pulsa 6 para elegir a ????");
		System.out.println("Pulsa 0 para volver al menu");
		System.out.println();
		System.out.println("Selecciona un personaje: ");
	}
	
	public static void menuLucha() {
		System.out.println();
		System.out.println("1: Atacar                   2: defender");
		System.out.println("3: Curar                    4: huir");
	}
	

	public static void muestraPersonajes(Personaje [] luchadores) {
		for (int i = 0; i < luchadores.length; i++) {
			if(luchadores[i]==null) {
				System.out.println("luchador no disponible");
				System.out.println();
			}else {
				System.out.println(luchadores[i]);
				System.out.println();
			}

		}
	}
	
}
