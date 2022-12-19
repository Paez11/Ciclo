package ejemploXML1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Socio")
@XmlAccessorType(XmlAccessType.FIELD)
public class Socio implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name="Identificador")
	private int id;
	@XmlAttribute(name="Nombre")
	private String nameSocio;
	private String fechaAlta;
	
	
	//Imprescindible para trabajar con xml
	public Socio() {
		
	}
	
	public Socio(int id, String nameSocio, String fechaAlta) {
		super();
		this.id = id;
		this.nameSocio = nameSocio;
		this.fechaAlta = fechaAlta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSocio() {
		return nameSocio;
	}

	public void setNameSocio(String nameSocio) {
		this.nameSocio = nameSocio;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nameSocio=" + nameSocio + ", fechaAlta=" + fechaAlta + "]";
	}
	
	
}
