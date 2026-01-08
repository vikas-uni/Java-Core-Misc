package interviewTest.Threads.OddEvenPrint;

public class PrinterThread implements Runnable{
	CommonOb ob ;
	int count;

	@Override
	public void run() {
		int i = count;
		while(i > 0){
			try {
				ob.getPrint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i--;
		}
	}

	public PrinterThread(CommonOb ob, int count) {
		super();
		this.ob = ob;
		this.count = count;
	}
	
	public static void main(String[] args) throws InterruptedException {
		CommonOb commonOb = new CommonOb();
		
		 int count = 300;
		EvenProducer evenProducer = new EvenProducer(commonOb, count);
		OddProducer oddProducer = new OddProducer(commonOb, count);
		PrinterThread printerThread = new PrinterThread(commonOb, count);
		
		Thread t1 = new Thread(oddProducer, "Odd thread");
		Thread t2 = new Thread(evenProducer, "Even thread");
		Thread t3 = new Thread(printerThread, "Printer Thread");
		
		
		t2.start();
		Thread.sleep(500);
		t1.start();

		t3.start();
		
		
		
	}

}
