package interviewTest.Threads.OddEvenPrint;

public class OddProducer implements Runnable{
	CommonOb ob ;
	int count;

	@Override
	public void run() {
		int i = 1;
		while(i <= count){
			try {
				ob.produceOdd(i);
				//Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i+=2;
		}
	}

	public OddProducer(CommonOb ob, int count) {
		super();
		this.ob = ob;
		this.count = count;
	}
	
}
