package Modelo;

import java.util.Random;

public class Personaje {
	
	private String nombre;
	private int vida;
	protected int ataque;
	protected int defensa;
	private final int vidaMaxima;
	
	protected Random rand = new Random(System.nanoTime());
	
	public Personaje(String nombre, int vida, int ataque, int defensa, int vidaMaxima) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.vidaMaxima = vidaMaxima;
	}
	
	public Personaje() {
		super();
		this.nombre = "";
		this.vida = 100;
		this.ataque = 2;
		this.defensa = 1;
		this.vidaMaxima = 100;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida=vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public int getvidaMaxima() {
		return vidaMaxima;
	}
	
	/**
	 * Metodo que tendra el daño de ataque base de todos los personajes entre 1 y la que tenga el personaje
	 * @return devuelve la variable con un numero aleatorio para el ataque
	 */
	public int ataqueFisico() {
		int ataque=rand.nextInt(this.ataque);
		return ataque;
	}
	
	/**
	 * Metodo para tener una defensa aleatoria entre 1 y la que tendra por defecto el personaje
	 * @return devuelve un numero aleatorio para la defensa
	 */
	public int defensaFisico() {
		int defensa=rand.nextInt(this.defensa);
		
		return defensa;
	}
	
	/**
	 * Metodo para restar a la vida de un personaje
	 * @param vida la vida que cambiara al restarle en un ataque
	 */
	public int dano(int d) {
		int d2=d-defender(defensaFisico());
		if(d2>0) {
			setVida(this.vida-d2);
		}
		return getVida();
	}
	
	/**
	 * Metodo para usar la funcion de defensa en un modo controlado
	 * @param defensa: la variable que recibira la funcion que funcionara como su defensa
	 */
	public int defender(int defensa) {
		
		defensa=defensa+this.defensa;
		
		return defensa;
	}
	
	/**
	 * Metodo para recuperar vida
	 * @param curacion la cantidad de vida que se recuperara
	 * @return devulve el valor completo de la vida con lo que se ha curado
	 */
	public int curar(int curacion) {
		int vidapost=this.vida+curacion;
		if(vidapost>vidaMaxima) {
			vidapost=vidaMaxima;;
		}
		setVida(vidapost);
		
		return vidapost;
	}

	@Override
	public String toString() {
		return 
				 "\n nombre: " + nombre 
				+ "\n vida: " + vida 
				+ "\n ataque: " + ataque 
				+ "\n defensa:" + defensa;
	}
	
	
}
