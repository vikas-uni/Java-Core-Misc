/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.Threads.waitTest.producerConsumerSync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Consumer implements Runnable {

    CommonObject p;

    public Consumer(CommonObject p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.consume();
            
//            System.out.println("consumed");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ProducerThread.class.getName()).log(Level.SEVERE, null, ex);
//            }

        }
    }
}
