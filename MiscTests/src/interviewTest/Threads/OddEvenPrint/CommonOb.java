package interviewTest.Threads.OddEvenPrint;

public class CommonOb {
	volatile int num;
	volatile boolean oddTurn = true, readyToPrint = false, evenTurn = false, isOdd = false;
	
	public synchronized void produceOdd(int n) throws InterruptedException{
		while(oddTurn == false){
			wait();
		}
		isOdd = true;
		num = n;
		oddTurn = false;
		readyToPrint = true;
		System.out.println("\t"+num+ " - by :"+Thread.currentThread().getName());
		notifyAll();
	}
	
	public synchronized void produceEven(int n) throws InterruptedException{
		while(evenTurn == false){
			wait();
		}
		
		num = n;
		evenTurn = false;
		readyToPrint = true;
		System.out.println("\t"+num+ " - by :"+Thread.currentThread().getName());
		notifyAll();
	}

	public synchronized void getPrint() throws InterruptedException{
		while(readyToPrint == false){
			wait();
		}
		//if(num%2 == 0){
		if(isOdd == false){
			oddTurn = true;
			isOdd = true;
		}else{
			evenTurn = true;
			isOdd = false;
		}
		readyToPrint = false;
		
		System.out.println(num+ " - by :"+Thread.currentThread().getName());
		notifyAll();
	}
}
