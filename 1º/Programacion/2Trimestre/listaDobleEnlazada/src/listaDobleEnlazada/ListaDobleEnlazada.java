package listaDobleEnlazada;


public class ListaDobleEnlazada<T> {
	private Nodo<T> primero;
	private int size;
	
	
	public ListaDobleEnlazada() {
		this.primero = null;
		this.size = 0;
	}
	
	
	public Nodo<T> getPrimero() {
		return primero;
	}



	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	/**
	 * Inserta un nodo al final de la lista
	 * @param v el valor del nodo insertado
	 * @return el nuevo tama�o de la lista
	 */
	public int push(T v) {
		
		if(v!=null) {
			Nodo<T> nuevo = new Nodo<T>(v);
			if(this.primero==null) {
				this.unshift(v);
			}else {
				Nodo<T> aux = this.primero;
				while(aux.siguiente!=null) {
					aux=aux.siguiente;
				}
				aux.siguiente=nuevo;
				nuevo.anterior=aux;
			}
			size++;
		}

		return size;
	}

	/**
	 * Insertar un nodo al principio de la lista
	 * @param v el valor del nodo insertado
	 * @return el nuevo tama�o de la lista
	 */
	public int unshift(T v) {
		
		Nodo<T> nuevo = new Nodo<T>(v);
		
		if(v!=null) {
			if(this.primero==null) {
				this.primero=nuevo;
			}else {
				this.primero.anterior=nuevo;
				nuevo.siguiente=this.primero;
				this.primero=nuevo;
			}
			size++;
		}

		
		return size;
	}
	
	/**
	 * Devuelve el valor del �ltimo nodo de la lista y lo elimina (extrae)
	 * @return el valor del ultimo nodo o null si la lista est� v�cia
	 */
	public T pop() {
		T dato = null;
		
		if(this.primero.siguiente==null) {
			this.primero=null;
		}else {
			Nodo<T> aux = this.primero;
			while(aux.siguiente!=null) {
				aux=aux.siguiente;
			}
			dato=aux.getDato();
			aux.anterior.siguiente=null;
			aux=null;
		}
		size--;
		
		return dato;
	}
	
	/**
	 * Devuelve el valor del primer nodo de la lista y lo elimina (extrae)
	 * @return el valor del primer nodo o null si la lista est� vac�a
	 */
	public T shift() {
		Nodo <T> aux = this.primero;
		T dato = null;
		
		if(this.primero!=null) {
			dato=this.primero.getDato();
			this.primero=this.primero.siguiente;
			if(this.primero!=null) {
				this.primero.anterior=null;
			}
			size--;
		}
		
		return dato;
	}
	
	/**
	 * Busca el valor pasado como par�metro y devuelve la posici�n del primer nodo que lo contenga
	 * @param v valor a buscar
	 * @return posici�n del nodo que lo contiene o -1 si no existe o la lista est� vac�a
	 */
	public int contains(T v) {
		int pos=-1;
		boolean result=false;
		Nodo<T> aux=this.primero;
		
		while(aux!=null && !result) {
			pos++;
			if(aux.getDato().equals(v)) {
				result=true;
			}
			aux=aux.siguiente;
		}
		if(!result) {
			pos=-1;
		}
		
		
		return pos;
	}
	
	/**
	 * Devuelve el valor del nodo que se encuentra en la posici�n indicada
	 * @param pos posici�n del nodo
	 * @return su valor o null si no es una posici�n correcto o la lista est� vac�a
	 */
	public T get(int pos) {
		T dato = null;
		
		if(pos>=0 && pos<size) {
			Nodo<T> aux=this.primero;
			int cont=0;
			while(aux!=null && cont!=pos) {
				cont++;
				aux=aux.siguiente;
			}
			if(cont==pos && aux!=null) {
				dato=aux.getDato();
			}
		}
		
		return dato;
	}

	/**
	 * Insertar un nodo con el valor pasado en la posici�n indicada
	 * @param value el valor del nuevo nodo a insertar
	 * @param pos la posici�n donde se desea insertar
	 * @return el nuevo tama�o de la lista
	 */
	public int put(T value, int pos) {
		
		if(value!=null) {
			Nodo<T> nuevo = new Nodo<>(value);
			if(this.primero==null) {
				this.push(value);
			}else {
				if(pos>=0 && pos<size) {
					Nodo<T> aux=this.primero;
					int cont=0;
					while(aux!=null && cont!=pos) {
						cont++;
						aux=aux.siguiente;
					}
					if(cont==pos && aux!=null) {
						aux.siguiente.anterior=nuevo;
						nuevo.siguiente=aux.siguiente;
						aux.siguiente=nuevo;
						nuevo.anterior=aux;
						
					}else {
						aux=nuevo;
					}
				}
				size++;
			}
		}
		
		return size;
	}

	/**
	 * Elimina el nodo que se encuentre en la posici�n indicada
	 * @param pos posici�n del nodo a eliminar 
	 * @return el tama�o de la lista
	 */
	public int remove(int pos) {
		
		if(pos>=0 && pos<size) {
			Nodo<T> eliminado = this.primero;
			Nodo<T> aux=null;
			if(eliminado!=null) {
				int cont=0;
				while(eliminado!=null && cont!=pos) {
					aux=eliminado;
					eliminado=eliminado.siguiente;
					cont++;
				}
				if(cont==pos && aux!=null) {
					aux.siguiente=eliminado.siguiente;
					aux.anterior=aux.siguiente;
					aux.siguiente=aux.anterior;
					eliminado.siguiente=null;
				}
				size--;
			}
		}
		
		return size;
	}
	
	/**
	 * Elimina el nodo que contenga el valor indicado
	 * @param v valor del nodo a eliminar 
	 * @return el tama�o de la lista
	 */
	public int removeElement(T v) {
		
		if(v!=null) {
			int pos=contains(v);
			if(pos!=-1) {
				remove(pos);
			}
		}
		
		return size;
	}
	
	
	@Override
	public String toString() {
		String result="";
		Nodo<T> aux=this.primero;
		while(aux!=null) {
			result+=aux;
			aux=aux.siguiente;
		}
		return  result +" | " + "("+ size +")";
	}
	
}