package Examen2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="Clientes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clientes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Cliente> clientes;
	@XmlTransient
	private static Clientes _instance;
	
	private Clientes() {
		clientes= new ArrayList<Cliente>();
	}
	
	public static Clientes getInstance() {
		if(_instance==null) {
			_instance=new Clientes();
		}
		return _instance;
		
	}
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List c) {
		clientes.clear();
		clientes.addAll(c);
	}
	
	public boolean addCliente(Cliente c) {
		boolean result=false;
		
		if(!this.clientes.contains(c)) {
			this.clientes.add(c);
			result=true;
		}
		
		return result;
		
	}
	
	public Cliente deleteCliente(String dni) {
		Cliente c=null;
		for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getDni().equals(dni)) {
				c=clientes.get(i);
				clientes.remove(c);
			}
		}
		return c;
	}
	
	public Cliente searchCliente(String nombre) {
		Cliente c=null;
		for (int i = 0; i < this.clientes.size(); i++) {
			if(clientes.get(i).getNombre().equals(nombre)) {
				c=clientes.get(i);
			}
		}
		return c;
	}
	
	public boolean editNombre(String nombre) {
		boolean result=false;
		Cliente c=null;
		if(nombre!=null) {
			for (int i = 0; i < this.clientes.size(); i++) {
				if(clientes.get(i).getNombre().equals(nombre)) {
					c=clientes.get(i);
					c.setNombre(nombre);
					result=true;
				}
			}
		}
		return result;
	}

	@Override
	public String toString() {
		String s="";
		
		for(Cliente c : clientes) {
			s+=c.toString()+"\n";
		}
		
		return s;
	}
	
	
	
	
}
