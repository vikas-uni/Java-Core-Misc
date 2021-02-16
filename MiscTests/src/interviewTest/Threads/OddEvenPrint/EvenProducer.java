package interviewTest.Threads.OddEvenPrint;

public class EvenProducer implements Runnable{
	CommonOb ob ;
	int count;

	@Override
	public void run() {
		int i = 2;
		while(i <= count){
			try {
				ob.produceEven(i);
				//Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i+=2;
		}
	}

	public EvenProducer(CommonOb ob, int count) {
		super();
		this.ob = ob;
		this.count = count;
	}
	
}
