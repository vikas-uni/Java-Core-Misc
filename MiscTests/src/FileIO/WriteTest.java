/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class WriteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            // TODO code application logic here
            File f = new File("WriteTest.txt");
            fw = new FileWriter(f);
            String newline = System.getProperty("line.separator");
            fw.write("this"+newline+"is"+newline+"newline"+newline+"test");
            fw.flush();
            char c = newline.charAt(0);
            System.out.println((int)c);
        } catch (IOException ex) {
            Logger.getLogger(WriteTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
