package coaching.NET.clientServer;

//prog to demo setup of a client server model
import java.net.*;

class Server {

    public static void main(String s[]) {
        try {
            System.out.println("server started");
            ServerSocket ss = new ServerSocket(1050);      //server socket created
            Socket st = ss.accept();                        //accept client connection request in a socket variable(accepts client's socket
            System.out.println("client connected");
        } catch (Exception e) {
        }
    }
}