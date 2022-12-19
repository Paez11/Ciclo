package Modelo;

import java.util.Arrays;
import java.util.Random;

import Utils.Lee;
import Vistas.Dibujos;
import Vistas.Imprimir;
import Vistas.Menus;

public class Partida {
	private Personaje [] luchadores;
	static Personaje player1;
	static Personaje player2;
	static Personaje cpu;

	/**
	 * Metodo el cual funcionara como un menu principal que mostrara por pantalla al usuario las posibilidades del juego
	 * @param luchadores: recibira el array de personajes que se haya creado en el controlador
	 */
	public static void Principal(Personaje[] luchadores) {
		int op=-1;
		do {
			Menus.menuPrincipal();
			op=Lee.Entero();
			
			switch(op) {
				case 1:
					seleccionarPersonajePlayer1(luchadores);
					if(player1!=null) {
						seleccionarPersonajePlayer2(luchadores);
						if(player2!=null) {
							lucha();
						}
					}
					break;
				case 2:
					seleccionarPersonajePlayer1(luchadores);
					if(player1!=null) {
						lucha(luchadores);
					}
					break;
				case 3:
					Imprimir.salto();
					Menus.muestraPersonajes(luchadores);
					Imprimir.pausa();
					break;
				case 0:
					break;
			}
		}while(op>0);
	}

	
	/**
	 * Metodo para seleccionar uno de los personajes dentro del array de personajes, al seleccionarlo este 
	 * no se podrá volver a seleccionar
	 * @param luchadores: Recibe el array de personajes entre los que se podrá elegir
	 * @return devuelve la eleccion del usuario
	 */
	public static int seleccionarPersonajePlayer1(Personaje [] luchadores) {
		
		int eleccion=0;
		Menus.muestraPersonajes(luchadores);
		Menus.menuSelectPersonaje();
		do {
			eleccion=Lee.Entero();
			switch (eleccion) {
			case 0:
				break;
			case 1:
				player1=luchadores [0];
				luchadores[0]=null;
				break;
			case 2:
				player1=luchadores [1];
				luchadores[1]=null;
				break;
			case 3:
				player1=luchadores [2];
				luchadores[2]=null;
				break;
			case 4:
				player1=luchadores [3];
				luchadores[3]=null;
				break;
			case 5:
				player1=luchadores [4];
				luchadores[4]=null;
				break;
			case 6:
				player1=luchadores [5];
				luchadores[5]=null;
				break;
			default:
				Imprimir.error();
				break;
			}
		}while(eleccion>6);
			
		if(eleccion!=0) {
			Imprimir.eleccion(player1);
			Imprimir.pausa();
		}
		
		return eleccion;

	}
	/**
	 * Mismo metodo que seleccionarPersonajePlayer1 pero para otro jugador en el caso de que se quiera
	 * jugar usuario vs usuario
	 * @param luchadores: Recibe el array de personajes los cuales puede elegir
	 * @return devuelve la eleccion del segundo usuario
	 */
	public static int seleccionarPersonajePlayer2(Personaje [] luchadores) {
		
		int eleccion=0;
		Menus.muestraPersonajes(luchadores);
		Menus.menuSelectPersonaje();
		do {
			eleccion=Lee.Entero();
			switch (eleccion) {
			case 0:
				break;
			case 1:
				player2=luchadores [0];
				luchadores[0]=null;
				break;
			case 2:
				player2=luchadores [1];
				luchadores[1]=null;
				break;
			case 3:
				player2=luchadores [2];
				luchadores[2]=null;
				break;
			case 4:
				player2=luchadores [3];
				luchadores[3]=null;
				break;
			case 5:
				player2=luchadores [4];
				luchadores[4]=null;
				break;
			case 6:
				player2=luchadores [5];
				luchadores[5]=null;
				break;
			default:
				Imprimir.error();
				break;
			}
		}while(eleccion>6);

		if(eleccion!=0) {
			Imprimir.eleccion(player2);
			Imprimir.pausa();
		}

		
		return eleccion;
	}
	
	/**
	 * Metodo para que la CPU eliga aleatoriamente uno de los personajes disponibles en el caso de que el usuario
	 * quiera jugar contra la máquina
	 * @param luchadores: Recibe el array de personajes disponibles
	 * @return devuelve la eleccion de la cpu
	 */
	public static int seleccionarCPU(Personaje [] luchadores) {
		Random rand = new Random(System.nanoTime());
		

		for (int i = 0; i < luchadores.length; i++) {
			if (luchadores[i]!=null) {
				cpu=luchadores[rand.nextInt(luchadores.length)];
				i=luchadores.length;
			}else {
				Imprimir.sinluchador();
			}
		}
		
		for (int i = 0; i < luchadores.length; i++) {
			if (cpu==luchadores[i]) {
				luchadores[i]=null;
			}
		}
		return rand.nextInt(luchadores.length);
	}
	
