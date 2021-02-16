package threadTest;

public class Runner {
public static void main(String[] args) {
	SharedOb ob = new SharedOb();
	Producer producer = new Producer(ob);
	Consumer consumer = new Consumer(ob);
	
	Thread prod = new Thread(producer);
	Thread cons = new Thread(consumer);
	
	prod.start();
	cons.start();
}
}
