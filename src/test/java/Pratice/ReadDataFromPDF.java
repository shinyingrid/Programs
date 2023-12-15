package Pratice;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPDF {

	public static void main(String[] args) throws IOException {
//		

				// READ DATA FROM PDF
		        PDDocument doc = new PDDocument();
				
PDDocument document = PDDocument.load(new File(System.getProperty("user.dir") + "/src/test/resources/Selenium Cheat Sheet.!!-1.pdf"));

				// page count
				int pagecount = document.getNumberOfPages();
				System.out.println(pagecount);

				// read content
				PDFTextStripper pdfstipper = new PDFTextStripper();
				String pdfText = pdfstipper.getText(document);
				System.out.println(pdfText);

				// set the page number and get the text
//						pdfstipper.setStartPage(4);
//						String ForthPage = pdfstipper.getText(pdfdoc);
//						System.out.println(ForthPage);

//				pdfstipper.setStartPage(2);
//				pdfstipper.setEndPage(4);
//				String mytext = pdfstipper.getText(document);
//				System.out.println(mytext);
				
				// close the PDF document
						doc.close();
	}

}
