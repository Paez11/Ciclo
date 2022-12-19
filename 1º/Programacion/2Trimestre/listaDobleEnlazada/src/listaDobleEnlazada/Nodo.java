package listaDobleEnlazada;


public class Nodo<T> {
	private T dato;
	public Nodo<T> anterior;
	public Nodo<T> siguiente;	
	
	
	
	public Nodo(T dato) {
		this.dato=dato;
		this.anterior=null;
		this.siguiente=null;
	}

	public Nodo(T dato, Nodo<T> anterior, Nodo<T> siguiente) {
		this.dato=dato;
		this.anterior=anterior;
		this.siguiente=siguiente;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return  " "+dato+" ";
	}
	
	
	
}
