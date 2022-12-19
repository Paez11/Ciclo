package Modelo;

public class Persona {
	
	private int edad;
	protected String dni;
	private String nombre;
	
	public Persona(int edad, String dni, String nombre) {
		this.edad = edad;
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Persona() {
		this(0," ","");
	}
	
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(obj!=null) {
			if(this==obj) {
				result=true;
			}else {
				//if(this.getClass()==obj.getClass()) {
				if(obj instanceof Persona) {								//Compatibles
					Persona tmp= (Persona) obj;								//vas a comparar si son iguales antes
					if(tmp!=null && this.dni!=null && this.dni==tmp.dni) {	//comparar todo y comprobar que este seteado para no colarse con null
						result=true;
					}
					System.out.println("Son iguales");
				}else {
					System.out.println("No son iguales");
				}

			//System.out.println(this.getClass());
			//System.out.println(obj.getClass());
			/*
			Persona tmp= (Persona) obj;
			if(this.dni==tmp.dni) {
				result=true;
			}
			*/
		 }
		}
		return result;
	}
	
	
}
