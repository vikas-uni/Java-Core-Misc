package coaching.Threads;

//demo of synchronized method
class Bank {

    int acno, bal;

    Bank(int ano) {
        acno = ano;
        bal = 10000;
    }

    synchronized void withdrawl(int amt) {     //a synchronized method(only one object can use it at a time)
        if (bal >= amt) {
            System.out.println("Sufficient amount");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            bal = bal - amt;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient amount");
        }
    }

    int getBalance() {
        return (bal);
    }
}

class Mthrd extends Thread {

    Bank b;

    Mthrd(Bank b, String tname) {
        super(tname);
        this.b = b;
    }

    public void run() {
        b.withdrawl(8000);
    }
}

class SynchTest {

    public static void main(String s[]) {
        System.out.println("main thread started");
        Bank b = new Bank(101);
        Mthrd mth = new Mthrd(b, "User");
        mth.start();
        b.withdrawl(5000);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("update balance= " + b.getBalance());
    }
}
