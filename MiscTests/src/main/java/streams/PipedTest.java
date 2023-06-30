/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Vikas-PC
 */
public class PipedTest {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pout = new PipedOutputStream();
        PipedInputStream pin  = new PipedInputStream(pout);
        
    }
    class ReaderThread extends Thread{
        PipedOutputStream pout;
        String fname;
        ReaderThread(String fname,PipedOutputStream pout){
            this.pout = pout;
            this.fname = fname;
        }
        public void run(){
            try{
                FileInputStream fis = new FileInputStream(fname);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis) );
                PrintWriter pw = new PrintWriter(pout);
                while(true){
                    String str = br.readLine();
                    if (str == null) {
                        break;
                    }
                    pw.println(str);
                    pw.flush();
                }
                br.close();
                pw.close();
                
            }catch(Exception e){
                
            }
        }
    }
}
