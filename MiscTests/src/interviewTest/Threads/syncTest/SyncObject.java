/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.Threads.syncTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class SyncObject {
    int n;
    public void testPrint(){
        synchronized(this){  //the thread calling this method gets the lock on this object,equivalent to write 'synchronized' in method signature
        System.out.println("test readyToPrint run by "+Thread.currentThread().getName()+" "+n++);
        
    }
    }
}
