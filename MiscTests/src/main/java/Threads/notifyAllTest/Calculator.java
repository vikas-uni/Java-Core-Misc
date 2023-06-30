/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.notifyAllTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
class Calculator extends Thread {

    int total;
    private volatile boolean completed = false;

    public boolean isCompleted() {
        return completed;
    }

    public void run() {
        try {
            System.out.println("in run() of Calculator, sleeping for 2 sec...");
            Thread.sleep(2000);
            System.out.println("sleeping over...");
        } catch (InterruptedException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized (this) {    //get the lock on this object by Thread running this run method
            System.out.println("got the lock by " + Thread.currentThread().getName() + ", continuing execution");
            for (int i = 0; i < 100; i++) {
                total += i;
            }

            completed = true;
            notifyAll();      //notify all the threads waiting in the waiting pool
        }
    }
}
