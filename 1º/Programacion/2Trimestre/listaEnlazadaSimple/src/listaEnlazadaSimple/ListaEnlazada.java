	package listaEnlazadaSimple;

public class ListaEnlazada<T> {
	//Atributos
	private Nodo<T> primero;
	
	public ListaEnlazada() {
		this.primero=null;
	}
	
	
	
	
	public Nodo<T> getPrimero() {
		return primero;
	}




	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}




	public boolean isEmpty() {
		return this.primero==null;
	}
	
	/**
	 * Añade un primer dato a la lista
	 * @param dato que va a recibir
	 */
	public void addFirst(T dato) {
		//Creamos el nodo nuevo
		Nodo<T> nuevo= new Nodo<>(dato);
		
		//Hacemos que el siguiente del nuevo apunte al primero
		nuevo.setSiguiente(this.primero);
		//Hacemos que el primero apunte al nuevo
		this.primero=nuevo;
		
	}
	
	/**
	 * añade un dato al final de la lista y comprueba que este sea el ultimo
	 * @param dato lo que va a recibir
	 */
	public void addLast(T dato) {
		
		if(isEmpty()) {
			this.addFirst(dato);
		}else {
			Nodo<T> nuevo= new Nodo<>(dato);
			Nodo<T> aux = this.primero;
			while(aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
					
			}
			aux.setSiguiente(nuevo);
		}
	}
	
	/**
	 * Devuelve el dato del primer elemento
	 * @return
	 */
	public T getFirst() {
		T elemento=null;
		if(this.isEmpty()) {
			elemento=this.primero.getDato();
		}
		return elemento;
	}
	
	public int lengthList() {
		Nodo <T> aux;
		int cont=0;
		aux=this.primero;
		while(aux!=null) {
			cont++;
			aux=aux.getSiguiente();
		}
		return cont;
	}
	
	/**
	 * M�todo que busca un elemento dada una posici�n y devuelve su dato
	 * @param pos posici�n del elemento buscado
	 * @return el dato almacenado en la posici�n pos
	 */
	public T getDato(int pos) {
		T elemento=null;
		Nodo<T> aux = this.primero;
		int contador=0;
		if(pos>=0 && pos<=this.lengthList()) {
			while(aux!=null) {
				if(pos == contador) {
					elemento=aux.getDato();
				}
				contador++;
				aux=aux.getSiguiente();
			}
		}
		return elemento;
	}
	
	/**
	 * M�todo que busca un elemento dada una posici�n y devuelve el nodo
	 * @param pos posici�n del elemento buscado
	 * @return el nodo almacenado en la posici�n pos
	 */
	public Nodo<T> getNodo(int pos) {
		Nodo<T> nodoEncontrado=null;
		Nodo<T> aux = this.primero;
		int cont=0;
		if(pos>=0 && pos<=this.lengthList()) {
			while(aux!=null) {
				if(pos == cont ) {
					nodoEncontrado=aux;
				}
				cont++;
				aux=aux.getSiguiente();
			}
		}
		return nodoEncontrado;
	}
	/**
	 *M�todo que elimine de la lista el primer nodo
	 *@return el nodo eliminado o null si la lista est� vac�a
	 */
	public Nodo<T> removeFirstNodo(){
		Nodo<T> nodoEliminado=null;
		Nodo<T> aux=this.primero;
		
		if(!isEmpty()) {
			nodoEliminado=this.primero;
			this.primero=aux.getSiguiente();
			nodoEliminado=null;
		}
		
		/*
		Nodo<T> nodoEliminado=this.primero;
		if(!isEmpty()) {
			this.primero=this.primero.getSiguiente();
		}
		*/
		
		return nodoEliminado;
	}
		
	/**
	 *M�todo que elimine de la lista el �ltimo nodo
	 *@return el nodo eliminado o null si la lista est� vac�a
	 */
	public Nodo<T> removeLastNodo() {
		Nodo<T> nodoEliminado=this.primero;
		
		if(!isEmpty()) {
			if(this.primero.getSiguiente()==null) {
				this.primero=null;
			}else {
				nodoEliminado=this.primero.getSiguiente();
				Nodo<T> aux=this.primero;
				while(nodoEliminado.getSiguiente()!=null) {
					aux=nodoEliminado;
					nodoEliminado=nodoEliminado.getSiguiente();
				}
				aux.setSiguiente(null);
			}
		}
		
		return nodoEliminado;
	}
	/**
	 *M�todo que elimine de la lista el nodo indicado en una posici�n
	 *@param pos: posici�n del elemento a eliminar de la lista
	 *@return el nodo eliminado o null si la lista est� vac�a
	 */
	public Nodo<T> removeGetNodo(int pos){
		Nodo<T> nodoEliminado=this.primero;
		Nodo<T> aux=null;
		int cont=0;
		
		if(!isEmpty() && this.lengthList()>pos) {
			if(pos==0) {
				nodoEliminado=this.removeFirstNodo();
			}else {
			
				while(cont!=pos) {
					aux=nodoEliminado;
					nodoEliminado=nodoEliminado.getSiguiente();
					cont++;
				}
				aux.setSiguiente(nodoEliminado.getSiguiente());
				nodoEliminado.setSiguiente(null);
			}
		}
		return nodoEliminado;
	}
	/**
	 * M�todo que modifique el dato del nodo de la posici�n dada
	 * @param int pos: posici�n del nodo a modificar
	 * @param T dato: nuevo dato
	 * @return boolean result: true si ha podido modificar el dato; false si no ha podido modificarlo
	 */
	public boolean setNodo(int pos, T dato) {
		boolean result=false;
		if(!isEmpty()) {
			Nodo<T> aux = this.primero;
			int contador=0;
			if(pos>=0 && pos<this.lengthList()) {
				while(aux!=null) {
					if(pos == contador) {
						aux.setDato(dato);
					}
					contador++;
					aux=aux.getSiguiente();
				}
			}
		}
		return result;
	}
}
