/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.notifyAllTest;

/**
 *
 * @author ADMIN
 */
class Reader extends Thread {

    Calculator c;

    public Reader(Calculator calc) {
        c = calc;
    }

    public void run() {
        synchronized (c) {   //get the lock on Calculator(Thread) c
           while(!c.isCompleted()){
            try {
                System.out.println("Waiting for calculation by "+Thread.currentThread().getName());
                c.wait();     //release the lock and wait for notification from c 
                System.out.print("Got the lock by: "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
            }
           }
            System.out.println(", Total is: " + c.total+" by "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setName("calculator");
        
        
//        Thread t = new Thread(calculator,"Calculator");
        
        Reader r1 = new Reader(calculator);
        r1.setName("Reader1");
               
        Reader r2 = new Reader(calculator);
        r2.setName("Reader2");       
        
        Reader r3 = new Reader(calculator);
        r3.setName("Reader3");
        
        r1.start();
        r2.start();
        r3.start();     
        
        calculator.start();
    }
}
