package coaching.Threads;

//Producer consumer problem
class Resource2 {

    int data;
    boolean isProduced;

    synchronized void produce() {
        for (int i = 1; i <= 10; i++) {
            try {
                if (isProduced) {
                    wait();         //free the lock
                }
                isProduced = true;
                data = (int) (Math.random() * 100);
                System.out.println(data + " value produced");
                notify();        //make a process out of waiting pool into waiting state
            } catch (InterruptedException e) {
            }
        }
    }

    synchronized void consume() {
        for (int i = 1; i <= 10; i++) {
            try {
                if (!isProduced) {
                    wait();
                }
                isProduced = false;
                if (data % 2 == 0) {
                    System.out.println(data + " is even");
                } else {
                    System.out.println(data + " is odd");
                }
                notify();
            } catch (InterruptedException e) {
            }
        }
    }
}

class Mythread extends Thread {

    Mythread(String tname) {
        super(tname);
        start();
    }

    public void run() {
        if (getName().equals("producer")) {
            SynchTest2.r.produce();
        } else {
            SynchTest2.r.consume();
        }
    }
}

class SynchTest2 {

    static Resource2 r;

    public static void main(String[] s) {
        System.out.println("main thread started");
        r = new Resource2();
        Mythread pro = new Mythread("producer");
        Mythread con = new Mythread("consumer");
    }
}
