package ejemploXML;
import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="club")
@XmlAccessorType(XmlAccessType.FIELD)
public class Club {
	private static Club _instance;
	private ArrayList<Socio> socios;
	
	private Club() {
		socios=new ArrayList<Socio>();
	}
	
	public static Club getInstance() {
		if (_instance==null) {
			_instance=new Club();
		}
		return _instance;
	}
	
	public void addSocio(Socio s) {
		socios.add(s);
	}

	@Override
	public String toString() {
		return "Club [socios=" + socios + "]";
	}
	
	public void saveFile (String url) {
		//hacemos el marshaling, para la escritura en el fichero
		JAXBContext contexto; 
		try {
			contexto = JAXBContext.newInstance(Club.class);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			m.marshal(_instance, new File(url));
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadFile(String url) {
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(Club.class);
		    Unmarshaller um = contexto.createUnmarshaller();
		     
		    //We had written this file in marshalling example
		    Club newClub = (Club) um.unmarshal( new File(url) );
		    socios=newClub.socios;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
