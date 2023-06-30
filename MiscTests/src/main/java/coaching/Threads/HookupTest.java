package coaching.Threads;

//prog to demo shutdown hookup
class HookThread extends Thread {

    public void run() {
        System.out.println("cleaning the app resources");
    }
}

class HookupTest {

    public static void main(String s[]) {
        System.out.println("main thread started");
        //Runtime is a class,each and every app 
        //has a separate instance of this class that works as an interface b/w the app and runtime env. 
        Runtime rt = Runtime.getRuntime();    
        HookThread ht = new HookThread();      //hookup thread object created    
        rt.addShutdownHook(ht);              //this method registers hookup thread into runtime instance
        
        System.out.println("Main thread is going to complete");
    }
}
