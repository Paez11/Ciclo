package ParametrosGenericos;

import listaSinGenericos.Empleado;

public class UsaContenedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejemplo 1:
			//Contenedor<Integer> c = new Contenedor<Integer>();
			Contenedor<Integer> c = new Contenedor<>();
			
			c.setObj(5);
			
			Contenedor<String> s = new Contenedor<>();
			s.setObj("hola");
			
			Contenedor<Empleado> e = new Contenedor<>();
			e.setObj(new Empleado("pepe","prog",28,1900));
	}
	

}
