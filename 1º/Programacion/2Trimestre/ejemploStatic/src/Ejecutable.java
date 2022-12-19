import Utils.InOut;
import modelo.Animal;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InOut.s("hola");
		
		int n=InOut.leeEntero();
		
		System.out.println(Animal.getNEjemplares());
		
		
		Animal a1=new Animal();
		InOut.s(a1.getEspecie());
		
		System.out.println(a1.getNEjemplares());
		
		Animal a2= new Animal("Mamiferos",false);
		System.out.println(a2.getEspecie());
		
		System.out.println(a2.getNEjemplares());
		
		System.out.println(a2.getEspecie());
	}

}
