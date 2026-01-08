package concurrency;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
Fixed thread pools or cached thread pools are good when you have to execute one unique task only once. When you need to execute a task, repeatedly N times, either N fixed number of times or infinitely after fixed delay, you should be using ScheduledThreadPoolExecutor.

ScheduledThreadPoolExecutor provides 4 methods which provide different capabilities to execute the tasks in repeated manner.

ScheduledFuture schedule(Runnable command, long delay, TimeUnit unit) – Creates and executes a task that becomes enabled after the given delay.
ScheduledFuture schedule(Callable callable, long delay, TimeUnit unit) – Creates and executes a ScheduledFuture that becomes enabled after the given delay.
ScheduledFuture scheduleAtFixedRate(Runnable command, long initialDelay, long delay, TimeUnit unit) – Creates and executes a periodic action that becomes enabled first after the given initial delay, and subsequently with the given delay period. If any execution of this task takes longer than its period, then subsequent executions may start late, but will not concurrently execute.
ScheduledFuture scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) – Creates and executes a periodic action that becomes enabled first after the given initial delay, and subsequently with the given delay period. No matter how much time a long running task takes, there will be a fixed delay time gap between two executions.
*/
public class ScheduledThreadPoolExecutorExample {

	public static void main(String[] args) {
		ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(3);

		Task1 task = new Task1("Repeat Task");
		System.out.println("Created : " + task.getName());

		Runnable runnableTask1 = () -> {System.out.println("Executing runnableTask1: " + Thread.currentThread().getName() + ", Current Seconds : " + new Date().getSeconds());};
		Runnable runnableTask2 = () -> {System.out.println("Executing runnableTask2: " + Thread.currentThread().getName() + ", Current Seconds : " + new Date().getSeconds());};
		Runnable runnableTask3 = () -> {System.out.println("Executing runnableTask3: " + Thread.currentThread().getName() + ", Current Seconds : " + new Date().getSeconds());};
		
//		executor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(runnableTask1, 2, 2, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(runnableTask2, 2, 2, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(runnableTask3, 2, 2, TimeUnit.SECONDS);
		
		Long duration = 60l;
		try {
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("shutting down executor now");
			executor.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Task1 implements Runnable {
	private String name;

	public Task1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void run() {
		System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
	}
}
