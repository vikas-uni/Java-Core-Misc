package concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//https://howtodoinjava.com/java/multi-threading/when-to-use-countdownlatch-java-concurrency-example-tutorial/
//http://www.java2s.com/Tutorials/Java/Java_Thread_How_to/Concurrent/Create_deadlock_with_CountDownLatch.htm
public class CountDownLatchDeadlockDemo {

	public static void main(String[] args) {
		String obj1 = "Lock1";
		String obj2 = "Lock2";
		CountDownLatch latch = new CountDownLatch(2);

		Locker runnable1 = new Locker(obj1, obj2, latch);
		Locker runnable2 = new Locker(obj2, obj1, latch);
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(runnable1);
		es.execute(runnable2);
		es.shutdown();
	}
}

class Locker implements Runnable {
	CountDownLatch latch;
	Object obj1;
	Object obj2;

	Locker(Object obj1, Object obj2, CountDownLatch latch) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.latch = latch;
	}

	@Override
	public void run() {
		synchronized (obj1) {
			System.out.println("Lock acquired by " + Thread.currentThread().getName() + " : " + obj1);
			latch.countDown();
			System.out.println("counted down latch by "+ Thread.currentThread().getName() + " : "+ latch.getCount());
			try {
				System.out.println("calling awiat"+ Thread.currentThread().getName());
				latch.await();
				System.out.println("after awiat"+ Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (obj2) {
				System.out.println("Thread finished");
			}
		}
	}
}
