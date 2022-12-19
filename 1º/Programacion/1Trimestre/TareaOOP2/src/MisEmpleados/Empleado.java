package MisEmpleados;

public class Empleado {
	private String nombre;
	private String dpto;
	private int age;
	private double salary;
	
	public Empleado(String nombre, String dpto, int age, double salary) {
		this.nombre=nombre;
		this.dpto=dpto;
		this.age=age;
		this.salary=salary;
		
	}
	
	public Empleado(String nombre, int age) {
		this.nombre = nombre;
		this.age = age;
		this.salary=0;
		this.dpto="";
	}

	public Empleado(String nombre, int age, double salary) {
		this.nombre = nombre;
		this.age = age;
		this.salary = salary;
		this.dpto="";
	}
	
	public Empleado() {
		this.nombre = "";
		this.age = -1;
		this.salary=0;
		this.dpto="";
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * Aumenta el sueldo una cantidad fija
	 * @param aumento Cantidad a aumentar
	 * @return true si el aumento introducido es positivo y false si no entra dentro del rango positivo
	 */
	public boolean increaseSalary(double aumento) {
		boolean result=false;
		
		if (aumento>0) {
			result=true;
			salary+=aumento;
			System.out.println("Se ha aumentado: "+aumento);
		}else {
			System.out.println("No hay aumento");
		}
		return result;
	}
	
	/**
	 * Aumentar el sueldo según un porcentaje
	 * @param aumento porcentaje para aumentar la cantidad de sueldo
	 * @return true si es correcto el porcentaje y false si no
	 */
	public boolean increaseSalary(int aumento) {
		boolean result=false;
		
		if (aumento>0) {
			result=true;
			salary+=(salary*aumento/100);
			System.out.println("Se ha aumentado: "+aumento);
		}else {
			System.out.println("No hay aumento");
		}
		return result;
	}

	@Override
	public String toString() {
		return "\n Empleado: " + nombre + "\n Departamento: " + dpto + "\n Sueldo: " + salary + "\n Edad: " + age   ;
	}
	
	
	

}
