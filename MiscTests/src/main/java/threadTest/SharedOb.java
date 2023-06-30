package threadTest;

public class SharedOb {

	int sharedcounter;
	boolean produced = false;

	public synchronized void produce(Producer prod) {
		try {

			while (produced) {

				wait();
			}
			sharedcounter++;
			produced = true;
			System.out.println("Produced by :" + prod + " ,value: "
					+ sharedcounter);

			Thread.sleep(2000);
			notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void consume(Consumer cons) {
		try {

			while (!produced) {

				wait();

			}
			produced = false;
			System.out.println("Consumed by :" + cons + " ,value: "
					+ sharedcounter);
			notifyAll();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
