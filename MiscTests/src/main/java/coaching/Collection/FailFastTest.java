package coaching.Collection;

//prog to demo failfast for Iterator and enumerator
import java.util.*;

class FailFastTest {

    public static void main(String s[]) {
        Vector v = new Vector();              //create a Vector           
        v.add("abc");                        //add elements to it
        v.add("mno");
        v.add("hij");
        v.add("jkl");
        v.add("xyz");
        System.out.println("elements added into collection: " + v);
        System.out.println("starting the iterator thread");
        new IteratorThread(v.elements());                    //start a new IteratorThread
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("removing hij: " + v.remove("hij"));    //perform modifications in Vector
        System.out.println("adding def: " + v.add("def"));
    }
}

class IteratorThread extends Thread {

    Enumeration itr;

    IteratorThread(Enumeration itr) {
        this.itr = itr;
        start();
    }

    public void run() {
        System.out.println("iterator thread started");
        try {                                //throws ConcurrentModificationException(not in case of enumeration)
            while (itr.hasMoreElements()) {
                sleep(500);
                System.out.println(itr.nextElement());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
