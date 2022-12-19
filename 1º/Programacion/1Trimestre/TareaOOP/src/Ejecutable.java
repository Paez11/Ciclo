import miempresa.Empresa;
import miempresa.Persona;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empresa=new Empresa("IES Francisco de los Ríos");
		Persona p1=new Persona("1","María",30,50000);
		Persona p2=new Persona("2","Juan",25,25800);
		Persona p3=new Persona("3","Pedro",30,22600);
		
		empresa.setCeo(p1);
		empresa.contrataEmpleado(p2,0);
		empresa.contrataEmpleado(p3, 1);
		
		System.out.println(empresa.calculaSalarioTotal());
		
		empresa.despideEmpleado(0);
		System.out.println(empresa.contrataEmpleado(new Persona("5","Elena",50,30000), 0));
		empresa.promocionaEmpleado("3", 40000);
	
		System.out.println(empresa.extraePuesto("1"));
		
		System.out.println(empresa);
	}

}
