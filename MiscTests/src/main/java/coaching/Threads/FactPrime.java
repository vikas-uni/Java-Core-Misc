package coaching.Threads;

//prog to create two separate threads to calculate factorial and prime by implementing Runnable interface
class FactThread implements Runnable {      //runnable implemented
    int n = FactPrime.num;
    Thread fth;                                 //ref vat of thred declared
    FactThread() {                                //default constructor for class
        fth = new Thread(this, "Fact");                 //new thread created with paramaters(ref to current thread object,thread name)
        System.out.println("Factorial thread");
//fth.start();                                  //thread started
    }

    public void run() {                            //run 
        int i, fact = 1;

        try {

            for (i = n; i >= 1; i--) {
                fact = fact * i;

            }
            System.out.println("Factorial is: " + fact);
            fth.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Fact thread interrupted");
        }
    }
}

class PrimeThread implements Runnable {

    int i, pri;
    int n = FactPrime.num;
    Thread pth;

    PrimeThread() {
        pth = new Thread(this, "Prime");
        System.out.println("Prime Thread");
//pth.start();
    }

    public void run() {


        for (i = 2; i <= n / 2; i++) {
            pri = n % i;
            if (pri == 0) {
                System.out.println("No is not prime");
                break;
            }
            if (i == n / 2) {
                System.out.println("No is prime");
                return;
            }
        }
    }
}

class FactPrime {

    static int num;

    public static void main(String s[]) {
        num = (int) Integer.parseInt(s[0]);
        FactThread fac = new FactThread();
        PrimeThread prim = new PrimeThread();
//Thread fth=Thread.currentThread();
        fac.fth.start();                          //threads started 
//Thread pth=Thread.currentThread();
        prim.pth.start();
    }
}