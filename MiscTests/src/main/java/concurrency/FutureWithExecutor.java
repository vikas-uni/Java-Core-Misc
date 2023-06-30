package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.function.Supplier;

/*FutureTask class is the concrete implementation of the Future object and provides methods for start and cancel the task.
 * It also provides method to see if the computation is done or not. 
 * We can query FutureTask object and get the result of computation.
If we call get method on FutureTask object, it is blocking call and returns once the computation is done.*/
public class FutureWithExecutor {

	public static void main(String[] args) {
		MultiplyingTask multiplyingTask1 = new MultiplyingTask(10, 20, 2000l);
		MultiplyingTask multiplyingTask2 = new MultiplyingTask(20, 40, 4000l);

		FutureTask<Integer> futureTask1 = new FutureTask<>(multiplyingTask1);
		FutureTask<Integer> futureTask2 = new FutureTask<>(multiplyingTask2);

		int a = 6;
		int b = 8;
		Callable<Integer> supp = () -> {
			Thread.sleep(2000l);
			System.out.println("in custom callable");
			return a * b;
		};
		FutureTask<Integer> futureTask3 = new FutureTask<Integer>(supp);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(futureTask1);
		executor.execute(futureTask2);
		executor.execute(futureTask3);
		
		//submit method
		Future<Integer> future4 = executor.submit(supp);

		while (true) {
			try {
				if (!futureTask1.isDone()) {
					System.out.println("FutureTask1 output=" + futureTask1.get());
				}
				if (!futureTask2.isDone()) {
					System.out.println("Waitng for futureTask2 for completion");
					System.out.println("FutureTask2 output=" + futureTask2.get());
				}
				if (futureTask1.isDone() && futureTask2.isDone()) {
					System.out.println("Waitng for futureTask3 for completion");
					System.out.println("FutureTask3 output=" + futureTask3.get());
					System.out.println("Waitng for futureTask4 for completion");
					System.out.println("FutureTask4 output=" + future4.get());
					System.out.println("Completed both the FutureTasks, shutting down the executors");
					executor.shutdown();
					return;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

	}
}

class MultiplyingTask implements Callable<Integer> {
	int a;
	int b;
	long sleepTime;

	public MultiplyingTask(int a, int b, long sleepTime) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;

	}

	@Override
	public Integer call() throws Exception {
		Thread.sleep(sleepTime);
		return a * b;
	}
}