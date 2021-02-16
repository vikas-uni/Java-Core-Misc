package interviewTest.Threads;

public class StaticSyncTest {
	public static void main(String[] args) {
		final Sharedobj shared = new Sharedobj();
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				shared.instMeth();

			}

		}, "Thread-1");
		th.start();

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Sharedobj.staticMeth();

			}

		}, "Thread-2");
		th2.start();

	}
}

class Sharedobj {
	public static synchronized void staticMeth() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("static method run by:"
				+ Thread.currentThread().getName());
	}

	public synchronized void instMeth() {
		System.out.println("instance method run by:"
				+ Thread.currentThread().getName());
		
		staticMeth();
	}
}