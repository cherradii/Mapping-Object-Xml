package metier;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class App2 implements Serializable{
	
	public static void main(String[] args) throws JAXBException {
		
		
		JAXBContext context = JAXBContext.newInstance(Banque.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Banque banque = (Banque) unmarshaller.unmarshal(new File("compte.xml"));
		
		List<Compte> comptes = banque.getComptes();
		
		for (Compte compte : comptes) {
			System.out.println("----------------------------------");
			System.out.println("Code: " + compte.getCode());
			System.out.println("Solde: " + compte.getSolde());
		}
		
	}

}
