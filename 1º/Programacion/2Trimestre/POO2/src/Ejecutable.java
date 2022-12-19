import Modelo.*;

public class Ejecutable implements Cloneable{

	public static void main(String[] args) {
		
		Empresa e1 = new Empresa("Microsoft", 3000, new Persona("Bill Gates", 60));
		System.out.println(e1);
		
		/*
		//Empresa e2=e1;
		Empresa e2 = new Empresa(e1.getName(), e1.getnEmployees(), e1.getCeo());
		System.out.println(e2);
		*/
		

		Persona p = new Persona(e1.getCeo().getName(), e1.getCeo().getEdad());
		Empresa e2 = new Empresa(e1.getName(),e1.getnEmployees(),p);
		
		e2.setName("Tesla");
		e2.setnEmployees(1500);
		
		Empresa e21 = (Empresa) e1.clone();
		
		System.out.println(e1);
		System.out.println(e21);
	}

}
