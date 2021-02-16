/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import org.w3c.dom.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;

public class XMLTest {
    public static void main(String[] arg){
        //XMLTest xt = new XMLTest();
        //Class c = xt.getClass();
        
    
   //File f= new File("AppConfiguration.xml");
   FileInputStream fis=null;
   
   InputStream is = null;
        try {
            fis = new FileInputStream("src/AppConfiguration.xml");
        is = (InputStream)fis;
        
        System.out.println(is);
   /*
    while (true){
        int i = fis.read();
         if (i== -1)
             break;
         System.out.print((char) i);
    }*/
    } catch (Exception ex) {
            Logger.getLogger(XMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    //initialize a variable to null if it gets initialized in a try-catch block
    //try{
        //System.out.println("in try");
       // System.out.println(is);
        //System.out.println(f.exists());
         //fis = new FileInputStream("FilesModifiedInWW.txt");
         //System.out.println(fis.read());
         //fis.read();
         //is = fis;
     // }
    //catch(Exception fnf){
    //System.out.println("in catch");
            //}
    
    

    Document doc = null ;
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
   //dbf.setNamespaceAware(true);
   
   
        try {
            
           DocumentBuilder db= dbf.newDocumentBuilder();
           
            doc = db.parse(is);
            
            System.out.println(doc.getBaseURI()+" "+doc.getDoctype());
        } catch (Exception ex) {
            Logger.getLogger(XMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  
    
            }
}
