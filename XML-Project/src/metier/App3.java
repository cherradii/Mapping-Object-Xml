package metier;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class App3 implements Serializable{
	
	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Banque.class);
		context.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				File f = new File("comptes.xsd");
				StreamResult result = new StreamResult(f);
				result.setSystemId(f.getName());
				return result;
			}
		});
		
	}
	
}
