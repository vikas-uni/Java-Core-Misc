package coaching.NET.clientServer;

//prog to demo setup of a client server model
import java.net.*;

class Client {

    public static void main(String s[]) {
        try {
            System.out.println("client started");
            System.out.println("ready to send connection");
            Thread.sleep(1000);
            Socket st = new Socket("localhost", 1050);            //create a new socket with specified hostname and server port no
            System.out.println("connection established");
        } catch (Exception e) {
        }
    }
}