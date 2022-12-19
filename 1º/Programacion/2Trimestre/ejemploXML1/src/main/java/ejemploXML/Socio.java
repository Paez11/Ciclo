package ejemploXML;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Socio") // el elemento raiz del xml se llamará socio
@XmlAccessorType(XmlAccessType.FIELD)
public class Socio implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "Identificacion", required = true)
	private int id;
	
	@XmlAttribute(name = "Nombre")
	private String nombreSocio;
	
	//aqui no ponemos nada, porque queremos que en el xml aparezca con el mismo nombre que el campo
	private String direccion;
	
	@XmlAttribute(name="Alta")
	private String fechaAlta;
	
	//obligatorio el constructor por defecto
	public Socio() {
	}
	
	public Socio(int id, String nombreSocio, String direccion, String fechaAlta) {
		this.id = id;
		this.nombreSocio = nombreSocio;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreSocio() {
		return nombreSocio;
	}
	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	@Override
	public String toString() {
		return "\nSocio [id=" + id + ", nombreSocio=" + nombreSocio + ", direccion=" + direccion + ", fechaAlta="
				+ fechaAlta + "]";
	}

}
