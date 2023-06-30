package coaching.Threads;

class Resource {

    int data;
    int otherSum;

    void process() {
        for (int i = 1; i <= 10; i++) {
            data = (int) (Math.random() * 100);
        }
        System.out.println(Thread.currentThread().getName() + " sum= " + data);
        System.out.println("try to retrieve the sum of another thread...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + " may be moved in deadlock");
        if (Thread.currentThread().getName().equals("thread1")) {
            otherSum = Deadlock.r2.getSum();
        } else {
            otherSum = Deadlock.r1.getSum();
        }
        System.out.println("sum1: " + data + " in sum2: " + otherSum);
    }

    synchronized int getSum() {
        return (data);
    }
}

class MThread extends Thread {

    MThread(String tname) {
        super(tname);
        start();
    }

    public void run() {
        if (getName().equals("thread1")) {
            synchronized (Deadlock.r1) {  //thread1 gets lock of r1
                Deadlock.r1.process();
            }
        }
        if (getName().equals("thread2")) {  //thread2 gets lock of r2
            synchronized (Deadlock.r2) {
                Deadlock.r2.process();
            }
        }
    }
}

class Deadlock {

    static Resource r1, r2;

    public static void main(String s[]) {
        r1 = new Resource();
        r2 = new Resource();
        MThread th1 = new MThread("thread1");    //thread1 created
        MThread th2 = new MThread("thread2");    //thread2 created
    }
}
