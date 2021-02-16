/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.waitTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
class ThreadB extends Thread {

    int total;

    public void run() {
        synchronized (this) {           //get lock on this object
            System.out.println("got lock by "+Thread.currentThread().getName()+",continuing execution");
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println(total);
                    total += i;
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            notify();   //called from within synchronized context only.notifies a thread waiting for this object's lock in waiting pool
        }
    }
}
