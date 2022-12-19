package ejArrayList;

import java.util.ArrayList;

public class GestionLista {
	
	private ArrayList <String> miLista = new ArrayList<String>();
	
	private static GestionLista miInstancia;
	
	public static GestionLista newInstance(){
		
		if(miInstancia==null) {
			miInstancia=new GestionLista();
		}
		return miInstancia;
	}
	
	public void add (String dato) {
		miLista.add(dato);
	}
	
	public void muestraLista() {
		for (String string : miLista) {
			System.out.println(string);
		}
	}
}
