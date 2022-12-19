package ejemploXML1;

/*
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
*/

public class UsaSocio {
	
	static Club c = Club.getInstance();
	
	public static void main(String[] args) {
		
		c.addSocio(new Socio(1,"Ana","21/02/2021"));
		c.addSocio(new Socio(24,"Antonio","1/12/2021"));
		c.addSocio(new Socio(85,"Pedro","3/2/2022"));
		
		c.saveFile("Club.xml");
		
		/*
		JAXBContext contexto;
		
		Socio s = new Socio(26,"Carlos","22/2/22");
		
		try {
			contexto=JAXBContext.newInstance(Socio.class);
			Marshaller m = contexto.createMarshaller();
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			m.marshal(s, new FileWriter("socio.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
