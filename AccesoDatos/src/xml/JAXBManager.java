package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JAXBManager {
    public static void marshal(Books books, String file){
        JAXBContext context;
        BufferedWriter bfr;
        try {
            bfr = new BufferedWriter(new FileWriter(file));
            context = JAXBContext.newInstance(Books.class);
            Marshaller m = context.createMarshaller();
            //propiedades
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(books, bfr);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Books unmarshal(String file){
        Books result= null;

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Books.class);
            Unmarshaller um = context.createUnmarshaller();
            result=(Books)um.unmarshal(new File(file));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return  result;
    }
}
