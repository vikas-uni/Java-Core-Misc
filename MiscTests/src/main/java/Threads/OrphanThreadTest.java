/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class OrphanThreadTest {

    public static void main(String[] args) {
        System.out.println("main started");
        Thread t;
        t = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("orphan running");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OrphanThreadTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize(); //To change body of generated methods, choose Tools | Templates.
                System.out.println("----------child terminating-------");
            }
            
        });
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(OrphanThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("main finished");
    }
}
