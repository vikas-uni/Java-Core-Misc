package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * https://java2blog.com/java-executor-framework-tutorial-example/
 * https://howtodoinjava.com/java/multi-threading/java-thread-pool-executor-example/
 * 
 * Executor framework simplifies the design of creating multithreaded
 * application and manages thread life cycles. The programmer does not have to
 * create or manage threads themselves,that�s the biggest advantage of executor
 * framework. There are some important classes or interfaces for executor
 * framework.
 * 
 * Executor This interface is used to submit new task.It has a method called
 * "execute". public interface Executor { void execute(Runnable command); }
 * 
 * It is sub-interface of Executor.This interface provides methods to manage
 * lifecycle of tasks as well for executor. For example It provides method for
 * shutting down executors
 * 
 * Since Java 5, the Java concurrency API provides a mechanism Executor
 * framework. This is around the Executor interface, its sub-interface
 * ExecutorService, and the ThreadPoolExecutor class that implements both
 * interfaces.
 * 
 * ThreadPoolExecutor separates the task creation and its execution. With
 * ThreadPoolExecutor, you only have to implement the Runnable objects and send
 * them to the executor. It is responsible for their execution, instantiation,
 * and running with necessary threads.
 * 
 * It goes beyond that and improves performance using a pool of threads. When
 * you send a task to the executor, it tries to use a pooled thread for the
 * execution of this task, to avoid continuous spawning of threads.
 * 
 * 
 * 3. How to create ThreadPoolExecutor We can create following 5 types of thread
 * pool executors with pre-built methods in java.util.concurrent.Executors
 * interface.
 * 
 * Fixed thread pool executor � Creates a thread pool that reuses a fixed number
 * of threads to execute any number of tasks. If additional tasks are submitted
 * when all threads are active, they will wait in the queue until a thread is
 * available. It is the best fit for most off the real-life use-cases.
 * ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
 * 
 * Cached thread pool executor � Creates a
 * thread pool that creates new threads as needed, but will reuse previously
 * constructed threads when they are available. DO NOT use this thread pool if
 * tasks are long-running. It can bring down the system if the number of threads
 * goes beyond what the system can handle. 
 * ThreadPoolExecutor executor =(ThreadPoolExecutor) Executors.newCachedThreadPool(); 
 * 
 * Scheduled thread pool executor � Creates a thread pool that can schedule commands to run after a
 * given delay, or to execute periodically. 
 * ThreadPoolExecutor executor =(ThreadPoolExecutor) Executors.newScheduledThreadPool(10); 
 * 
 * Single thread pool executor � Creates single thread to execute all tasks. Use it when you have
 * only one task to execute. 
 * ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newSingleThreadExecutor(); 
 * 
 * Work stealing thread pool executor �
 * Creates a thread pool that maintains enough threads to support the given
 * parallelism level. Here parallelism level means the maximum number of threads
 * which will be used to execute a given task, at a single point of time, in
 * multi-processor machines. 
 * ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newWorkStealingPool(4);
 * 
 */

public class ExecutorFrameworkTest {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		for (int i = 1; i <= 5; i++) {
			Task task = new Task("Task " + i);
			System.out.println("Created : " + task.getName());

			executor.execute(task);
		}
		System.out.println("executing through future");
		Task task = new Task("Task future");
		Future<?> future = executor.submit(task);

		// using lambda to create-
		Runnable runn = () -> {
			try {
				Long duration = (long) (Math.random() * 10);
				System.out.println("Executing : lambda runnable");
				TimeUnit.SECONDS.sleep(duration);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		executor.execute(runn);
		executor.shutdown();

		System.out.println("total task:" + executor.getTaskCount());
		System.out.println("completed task:" + executor.getCompletedTaskCount());

		System.out.println("executor.isTerminated:" + executor.isTerminated());

		while (!executor.isTerminated()) {
			try {
				TimeUnit.SECONDS.sleep(2l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("total task:" + executor.getTaskCount());
			System.out.println("completed task:" + executor.getCompletedTaskCount());
		}

		try {
			while (!future.isDone()) {
				System.out.println("future done:" + future.isDone());
				Long duration = (long) (Math.random() * 10);
				TimeUnit.SECONDS.sleep(duration);
			}
			System.out.println("future done:" + future.isDone() + ", result:" + future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("executor.isTerminated:" + executor.isTerminated());
	}
}

class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void run() {
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.println("Executing : " + name + " , By:" + Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
