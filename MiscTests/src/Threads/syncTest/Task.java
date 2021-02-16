/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.syncTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Task implements Runnable {

    SyncObject obj;

    public Task() {
        this.obj = new SyncObject();
    }

    @Override
    public void run() {
        while (true) {

            obj.testPrint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SyncObject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
