/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.syncTest;

/**
 *
 * @author ADMIN
 */
public class Runner {
    public static void main(String[] args) {
//        SyncObject obj = new SyncObject();
        Task t = new Task();
        
        Thread t1 = new Thread(t, "jim");
        Thread t2 = new Thread(t, "jack");
        
        t1.start();
        t2.start();
        
    }
}
