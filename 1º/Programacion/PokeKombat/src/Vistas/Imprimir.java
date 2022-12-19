package Vistas;

import java.util.Scanner;

import Modelo.Personaje;

public class Imprimir {
	
	public static void inicio() {
		System.out.println("\n\t\tBienvenido \n\t\t");
		System.out.println();
		logo();
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("PokeKombat es un juego de peleas por turnos.\n En este seleccionas unos de nuestros campeones que estan divididos en dos clases. \n"
				+ "Diponemos de dos modos de juego, \n uno para pelear contra otro jugador en la misma máquina y otro contra la cpu. \n"
				+ "En este modo dispondrá de dos modos de juego, normal, el \n cual reseteará tu vida para seguir jugando contra nuevos oponentes \n"
				+ "y heroico, que jugaras con la misma vida hasta \n el final. Si lo consigues obtendras una recompensa única.");
		System.out.println("----------------------------------------------------------------------------------------------------------");
	}
	public static void logo() {
		System.out.println("   ▄███████▄  ▄██████▄     ▄█   ▄█▄    ▄████████    ▄█   ▄█▄  ▄██████▄    ▄▄▄▄███▄▄▄▄   ▀█████████▄     ▄████████     ███   ");
		System.out.println("  ███    ███ ███    ███   ███ ▄███▀   ███    ███   ███ ▄███▀ ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███   ███    ███ ▀█████████▄ ");
		System.out.println("  ███    ███ ███    ███   ███▐██▀     ███    █▀    ███▐██▀   ███    ███ ███   ███   ███   ███    ███   ███    ███    ▀███▀▀██ ");
		System.out.println("  ███    ███ ███    ███  ▄█████▀     ▄███▄▄▄      ▄█████▀    ███    ███ ███   ███   ███  ▄███▄▄▄██▀    ███    ███     ███   ▀ ");
		System.out.println("▀█████████▀  ███    ███ ▀▀█████▄    ▀▀███▀▀▀     ▀▀█████▄    ███    ███ ███   ███   ███ ▀▀███▀▀▀██▄  ▀███████████     ███     ");
		System.out.println("  ███        ███    ███   ███▐██▄     ███    █▄    ███▐██▄   ███    ███ ███   ███   ███   ███    ██▄   ███    ███     ███     ");
		System.out.println("  ███        ███    ███   ███ ▀███▄   ███    ███   ███ ▀███▄ ███    ███ ███   ███   ███   ███    ███   ███    ███     ███    ");
		System.out.println(" ▄████▀       ▀██████▀    ███   ▀█▀   ██████████   ███   ▀█▀  ▀██████▀   ▀█   ███   █▀  ▄█████████▀    ███    █▀     ▄████▀   ");
		System.out.println("                          ▀                        ▀                                                                         ");
	}

	public static void introduccion() {
		System.out.println();
		System.out.println("Preparaos para luchar");
		System.out.println();
	}
	
	public static void introduccion2() {
		System.out.println();
		System.out.println("Preparate para luchar");
		System.out.println();
		System.out.println("lucharas contra: ");
	}
	
	public static void pausa() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("\n\t\tPULSA ENTER PARA SEGUIR\n");
		teclado.nextLine();
	}
	
	public static void ataque(Personaje p1,Personaje p2) {
		System.out.println();
		System.out.println(p2.getNombre()+" ha recibido un daño de: "+p1.ataqueFisico());
		System.out.println("vida restante de "+p2.getNombre()+" "+p2.getVida()+" defensa "+p2.defensaFisico());
	}
	
	public static void defensa(Personaje p1) {
		System.out.println();
		System.out.println(p1.getNombre()+ " ha realizado defensa "+p1.defensaFisico());
	}
	
	public static void curar(Personaje p1) {
		System.out.println();
		System.out.println(p1.getNombre()+" Se ha curado ");
		System.out.println("Ahora tiene "+p1.getVida());
	}
	
	public static void status(Personaje p1, int curas) {
		System.out.println();
		System.out.println(p1.getNombre()+" -->");
		System.out.println("vida: "+p1.getVida()+" defensa: " + p1.defensaFisico() + " curas: " + curas);
	}
	
	public static void sinCuras() {
		System.out.println("No te quedan curaciones");
	}
	
	public static void huir() {
		System.out.println("Has huido del combate");
	}
	
	public static void salto() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
	}
	public static void eleccion(Personaje p1) {
		System.out.println("Ha elegido a: \n"+p1);
	}
	
	public static void dificultad() {
		System.out.println("Elige la dificultad a la que desea jugar");
		System.out.println("1 para jugar en dificultad normal");
		System.out.println("2 para jugar en dificultad dificil");
		
	}
	
	
	public static void end() {
		System.out.println("\n\n\tFIN DE LA LUCHA");
	}
	
	public static void salir() {
		System.out.println("\n\n\tFIN DEL PROGRAMA");
	}
	
	public static void ganador(Personaje p1) {
		System.out.println("El ganador es "+p1.getNombre());
		System.out.println("\n\t\tVICTORIA");
	}
	
	public static void ganar(Personaje p1) {
		System.out.println("Derrotastes a "+p1.getNombre());
		System.out.println("\n\t\tVICTORIA");
	}
	public static void perder() {
		System.out.println("Te derrotaron");
		System.out.println("\n\t\tDERROTA");
	}
	
	public static void error() {
		System.out.println("error");
	}
	
	public static void completo() {
		System.out.println("Has vencido a todos los luchadores");
	}
	public static void sinluchador() {
		System.out.println("luchador no disponible o derrotado");
	}
}
