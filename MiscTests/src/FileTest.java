import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class FileTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("\\\\dev05nas\\ECDShare-DEV\\dev\\medical\\guidewire\\claim\\ciecaBMSxml\\working\\ClaimSave_8677193016311261314\\ClaimSave_8677193016311261314.xml");
		Reader fileReader = new FileReader(f); 
		BufferedReader bufReader = new BufferedReader(fileReader); 
		StringBuilder sb = new StringBuilder(); 
		String line = bufReader.readLine();
		while( line != null){ sb.append(line).append("\n"); 
		line = bufReader.readLine(); 
		}
		String xml2String = sb.toString();
		bufReader.close();
		System.out.println(xml2String);
	}

}
