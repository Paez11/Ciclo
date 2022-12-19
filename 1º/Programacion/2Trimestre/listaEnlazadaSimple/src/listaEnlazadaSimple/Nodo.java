package listaEnlazadaSimple;

public class Nodo<T> {
	private T dato;				//alamacena los datos del objeto de tipo generico
	private Nodo<T> siguiente;	//Apuntador al siguiente nodo
	
	
	//Constructor por defecto
	private Nodo() {
		this.siguiente=null;
	}
	
	/**
	 * Constructor que recibe el dato pero no sabemos cual es el siguiente
	 * @param dato
	 */
	public Nodo(T dato) {
		this.dato=dato;
		this.siguiente=null;
	}
	
	/**
	 * Constructor que recibe el dato, y el siguiente nodo al que tiene que apuntar
	 * @param dato: dato que se almacena en el nodo
	 * @param siguiente: el siguiente nodo al que apunta el actual
	 */
	public Nodo(T dato, Nodo<T> siguiente) {
		this.dato=dato;
		this.siguiente=siguiente;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
