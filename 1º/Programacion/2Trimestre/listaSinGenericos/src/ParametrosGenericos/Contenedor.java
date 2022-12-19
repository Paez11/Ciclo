package ParametrosGenericos;

public class Contenedor<T> {
	private T obj;
	
	public Contenedor() {
		this.obj = null;
	}
	
	public T getObj() {
		T objDev = this.obj;
		this.obj = null; //el contenedor vuelve a estar vacio
		return objDev;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}