package Modelo;

public class Mago extends Personaje{
	
	private int poderDefensa;

	
	
	public Mago(String nombre, int vida, int ataque, int defensa, int poderDefensa, int vidaMaxima) {
		super(nombre, vida, ataque, defensa, vidaMaxima);
		this.poderDefensa = poderDefensa;
	}
	public Mago() {
		super();
		this.poderDefensa = 5;
	}

	public int getPoderDefensa() {
		return poderDefensa;
	}

	public void setPoderDefensa(int poderDefensa) {
		this.poderDefensa = poderDefensa;
	}
	
	@Override
	/**
	 * Metodo sobreescrito de defensa que hara que los personajes que sean magos se le sume el poder de defensa a la
	 * defensa aleatoria que tendran
	 */
	public int defensaFisico() {
		int defensa=rand.nextInt(this.defensa);
		
		return (defensa+this.poderDefensa);
	}
	
	
	@Override
	public String toString() {
		return "Mago-> "+ super.toString() +"\n poderDefensa: "+poderDefensa;
	}
	
	
}
