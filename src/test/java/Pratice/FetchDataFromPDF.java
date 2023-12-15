package Pratice;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchDataFromPDF {

	public static void main(String[] args) throws Throwable {
		//Read Data from PDF
		PDDocument document = new PDDocument();

		PDDocument doc = PDDocument.load(new File("./src/test/resources/Selenium Cheat Sheet.!!-1.pdf"));
		
		//Read Total Num of Pages in pdf
		int num = doc.getNumberOfPages();
	     System.out.println(num);
	
	     //Read entire data from pdf
/*	PDFTextStripper pdf = new PDFTextStripper();
	String pdfText = pdf.getText(doc);
	System.out.println(pdfText);*/
	     
	     
	     PDFTextStripper pdf = new PDFTextStripper(); 
	     pdf.setStartPage(2);
	     String page = pdf.getText(doc);
	System.out.println(page);
	}

}
