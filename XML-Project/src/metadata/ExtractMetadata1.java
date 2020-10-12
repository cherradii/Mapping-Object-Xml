package metadata;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.debugger.PDFDebugger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.common.PDMetadata;

/*
 * 
 * Extract metadata from pdf file based on on PDFBox api, exists other package like tika, it's important to test this one
 * 
 */

public class ExtractMetadata1 {
	
	public static void main(String[] args) throws IOException {
		
		PDDocument document = PDDocument.load(new File("repository/test.pdf")); 
		PDDocumentInformation info = document.getDocumentInformation();
		
		
		System.out.println( "Title=" + info.getTitle() );
		System.out.println( "Author=" + info.getAuthor() );
		System.out.println( "Subject=" + info.getSubject() );
		System.out.println( "Keywords=" + info.getKeywords() );
		System.out.println( "Creator=" + info.getCreator() );
		System.out.println( "Producer=" + info.getProducer() );
		System.out.println( "Creation Date=" + info.getCreationDate().getTime() );
		System.out.println( "Modification Date=" + info.getModificationDate().getTime());
		System.out.println( "Trapped=" + info.getTrapped() );


		for (String x : info.getMetadataKeys()) {
			System.out.println(x);
		}

		System.out.println(info.toString());
;

	}

}
