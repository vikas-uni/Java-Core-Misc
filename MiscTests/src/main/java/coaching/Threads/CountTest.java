package coaching.Threads;

class Count extends Thread {

    int count;

    Count(String name) {
        super(name);
        start();
    }

    public void run() {
        try {
            for (;;) {
                count++;
                Thread.sleep(10);
                System.out.println(count);
            }
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }

    }
}

class CountTest {

    public static void main(String s[]) {
        Count c = new Count("counter");
        Thread th = Thread.currentThread();
        try {
            th.sleep(10000);
            c.interrupt();

        } catch (InterruptedException e) {
        	e.printStackTrace();
        }

    }
}