package listaDobleEnlazada;


public class Prueba {

	public static void main(String[] args) {
		ListaDobleEnlazada<String> lista = new ListaDobleEnlazada();
		lista.unshift("hola");
		lista.push("adios");
		//lista.pop();
	

		System.out.println(lista);
		
		System.out.println(lista.get(1));
		
	}

}