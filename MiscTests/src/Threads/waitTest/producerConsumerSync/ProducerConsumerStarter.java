/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.waitTest.producerConsumerSync;

/**
 *
 * @author ADMIN
 */
public class ProducerConsumerStarter {
    
    public static void main(String[] args) {
        CommonObject p = new CommonObject();  //create an object which is shared by producer and consumer threads 
        
        Producer pt = new Producer(p);   //create runnable task producer and assign it the common object
        Consumer ct = new Consumer(p);   //create runnable task consumer
        
        Thread producerThread = new Thread(pt);
        Thread consumerThread = new Thread(ct);
        producerThread.setName("ProducerThread");
        consumerThread.setName("ConsumerThread");
        
        producerThread.start();
        consumerThread.start();    
        
        
    }
    
}
