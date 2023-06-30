package threadTest;

public class Consumer implements Runnable {
	private SharedOb sharedOb;
	public Consumer(SharedOb sharedOb) {
		// TODO Auto-generated constructor stub
	 this.sharedOb = sharedOb;
	}
	@Override
	public void run() {
			while(true)
			sharedOb.consume(this);
		
	}

}
