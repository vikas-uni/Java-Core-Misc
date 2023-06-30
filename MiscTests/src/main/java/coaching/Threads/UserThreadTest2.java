package coaching.Threads;

//prog to create user defined thread by extending Thread
class MyThread2 extends Thread {

    public void run() {
        System.out.println("User thread started");
        Thread t = Thread.currentThread();                    //ref to current thread(i.e. this thread)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " in " + t.getName());
        }
        System.out.println(t.getName() + " going to finish");
    }
}

class UserThreadTest2 {

    public static void main(String s[]) {
        MyThread2 mth = new MyThread2();                       //thread object created

        mth.start();                                         //thread started
        Thread th = Thread.currentThread();                     //ref to current thread(i.e. main thread)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " in " + th.getName());
        }
        System.out.println(th.getName() + " going to finish");
    }
}