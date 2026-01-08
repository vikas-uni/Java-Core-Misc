/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.Threads.waitTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN To test Thread wait-notify mechanism
 */
class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.setName("ThreadB");
        b.start();
        
// wait(), notify(), and notifyAll() must be called from within a synchronized 
//context! A thread can't invoke a wait or notify method on an object unless it owns 
//that object's lock.
        synchronized (b) {     //get the lock on Thread b
            try {
                System.out.println("Waiting for b to complete...");
                b.wait();                      //releases the lock and waits for ThreadB to complete
                //When the thread waits, it temporarily releases the lock for other threads to use, but 
                //it will need it again to continue execution.
                
                // to call wait(), the thread must own the lock on the object that 
                //wait() is being invoked on
                // The wait() method lets a thread say, "there's nothing for me to do now, so 
                //put me in your waiting pool and notify me when something happens that I 
                //care about." Basically, a wait() call means "wait me in your pool," or "add 
                //me to your waiting list."
                
                //calling wait() from non-synchronized context will immediately causes an IllegalMonitorStateException
                System.out.println("got lock again by ThreadA");
            } catch (InterruptedException e) {
            }
            System.out.println("Total is: " + b.total);
        }
    }
}