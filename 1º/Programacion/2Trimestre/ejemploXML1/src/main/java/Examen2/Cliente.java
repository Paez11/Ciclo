package Examen2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Cliente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	@XmlAttribute(name="dni")
	private String dni;
	private int edad;
	
	
	
	public Cliente(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	public Cliente() {
		this("","",0);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result=false;
		
		if(o!=null) {
			if(this==o) {
				result=true;
			}else if(this.getClass()==o.getClass()) {
				Cliente tmp=(Cliente)o;
				if(tmp.dni!=null && this.dni.equals(tmp.dni)) {
					result=true;
				}
			}
		}
		
		return result;
	}
	
}
