/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.joinTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class JoinerThread implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Run by "+Thread.currentThread().getName()+"  "+i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Joiner thread interrupted at i = "+i);
                Logger.getLogger(JoinerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Joiner Thread still running...");
        }
    }
    
}
