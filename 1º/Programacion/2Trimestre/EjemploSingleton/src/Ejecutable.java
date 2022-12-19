
public class Ejecutable {

	public static void main(String[] args) {
		
		Configurador c = Configurador.newInstance("miurl", "miBdDD");
		Configurador c2 = Configurador.newInstance("dwfe", "bbdd");
		
		System.out.println(c);
		System.out.println(c2);
	}

}
