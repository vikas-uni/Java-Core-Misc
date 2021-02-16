package coaching.Threads;

//prog to demo. join method in thread
class JoinThread implements Runnable {

    Thread t;
    String name;

    JoinThread(String st) {
        name = st;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(i + " in " + t);

                t.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(t.getName() + " interrupted");
            }

        }

        System.out.println(name + " Exiting");
    }
}

class JoinDemo {

    public static void main(String s[]) {
        JoinThread jt1 = new JoinThread("Thread1");
        JoinThread jt2 = new JoinThread("Thread2");
        JoinThread jt3 = new JoinThread("Thread3");

//jt1.t.start();
//jt2.t.start();
//jt3.t.start();

        System.out.println(jt1.t.getName() + " is alive " + jt1.t.isAlive());
        System.out.println(jt2.t.getName() + " is alive " + jt2.t.isAlive());
        System.out.println(jt3.t.getName() + " is alive " + jt3.t.isAlive());

        try {
            System.out.println("Wait for threads to finish...");

            jt1.t.join();
            jt2.t.join();
            jt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println(jt1.t.getName() + " is alive " + jt1.t.isAlive());
        System.out.println(jt2.t.getName() + " is alive " + jt2.t.isAlive());
        System.out.println(jt3.t.getName() + " is alive " + jt3.t.isAlive());

        System.out.println("Main thread exiting");
    }
}
