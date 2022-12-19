package Controlador;

import Modelo.Guerrero;
import Modelo.Mago;
import Modelo.Partida;
import Modelo.Personaje;
import Utils.Lee;
import Vistas.Imprimir;
import Vistas.Menus;

public class Controlador {

	public static void Juego() {
		
		Guerrero p1 = new Guerrero("Spike",100,70,5,40,100);
		Mago p2 = new Mago("Malko",100,74,6,20,100);
		Guerrero p3 = new Guerrero("Boxhot",100,60,8,10,100);
		Mago p4 = new Mago("Wanda",100,20,10,20,100);
		Guerrero p5 = new Guerrero("Shoto",100,25,7,50,100);
		Mago p6 = new Mago("????",100,90,2,18,100); 
		
		Personaje [] luchadores = new Personaje [6];
		
		
		luchadores[0] = p1;
		luchadores[1] = p2;
		luchadores[2] = p3;
		luchadores[3] = p4;
		luchadores[4] = p5;
		luchadores[5] = p6;
		
		
		Imprimir.inicio();
		Imprimir.pausa();
		
		Partida.Principal(luchadores);
		
		Imprimir.salir();
	}

	
}
