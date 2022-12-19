package miempresa;

public class Persona {
	private String dni;
	private String nombre;
	private int edad;
	private float salario;
	
	
	public Persona(String dni,String nombre, int edad, float salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.dni = dni;
	}
	private Persona() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getDni() {
		return this.dni;
	}

	@Override
	public String toString() {
		return "Persona "+dni+" [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	
	
	
	
}
