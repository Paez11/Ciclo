package Modelo;

public class Ejecutable {

	public static void main(String[] args) {
		
		Parking p = new Parking ("La victoria",3);
		
		System.out.println(p);
		
		Coche c = new Coche("1111-AAA","Ana");
		p.newCoche(c);
		
		c = new Coche("2222-BBB","Pedro");
		p.newCoche(c);
		
		c = new Coche("3333-CCC","María");
		p.newCoche(c);
		
		c = new Coche("1111-AAA","Ana");
		p.newCoche(c);
		System.out.println("*********************************************************************************************************");
		/*
		c = new Coche("4444-DDD","Agustin");
		boolean entra=p.newCoche(c);
		System.out.println(entra);
		*/
		
		System.out.println(p);
		System.out.println("*********************************************************************************************************");
		Coche eliminado = p.sacaCoche("2222-BBB");
		if(eliminado==null) {
			System.out.println("el coche matricula no esta en el parking");
		}else {
			System.out.println("Se ha eliminado el coche "+eliminado);
		}
		
		System.out.println(p);
	}

}
