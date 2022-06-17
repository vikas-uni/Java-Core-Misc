package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

//https://www.callicoder.com/java-8-completablefuture-tutorial/

public class CompletableFutureDemo {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		// Using Lambda Expression
		Supplier<String> supplier = () -> {
		    try {
		    	System.out.println(Thread.currentThread().getName()+" in try");
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
		    return Thread.currentThread().getName()+" Result of the asynchronous computation";
		};
		CompletableFuture<String> future = CompletableFuture.supplyAsync(supplier,executor);
		
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(supplier,executor);
		
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(supplier,executor);
		
		System.out.println(Thread.currentThread().getName()+" before thenAccept");
		future.thenAccept(a -> System.out.println(a));
		future2.thenAccept(a -> System.out.println(a+"1"));
		future3.thenAccept(a -> System.out.println(a+"2"));
		System.out.println(Thread.currentThread().getName()+" after thenAccept");
		
		executor.shutdown();
//		try {
//			System.out.println(future.get());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	


}
