package listaSinGenericos;

public class Empleado {
	private String name;
	private String dpto;
	private int age;
	private double salary;
	
	public Empleado() {
		this.name = "";
		this.age = -1;
		this.salary = 0;
		this.dpto="";
	}
	
	public Empleado(String name, int age) {
		this.name = name;
		this.age = age;
		this.salary = 0;
		this.dpto="";
	}
	
	public Empleado(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dpto="";
	}

	public Empleado(String name, String dpto, int age, double salary) {
		
		this.name = name;
		this.dpto = dpto;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	 * @param aumento: la cantidad que subimos el sueldo
	 * @return true si el aumento introducido es un numero positivo y false si el aumento es negativo
	 * 
	 */
	public boolean increaseSalary(double aumento) {
		boolean correcto=false;
		if(aumento>0) {
			this.salary+=aumento;
			correcto=true;
		}
		return correcto;
	}
	
	/**
	 * aumenta el sueldo un porcentaje indicado como parametro
	 * @param aumento: porcentaje que se aumenta el sueldo
	 * @return true si el aumento introducido es un numero positivo y false si el aumento es negativo
	 */
	public boolean increaseSalary(int aumento) {
		boolean correcto=false;
		if(aumento>0) {
			this.salary=this.salary+(this.salary*aumento/100);
			correcto=true;
		}
		return correcto;
	}

	@Override
	public String toString() {
		return "Empleado:" + this.name +
				"\nDepartamento:" + this.dpto + 
				"\nEdad:" + this.age + 
				"\nSalario:" + this.salary;
	}
	
	
	

}
