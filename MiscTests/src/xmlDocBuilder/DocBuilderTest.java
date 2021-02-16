package xmlDocBuilder;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DocBuilderTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		 File xmlFile = new File(System.getProperty("user.dir")+"\\src\\xmlDocBuilder\\content.xml");
		   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
		   DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
		   Document document = docBuilder.parse(xmlFile);
		   
		   System.out.println(document.getChildNodes().item(0).getNodeName());
	}
}
