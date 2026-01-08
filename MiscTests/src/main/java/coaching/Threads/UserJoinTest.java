package coaching.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

class MythreadT extends Thread {

    int time;

    MythreadT(int t, String tname) {
        super(tname);                          //name passed to super class(i.e. Thread class)
        time = t;
        start();                              //Thread started
    }

    public void run() {
        System.out.println("User thread started");
        Thread t = Thread.currentThread();                       //ref to current thread(ie. this thread
        
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(i + " in " + t.getName());
                sleep(time);
            } catch (InterruptedException e) {
                System.out.println("User thread interrupted");
                break;
            }
        }
        
        System.out.println(t.getName() + " going to finish");
    }
}

class Interruptor extends Thread{
    Thread t;

    public Interruptor(Thread t) {
        super("Interruptor");
        this.t = t;
    }
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interruptor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Interruptor going to interrupt:"+t.getName());
        t.interrupt();
    }
    
}

class UserJoinTest {

    public static void main(String s[]) {
        System.out.println("Main thread started");
        MythreadT mt = new MythreadT(2000, "User");                   //object of user thread created
        Thread t = Thread.currentThread();                           //ref to current thread(i.e.main thread)
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " in " + t.getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
        
        try {
            Interruptor i = new Interruptor(t);
            i.start();
            mt.join();                                             //join called on mt so main thread will wait until mt completes
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }
        
        System.out.println(t.getName() + " going to finish");
    }
}
