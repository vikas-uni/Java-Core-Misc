package coaching.Threads;

class MythreadTh extends Thread {

    int time;

    MythreadTh(String tname, int t) {
        super(tname);
        time = t;
        start();
    }

    public void run() {
        System.out.println(getName() + " started");
        System.out.println(getName() + " going to sleep for " + (time / 1000) + " sec");
        try {
            sleep(time);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " is going to finish");
    }
}

class InterruptTest {

    public static void main(String s[]) {
        MythreadTh mth = new MythreadTh("Lazy", 5000);
        System.out.println("Main thread is going to sleep for 2 sec");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("main is awaked");
        System.out.println("Interrupting to lazy thread...");
        mth.interrupt();
    }
}
