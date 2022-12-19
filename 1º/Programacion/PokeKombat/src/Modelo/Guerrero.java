package Modelo;


public class Guerrero extends Personaje {
	
	private int poderAtaque;

	public Guerrero(String nombre, int vida, int ataque, int defensa, int poderAtaque, int vidaMaxima) {
		super(nombre, vida, ataque, defensa, vidaMaxima);
		this.poderAtaque = poderAtaque;
	}
	
	public Guerrero() {
		super();
		this.poderAtaque = 5;
	}

	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}
	
	@Override
	/**
	 * Metodo sobreescrito de ataque fisico que hara que los personajes que pertenezcan a la clase guerrero se les sume
	 * al ataque aleatorio el poder de ataque que tengan
	 */
	public int ataqueFisico() {
		int ataque=rand.nextInt(this.ataque);
		
		return (ataque+this.poderAtaque);
	}

	@Override
	public String toString() {
		return "Guerrero-> "+super.toString()+"\n poderAtaque: "+poderAtaque;
	}
	
	
}
