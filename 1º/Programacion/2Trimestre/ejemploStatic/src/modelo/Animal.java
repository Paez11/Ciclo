package modelo;

public class Animal {
	private static int numeroDeEjemplares=0;
	private String especie;
	private boolean female;
	
	
	public Animal(String especie, boolean female) {
		this.especie = especie;
		this.female = female;
		Animal.numeroDeEjemplares++;
	}
	public Animal() {
		this("Desconocido",true);
		/*
		this.especie="Desconocida";
		this.female=true;
		*/
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isFemale() {
		return female;
	}
	public void setFemale(boolean female) {
		this.female = female;
	}
	
	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", female=" + female + "]";
	}
	
	
	public static int getNEjemplares() {
		return numeroDeEjemplares;
	}
}
