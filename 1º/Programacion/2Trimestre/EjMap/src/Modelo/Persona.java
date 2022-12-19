package Modelo;

public class Persona {
	
	private String dni;
	private String name;
	private int age;
	
	public Persona(String dni, String name, int age) {
		super();
		this.dni = dni;
		this.name = name;
		this.age = age;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\ndni: " + dni + ", name: " + name + ", age: " + age;
	}
	
	
	
}
