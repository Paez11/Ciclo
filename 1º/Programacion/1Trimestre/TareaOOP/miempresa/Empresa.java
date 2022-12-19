package miempresa;

public class Empresa {
	Persona ceo;
	Persona desarrollador;
	Persona disenador;
	String nombre;
	
	public Empresa(String nombre) {
		this.nombre=nombre;
	}

	public Persona getCeo() {
		return ceo;
	}

	public void setCeo(Persona ceo) {
		this.ceo = ceo;
	}

	public Persona getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(Persona desarrollador) {
		this.desarrollador = desarrollador;
	}

	public Persona getDisenador() {
		return disenador;
	}

	public void setDisenador(Persona disenador) {
		this.disenador = disenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Calcula la suma de todos los salarios de los empleados contratados, incluyendo al jefe
	 * @return el salario total que se paga
	 */
	public float calculaSalarioTotal() {
		float salario=0;
		if(ceo.getSalario()==0) {
			salario= desarrollador.getSalario() + disenador.getSalario();
		}
		if(desarrollador.getSalario()==0) {
			salario= ceo.getSalario() + disenador.getSalario();
		}
		if(disenador.getSalario()==0) {
			salario= desarrollador.getSalario() + ceo.getSalario();
		}
		else {
			salario= desarrollador.getSalario() + ceo.getSalario() + disenador.getSalario();
		}
		System.out.println("Salario total:");
		return salario;
	}
	/**
	 * Contrata a un empleado en función del puesto -> 0 para desarrollador, 1 para diseñador, en caso de que todo haya ido correcto devuelve true.
	 * Si el puesto para el que se quiere contratar está ocupado no hará la contratación y devolverá false
	 * @param puesto 0 desarrollador, 1 diseñador
	 * @param acontratar la persona que ocupará el cargo indicado por puesto
	 * @return true si se ha realizado la contratación correctamente, false si no se ha podido o el puesto es erróneo
	 */
	public boolean contrataEmpleado(Persona acontratar,int puesto) {
		boolean result=false;
		
		if(puesto==0 && desarrollador==null) {
			desarrollador=acontratar;
			result=true;
			System.out.println("Se a contratado a "+acontratar.getNombre()+", como desarrollador/a");
		}else if(puesto==1 && disenador==null) {
			disenador=acontratar;
			result=true;
			System.out.println("Se a contratado a "+acontratar.getNombre()+", como dise�ador/a");
		}else {
			System.out.println("No existe el puesto: "+puesto);
		}
		
		return result;
	}
	/**
	 * Deja vacante el puesto seleccionado por puesto
	 * @param puesto 0 desarrollador, 1 diseñador
	 * @return true si se ha podido despedir adecuadamente al empleado, false si no existía empleado a despedir o el puesto es erróneo
	 */
	public boolean despideEmpleado(int puesto) {
		boolean despido=false;
		
		if(puesto==0) {
			despido=true;
			System.out.println("Se ha despedido al desarrollador "+desarrollador.getNombre());
			desarrollador=null;
		}else if(puesto==1) {
			despido=true;
			System.out.println("Se ha despedido al dise�ador "+disenador.getNombre());
			disenador=null;
		}else {
			System.out.println("No se ha encontrado al empleado");
		}
		
		return despido;
	}
	
	/**
	 * Devuelve el puesto que obstenta la persona indicada por su DNI, 0 desarrollador, 1 diseñador, 2 jefe
	 * @param dni a buscar para devolver el puesto
	 * @return devuelve el puesto 0 desarrollador, 1 diseñador, 2 jefe, o -1 si no se ha encontrado a la persona
	 */
	public int extraePuesto(String dni) {
		
		System.out.println("El dni: "+dni+", es el:");
		
		if(dni!=null && dni.equals(desarrollador.getDni())) {
			System.out.println("desarrollador");
			return 0;
		}
		if(dni!=null && dni.equals(disenador.getDni())) {
			System.out.println("dise�ador");
			return 1;
		}
		if(dni!=null && dni.equals(ceo.getDni())) {
			System.out.println("jefe");
			return 2;
		}
		else {
			System.out.println("No se ha encontrado a la persona");
			return -1;
		}
	}
	/**
	 * Aumenta el salario del empleado dado por dni la cantidad dada por parámetro
	 * @param dni del empleado a promocionar
	 * @param cantidad a sumar a su salario inicial
	 * @return true si se ha conseguido, false si no existe ese empleado
	 */
	public boolean promocionaEmpleado(String dni, float cantidad) {
		boolean aumento=false;
		
		if(dni==desarrollador.getDni()) {
			System.out.println("Se ha aumentado al desarrollador: "+cantidad);
			cantidad+=desarrollador.getSalario();
			System.out.println("Total: "+cantidad);
			aumento=true;
		}
		if(dni==disenador.getDni()) {
			System.out.println("Se ha aumentado al dise�ador: "+cantidad);
			cantidad+=disenador.getSalario();
			System.out.println("Total: "+cantidad);
			aumento=true;
		}
		if(dni==ceo.getDni()) {
			System.out.println("Se ha aumentado al jefe: "+cantidad);
			cantidad+=ceo.getSalario();
			System.out.println("Total: "+cantidad);
			aumento=true;
		}
		
		return aumento;
	}
	
	@Override
	public String toString() {
		return "Empresa [ceo=" + ceo + ", desarrollador=" + desarrollador + ", disenador=" + disenador + ", nombre="
				+ nombre + "]";
	}
	
	
	
	
}
