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
public class Producer implements Runnable {

    CommonObject p;

    public Producer(CommonObject p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.produce();   //calling a synchronized method
//            System.out.println("produced");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
//            }

        }
    }
}
