package interviewTest.Threads.notifyAllTest;

public class Calculator {
	int total;
	private volatile boolean completed = false;

	public boolean isCompleted() {
		return completed;
	}

	public synchronized void calculate() { // get the lock on this object by Thread running this run method
		System.out.println("got the lock by " + Thread.currentThread().getName() + ", continuing execution");
		for (int i = 0; i < 100; i++) {
			total += i;
		}

		completed = true;
		notifyAll(); // notify all the threads waiting in the waiting pool
	}

}
