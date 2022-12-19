package ejArrayList;

public class usaGestionLista {

	public static void main(String[] args) {
		GestionLista g = GestionLista.newInstance();
		
		g.add("Maria");
		g.add("Pedro");
		
		GestionLista g2 = GestionLista.newInstance();
		g.add("Sergio");
		
		g.muestraLista();
		System.out.println();
		g2.muestraLista();
	}

}
