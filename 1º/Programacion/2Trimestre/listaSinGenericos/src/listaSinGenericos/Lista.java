package listaSinGenericos;

public class Lista {
	private Object [] elementos;		
	private int i=0;
	
	public Lista(int n) {
		elementos = new Object [n];
	}
	
	public Object get (int i) {
		return elementos[i];
	}
	
	public void add(Object o) {
		elementos[i]=o;
		i++;
	}
}
