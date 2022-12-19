/*
Visibilidad			public	default	 protected	 private
total				x		-		 -			 -
Mismo paquete		x		x		 -			 -
Herencia			x		x		 x			 -
Clase				x		x		 x			 x
 */



package Modelo;

public class Empleado extends Persona {
	
	private float salario;
	
	public Empleado() {
		super();
		salario=0f;
		this.dni="90";
	}

	public Empleado(int edad, String dni, String nombre) {
		super(edad, dni, nombre);
		salario=0f;
	}
	public Empleado(int edad, String dni, String nombre, float salario) {
		super(edad, dni, nombre);
		this.salario=salario;
	}
	
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "Empleado: "+getNombre()+","+getDni()+","+getEdad();
		return "Empleado -> "+super.toString()+" salario: "+salario;
	}
	
}
