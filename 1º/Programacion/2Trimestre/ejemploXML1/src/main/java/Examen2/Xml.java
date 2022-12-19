package Examen2;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Xml {
	
	public static void save(String url) {
		JAXBContext archivo;
		try {
			archivo = JAXBContext.newInstance(Cliente.class);
			Marshaller m= archivo.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			m.marshal(Cliente.class, new File("Cliente.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void load(String url) {
		JAXBContext archivo;
		try {
			archivo = JAXBContext.newInstance(Cliente.class);
			
			if(archivo!=null) {
				Unmarshaller um = archivo.createUnmarshaller();
				Clientes s = (Clientes) um.unmarshal(new File("Cliente.xml"));
				s.setClientes(s.getClientes());
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