	/**
	 * Metodo el en el cual se desarrollara toda la lucha en el caso de usuario vs usuario 
	 */
	public static void lucha() {
		
		int opcion=0;
		int opcion2=0;
		int recuperacion=60;
		int curas=2;
		int curas2=2;
		
		if(player1!=null && player2!=null) {
			Imprimir.introduccion();
			Imprimir.pausa();
		
		
			do {
				
				do {
					Menus.menuLucha();
					opcion=Lee.Entero();
					
					switch (opcion) {
						case 1:
							player2.dano(player1.ataqueFisico());
							Dibujos.atacar();
							Imprimir.ataque(player1, player2);
							
							break;
						case 2:
							player1.defender(player1.defensaFisico());
							Dibujos.defender();
							Imprimir.defensa(player1);
							break;
						case 3:
							if(curas>0) {
								player1.curar(recuperacion);
								curas=curas-1;
								Dibujos.curar();
								Imprimir.curar(player1);
							}else {
								Imprimir.sinCuras();
							}
							break;
						case 4:
							Imprimir.huir();
							player1.setVida(-99);
							Imprimir.pausa();
							break;
						default:
							Imprimir.error();
							break;
					}
				}while(opcion>4 || opcion<1);

				if (player2.getVida()>0 && player1.getVida()>0) {

					do {
						Menus.menuLucha();
						opcion2=Lee.Entero();
						
						switch (opcion2) {
							case 1:
								player1.dano(player2.ataqueFisico());
								Dibujos.atacar();
								Imprimir.ataque(player2, player1);
								break;
							case 2:
								player2.defender(player2.defensaFisico());
								Dibujos.defender();
								Imprimir.defensa(player2);
								break;
							case 3:
								if(curas2>0) {
									player2.curar(recuperacion);
									curas2=curas2-1;
									Dibujos.curar();
									Imprimir.curar(player2);
								}else {
									Imprimir.sinCuras();
								}
								break;
							case 4:
								Imprimir.huir();
								player2.setVida(-99);
								Imprimir.pausa();
								break;
							default:
								Imprimir.error();
								break;
						}
					}while(opcion2>4 || opcion2<1);

					Imprimir.pausa();
					Imprimir.status(player1, curas);
					Imprimir.status(player2, curas2);
				}
				
				
			}while(player2.getVida()>0 && player1.getVida()>0);
			
			if(player2.getVida()<=0) {
				Imprimir.ganador(player1);
			}else if (player1.getVida()<=0) {
				Imprimir.ganador(player2);
			}
			if(player1.getVida()==-99 || player2.getVida()==-99) {
				Dibujos.huir();
			}else {
				Dibujos.ganar();
			}
			
		}else {
			Imprimir.error();
		}

		Imprimir.end();
		player1=null;
		player2=null;
	}
	
	/**
	 * Metodo en el que se desarrollara la lucha en el caso de que el usuario quiera jugar contra la maquina
	 * @param luchadores: recibira el array de luchadores para que la maquina seleccione un personaje del array hasta
	 * que se acabe
	 */
	public static void lucha(Personaje [] luchadores) {
		
		int opcion=0;
		int recuperacion=60;
		int curas=2;
		int curas2=2;
		int terminar=5;
		
		
		while(terminar!=0 && terminar!=-1) {
			
			seleccionarCPU(luchadores);
			
			 
			if(player1!=null && cpu!=null) {
				Imprimir.introduccion2();
				Imprimir.eleccion(cpu);
				Imprimir.pausa();
			
			
				do {
					boolean confirmar=false;
					do {
						Menus.menuLucha();
						opcion=Lee.Entero();
						
						switch (opcion) {
							case 1:
								cpu.dano(player1.ataqueFisico());
								Dibujos.atacar();
								Imprimir.ataque(player1, cpu);
								confirmar=true;
								break;
							case 2:
								player1.defender(player1.defensaFisico());
								Dibujos.defender();
								Imprimir.defensa(player1);
								confirmar=true;
								break;
							case 3:
								if(curas>0) {
									player1.curar(recuperacion);
									curas=curas-1;
									Dibujos.curar();
									Imprimir.curar(player1);
								}else {
									Imprimir.sinCuras();
								}
								confirmar=true;
								break;
							case 4:
								Imprimir.huir();
								player1.setVida(-99);
								Imprimir.pausa();
								confirmar=true;
								break;
							default:
								Imprimir.error();
								break;
						}
					}while(!confirmar);

					if(cpu.getVida()>0 && player1.getVida()>0) {
						switch (cpuDecision()) {
							case 0:
								player1.dano(cpu.ataqueFisico());
								Dibujos.atacar();
								Imprimir.ataque(cpu, player1);
								break;
							case 1:
								player1.dano(cpu.ataqueFisico());
								Dibujos.atacar();
								Imprimir.ataque(cpu, player1);
								break;
							case 2:
								cpu.defender(cpu.defensaFisico());
								Dibujos.defender();
								Imprimir.defensa(cpu);
								break;
							case 3:
								if(curas2>0) {
									cpu.curar(recuperacion);
									curas2=curas2-1;
									Dibujos.curar();
									Imprimir.curar(cpu);
								}else {
									Imprimir.sinCuras();
								}
							default:
								break;
						}
						Imprimir.pausa();
						Imprimir.status(player1, curas);
						Imprimir.status(cpu, curas2);
					}
						
				}while(cpu.getVida()>0 && player1.getVida()>0);
				
				if(cpu.getVida()<=0) {
					Imprimir.ganar(cpu);
					terminar--;
					cpu=null;
				}else if (player1.getVida()<=0) {
					Imprimir.perder();
					terminar=-1;
				}
				if(player1.getVida()==-99) {
					Dibujos.huir();
					terminar=-1;
				}else {
					Dibujos.ganar();
				}
				
				
			}else {
				Imprimir.error();
			}
		

			Imprimir.end();
		}
		if(terminar==0) {
			Imprimir.completo();
		}
		player1=null;
		cpu=null;
	}
	
	/**
	 * Metodo para que la maquina tome una decision aleatoria de las opciones disponibles en la lucha
	 * @return devuelve un numero aleatorio entre las decisiones disponibles para que la maquina tome una
	 */
	public static int cpuDecision() {
		Random rand = new Random(System.nanoTime());
		int aleatorio=rand.nextInt(4);
		return aleatorio;
	}

	@Override
	public String toString() {
		return "luchadores: " + Arrays.toString(luchadores);
	}
	
	
	
	
	
}
