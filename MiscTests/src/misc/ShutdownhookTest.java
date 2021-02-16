/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ShutdownhookTest {
    class Hook extends Thread{
        public void run(){
            
            System.out.println("Hooked");
        }
    }
    Hook h = new Hook();
    public static void main(String[] args) {
        System.out.println("main started");
        ShutdownhookTest st = new ShutdownhookTest();
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(st.h);
        try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ShutdownhookTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory());
        try {
            Process p = r.exec("mspaint");
            
        } catch (IOException ex) {
            Logger.getLogger(ShutdownhookTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("main finished");
        
    }
}
