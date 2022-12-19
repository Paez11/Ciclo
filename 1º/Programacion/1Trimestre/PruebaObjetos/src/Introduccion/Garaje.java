package Introduccion;

public class Garaje {
	
	private String nombre;
	private coche plaza1;
	private coche plaza2;
	
	public Garaje(){
		nombre="Desconocido";
		plaza1=plaza2=null;
	}
	
	public Garaje(String nombre) {
		this.nombre=nombre;
		plaza1=plaza2=null;
	}
	
	public Garaje(String nombre,coche c1,coche c2) {
		this.nombre=nombre;
		plaza1=c1;
		plaza2=c2;
	}
	
	public void setNombre(String nuevoNombre) {
		this.nombre=nuevoNombre;
	}
	public String getNombre() {
		return this.nombre;
	}

	public coche getPlaza1() {
		return plaza1;
	}

	public void setPlaza1(coche plaza1) {
		this.plaza1 = plaza1;
	}

	public coche getPlaza2() {
		return plaza2;
	}

	public void setPlaza2(coche plaza2) {
		this.plaza2 = plaza2;
	}

	@Override
	public String toString() {
		return "Garaje [nombre=" + nombre + ", plaza1=" + plaza1 + ", plaza2=" + plaza2 + "]";
	}
	
}
