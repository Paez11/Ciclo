import Modelo.Empleado;
import Modelo.Persona;

public class Test {

	public static void main(String[] args) {
		/*
		Object o = new Object();
		Object o2 = new Object();
		System.out.println(o.toString()+"vs"+o2.toString());
		System.out.println(o.getClass()+"vs"+o2.getClass());
		System.out.println(o.hashCode()+"vs"+o2.hashCode());
		System.out.println(o2.equals(o));
		*/
		Persona p1 = new Persona(25,"123","Mária");
		Empleado e1= new Empleado (25,"123","Mária",1900);
		
		System.out.println(p1==e1);
		
		System.out.println(p1.equals(e1));
		
		/*
		Persona p2 = new Persona(25,"123","Mária");
		Persona p3 = new Persona();
		
		/*
		Empleado e1=new Empleado();
		e1.setDni("1");e1.setEdad(9);e1.setNombre("C");
		System.out.println(e1);
		/*
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3.toString());
		
		System.out.println(p1==p2);
		String Hacked = "Cracked";
		System.out.println(p1.equals(Hacked));
		*/
	}

}
