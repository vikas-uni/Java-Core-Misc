/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.Threads.joinTest;

/**
 *
 * @author ADMIN
 */
public class JoinerThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Run by "+Thread.currentThread().getName()+"  "+i);
        }
    }
    
}
