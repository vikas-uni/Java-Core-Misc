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
public class CommonObject {

    int n = 0;
    boolean produced = false;

    public synchronized void produce() {
        System.out.println("Got lock by "+Thread.currentThread().getName()+", going to produce a number");
        if (produced) {          //while will also work here
            try {
                System.out.println("Already produced, releasing lock and waiting to be consumed...");
                this.wait();     // if not produced,release the lock and wait at this line to continue execution
                //Causes the current thread to wait until another thread invokes the Object.notify() method 
                //or the Object.notifyAll() method for this object. In other words, this method behaves exactly 
                //as if it simply performs the call wait(0).
                //The current thread must own this object's monitor. The thread releases ownership of 
                //this monitor and waits until another thread notifies threads waiting on this object's monitor 
                //to wake up either through a call to the notify method or the notifyAll method. 
                //The thread then waits until it can re-obtain ownership of the monitor and resumes execution.
                System.out.println("...got lock again by "+Thread.currentThread().getName());
            } catch (InterruptedException ex) {
                Logger.getLogger(CommonObject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
//        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }

        n++;    // produce a number

        System.out.println("Produced " + n + " by " + Thread.currentThread().getName());
        produced = true;
        this.notify();         //release the lock and notify a thread waiting for this object's lock
                          // notify() will not cause a thread to 
                          //release its locks immediately. The thread can only release its locks by exiting the synchronized code.
    }

    public synchronized void consume() {
        System.out.println("\tGot lock by "+Thread.currentThread().getName()+", going to consume a number");
        if (!produced) {
            try {
                System.out.println("\tAlready consumed, releasing lock and waiting for producer to produce number...");
                this.wait();
                System.out.println("\t...got lock again by "+Thread.currentThread().getName()+", going to consume");
            } catch (InterruptedException ex) {
                Logger.getLogger(CommonObject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
//        
//        try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
//            }

        System.out.println("\tConsumed " + n + " by " + Thread.currentThread().getName());
        produced = false;
        this.notify();

    }
}
