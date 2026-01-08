package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

// the volatile variable might not get incremented properly but atomic integer will always increment
// volatile only guarantees visibility
public class VolatileAtomicTest {

	static volatile int volInt = 0;
	static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	public static void main(String[] args) {
		
		Runnable runVol = () -> {for (int i = 0; i < 100000; i++) {
			volInt++;
		}};
		
		Runnable runAtom = () -> {for (int i = 0; i < 100000; i++) {
			atomicInteger.incrementAndGet();
		}};
		
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		
		Future<?> f1 = executor.submit(runVol);
		Future<?> f2 = executor.submit(runVol);
		Future<?> f3 = executor.submit(runAtom);
		Future<?> f4 = executor.submit(runAtom);
		
		while(true) {
			if(f1.isDone() && f2.isDone() && f3.isDone() && f4.isDone()) {
				System.out.println(volInt);
				System.out.println(atomicInteger.get());
				break;
			}
		}
	}
}
