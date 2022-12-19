package Modelo;

import java.util.Arrays;

public class Parking {
	private String nombre;
	private Coche [] parking;
	
	
	public Parking(String nombre, int plazas) {
		this.nombre=nombre;
		parking = new Coche [plazas];
	}

	public void newCoche(Coche c) {
		boolean insertado=false;
		if(this.getPlaza(c)!=-1) {
			System.out.println("Coche dentro, ya esta en la plaza "+this.getPlaza(c));
		}else if(this.isFull()){
			System.out.println("Parking lleno");
		}else {
			for (int i = 0; i < parking.length && !insertado; i++) {
				if(parking[i]==null) {
					parking[i]=c;
					insertado=true;
					System.out.println("Coche introducido en la plaza "+i);
				}
			}
		}
	}
	
	/**
	 * devuelve la posicion en el array parking
	 * del coche pasado como argumento
	 * @param c objeto coche que quiero buscar en el array de coches
	 * @return -1 si no encuentra el coche
	 */
	public int getPlaza(Coche c){
		int plaza=-1;
		
		for (int i = 0; i < parking.length; i++) {
			if(c.equals(parking[i])) {
				plaza=i;
				i=parking.length;
			}
		}
		
		return plaza;
	}
	

	public int getPlaza(String matricula){
		int plaza=-1;
		
		for (int i = 0; i < parking.length; i++) {
			if(parking[i].getMatricula()==matricula) {
				plaza=i;
				i=parking.length;
			}
		}
		
		return plaza;
	}
	
	/**
	 * Metodo que me dice si el parking esta lleno
	 * @return true si esta lleno, false si hay hueco
	 */
	public boolean isFull() {
		boolean lleno=true;
		
		for (int i = 0; i < parking.length; i++) {
			if(parking[i]==null) {
				lleno=false;
			}
		}
		
		return lleno;
	}
	
	/**
	 * 
	 * @param matricula matricula del coche que quiero eliminar
	 * @return el objeto coche eliminado, o null si el coche no esta en el parking
	 */
	public Coche sacaCoche(String matricula) {
		Coche eliminado=null;
		
		int plaza = this.getPlaza(matricula);
		
		if(plaza!=-1) {
			eliminado=parking[plaza];
			parking[plaza]=null;
			System.out.println("Coche sacado");
		}
		
		
		return eliminado;
	}
	
	
	@Override
	public String toString() {
		return "Parking [nombre=" + nombre + ", parking=" + Arrays.toString(parking) + "]";
	}

	
	
}
