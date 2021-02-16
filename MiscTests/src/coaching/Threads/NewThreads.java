package coaching.Threads;

//full implementation pending
import java.io.*;

class TH extends Thread {

    String st;

    TH(ThreadGroup group, String tname) {
        super(group, tname);      //this is an overloaded constructor and specifies groupname and threadname 
        st = tname;
        start();
    }

    public void run() {
//Thread t=new Thread(st);
        System.out.println(getName() + " created");

    }
}

class NewThreads {

    public static void main(String s[]) throws IOException {
        TH t;
        ThreadGroup group = new ThreadGroup("mygroup");
        while (true) {
            System.out.println("Enter the string");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();         //readLine() reads strings from console
            if (input.equals("stop")) {

                break;
            } else {
                t = new TH(group, input);
                System.out.println(input + " added to group");
            }
        }
        System.out.println(group.activeCount());
    }
}
