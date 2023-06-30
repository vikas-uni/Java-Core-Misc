package coaching.Threads;

class ThreadTest {

    public static void main(String s[]) {
        Thread th = Thread.currentThread();                 //Thread is a class and currentThread() method returns the reference of the main thread object
        System.out.println("main thread started");
        System.out.println("Thread name: " + th.getName());   //getName() method captures the name of thread
        System.out.println("Default priority: " + th.getPriority());  //getPriority() method captures priority of thread

        th.setName("Test");                                         //sets new name of thread
        System.out.println("New name: " + th.getName());
        System.out.println("Thread is going to sleep for 5 sec...");
        try {
            th.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Sleeping time over");
        System.out.println("Details of thread[name,priority,group] " + th);
    }
}
