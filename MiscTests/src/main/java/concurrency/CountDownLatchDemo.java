package concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch is used to make sure that a task waits for other threads
 * before it starts. To understand its application, let us consider a server
 * where the main task can only start when all the required services have
 * started.
 * 
 * Working of CountDownLatch: When we create an object of CountDownLatch, we
 * specify the number of threads it should wait for, all such thread are
 * required to do count down by calling CountDownLatch.countDown() once they are
 * completed or ready to the job. As soon as count reaches zero, the waiting
 * task starts running.
 * 
 * @author vikasgond
 *
 */
public class CountDownLatchDemo {
	public static void main(String args[]) throws InterruptedException {
		// Let us create task that is going to
		// wait for four threads before it starts
		CountDownLatch latch = new CountDownLatch(4);

		// Let us create four worker
		// threads and start them.
		Runnable wrk1 = new Worker(1000, latch);
		Runnable wrk2 = new Worker(2000, latch);
		Runnable wrk3 = new Worker(3000, latch);
		Runnable wrk4 = new Worker(4000, latch);
		
//		Thread first = new Thread(wrk1, "WORKER-1"); //new Worker(1000, latch, "WORKER-1");
//		Thread second = new Thread(wrk2, "WORKER-2");
//		Thread third = new Thread(wrk3, "WORKER-3");
//		Thread fourth = new Thread(wrk4, "WORKER-4");
//		
//		first.start();
//		second.start();
//		third.start();
//		fourth.start();
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.submit(wrk1);
		executorService.submit(wrk2);
		executorService.submit(wrk3);
		executorService.submit(wrk4);

		// The main task waits for four threads
		latch.await();

		// Main thread has started
		System.out.println(Thread.currentThread().getName() + " has finished");
	}
}

// A class to represent threads for which
// the main thread waits.
class Worker implements Runnable {
	private int delay;
	private CountDownLatch latch;

	public Worker(int delay, CountDownLatch latch) {
		//super(name);
		this.delay = delay;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}