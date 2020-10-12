package metier;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App1 {
	
	public static void main(String[] args) throws JAXBException {
		
		Compte cp1 = new Compte(1L, 8800.22, new Date());
		Compte cp2 = new Compte(2L, 4900, new Date());
		Compte cp3 = new Compte(3L, 5700, new Date());
		Banque banque = new Banque();
		banque.addCompte(cp1);
		banque.addCompte(cp2);
		banque.addCompte(cp3);
		
		
		JAXBContext context = JAXBContext.newInstance(Banque.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(banque, new File("compte.xml"));
		
	}

}
