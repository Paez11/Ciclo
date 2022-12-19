package listaEnlazadaSimple;

import java.util.Iterator;

public class PruebaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaEnlazada<String> lista = new ListaEnlazada();
		lista.addFirst("hola");
		lista.addLast("adios");
		lista.addLast("Buenas noches");
		
		ListaEnlazada<Vehiculo> lista2 = new ListaEnlazada<>();
		Vehiculo v1 = new Vehiculo("44FR",3600,"Ford","Fiesta");
		lista2.addLast(v1);
		
		for (int i = 0; i < lista2.lengthList(); i++) {
			System.out.println(lista2.getDato(i));
		}
		
		/*
		for (int i = 0; i < lista.lengthList(); i++) {
			System.out.println(lista.getDato(i));
		}
		
		/*
		//lista.removeFirstNodo();
		//lista.removeLastNodo();
		//lista.removeGetNodo(1);
		for (int i = 0; i < lista.lengthList(); i++) {
			System.out.println(lista.getNodo(i));
		}
		/*
		lista.setNodo(2, "aaa");
		for (int i = 0; i < lista.lengthList(); i++) {
			System.out.println(lista.getDato(i));
		}
		*/
		
	}

}
