package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenWithReentrantLock {

	public static void main(String[] args) {
		SharedOddEvenLogic oddEvenLogic = new SharedOddEvenLogic(new ReentrantLock(true));
		OddProducer odd = new OddProducer(oddEvenLogic);
		EvenProducer even = new EvenProducer(oddEvenLogic);

		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(odd);
		es.execute(even);
		es.shutdown();

//		Thread th1 = new Thread(odd, "odd-producer");
//		Thread th2 = new Thread(even, "even-producer");
//
//		th1.start();
//		th2.start();

	}

}

class OddProducer implements Runnable {

	SharedOddEvenLogic sharedOddEvenLogic;

	public OddProducer(SharedOddEvenLogic sharedOddEvenLogic) {
		super();
		this.sharedOddEvenLogic = sharedOddEvenLogic;
	}

	@Override
	public void run() {
		int counter = 20;
		while (counter >= 0) {
			sharedOddEvenLogic.produceOdd();
			counter--;
		}

	}

}

class EvenProducer implements Runnable {

	SharedOddEvenLogic sharedOddEvenLogic;

	public EvenProducer(SharedOddEvenLogic sharedOddEvenLogic) {
		super();
		this.sharedOddEvenLogic = sharedOddEvenLogic;
	}

	@Override
	public void run() {
		int counter = 20;
		while (counter >= 0) {
			sharedOddEvenLogic.produceEven();
			counter--;
		}

	}

}

class SharedOddEvenLogic {
	private volatile boolean isOddTurn = true;
	private ReentrantLock reentrantLock;
	Condition condition;

	public SharedOddEvenLogic(ReentrantLock reentrantLock) {
		super();
		this.reentrantLock = reentrantLock;
		condition = reentrantLock.newCondition();
	}

	public void produceOdd() {
		try {
			reentrantLock.lock();
			if (!isOddTurn) {
				condition.await();
			}

			System.out.println("odd produced");
			isOddTurn = false;
			TimeUnit.SECONDS.sleep(1);
			condition.signalAll();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			reentrantLock.unlock();
		}

	}

	public void produceEven() {

		try {
			reentrantLock.lock();
			if (isOddTurn) {
				condition.await();
			}

			System.out.println("even produced");

			isOddTurn = true;
			TimeUnit.SECONDS.sleep(1);
			condition.signalAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			reentrantLock.unlock();
		}

	}

}