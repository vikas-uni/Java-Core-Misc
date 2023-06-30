/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.joinTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN test join() on thread
 */
public class JoinTest {

    public static void main(String[] args) {
        Thread jt = new Thread(new JoinerThread());
        jt.setName("Joiner");
        jt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Run by " + Thread.currentThread().getName() + "  " + i);

            if (i == 50) {
                try {
                    jt.interrupt();
                    jt.join();    //join to the end of JoinerThread, i.e, will run when JoinerThread completes

                } catch (InterruptedException ex) {
                    Logger.getLogger(JoinTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
