package coaching.Threads;

//prog.to demo. ThreadGroup
class TGroup extends Thread {

    TGroup(ThreadGroup group, String tname) {    //this constructor takes ref.of threadgroup and name of threads in that group as argument
        super(group, tname);
        start();
    }

    public void run() {
        System.out.println(getName() + " started");
        try {
            int time = (int) (Math.random() * 1000);
            System.out.println(getName() + " going to sleep for " + time + " ms. ");
            sleep(time);
        } catch (Exception e) {
            System.out.println(getName() + " interrupted");
        }
    }
}

class ThreadGroupTest {

    public static void main(String s[]) {
        System.out.println("main thread started");
        ThreadGroup group = new ThreadGroup("My group");
        System.out.println("thread group created");
        TGroup mt1 = new TGroup(group, "thread1");
        System.out.println("thread1 reg into ThreadGroup");
        TGroup mt2 = new TGroup(group, "thread2");
        System.out.println("thread2 reg into ThreadGroup");
        System.out.println("\n\n interrupting all the members of thread group");
        Thread t[] = {mt1, mt2};
        group.enumerate(t);                           //this method adds threads in a group
        group.interrupt();                           //this method interrupts all thread in that group.
    }
}
