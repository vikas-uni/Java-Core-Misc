package coaching.Threads;

//prog to create thread by implementing Runnable interface
class MyThread implements Runnable {

    public void run() {                              //overriden method
        System.out.println("User thread started");
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " in " + t.getName());
        }
        System.out.println(t.getName() + " going to finish ");
    }
}

class UserThreadTest {

    public static void main(String s[]) {
        MyThread mth = new MyThread();                 //object of MyThread created
        Thread th = new Thread(mth);                   //object of thread created with mth as parameter(this invokes run() in thread class  
        th.start();                                  //start a new thread 
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " in " + t.getName());
        }
        System.out.println(t.getName() + " Going to finish");
    }
}
