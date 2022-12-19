package Modelo;

public class Persona implements Cloneable{
	private String name;
	private int edad;
	
	public Persona(String name, int edad) {
		this.name = name;
		this.edad = edad;
	}
	
	public Persona() {
		this("Unknow",-1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", edad=" + edad + "]";
	}
	
	public Object clone() {
		Object result=null;
		try {
			result=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
