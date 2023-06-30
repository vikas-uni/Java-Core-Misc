package threadTest;

public class Producer implements Runnable{
private SharedOb sharedOb;
public Producer(SharedOb sharedOb) {
	// TODO Auto-generated constructor stub
 this.sharedOb = sharedOb;
}
@Override
public void run() {
		while(true)
		sharedOb.produce(this);
	
	
	
}



}
