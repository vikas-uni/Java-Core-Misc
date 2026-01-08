package coaching.NET.broadserv;

//prog to implement broadcast server
import java.net.*;
import java.io.*;
import java.util.*;

class BroadcastServer {

    public static void main(String s[]) {
        try {
            System.out.println("server started");
            ArrayList al = new ArrayList();
            ServerSocket ss = new ServerSocket(1050);
            while (true) {
                Socket st = ss.accept();
                System.out.println("client connected");
                InetSocketAddress socketAddress = (InetSocketAddress) st.getRemoteSocketAddress();
                String clientIpAddress = socketAddress.getAddress()
                	    .getHostAddress();
                
                System.out.println("client connected at: "+"clientIpAddress: "+clientIpAddress
                		+ " , clientPort: "+socketAddress.getPort() );
                al.add(st);
                new ClientThread(st, al);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ClientThread extends Thread {

    Socket s;
    ArrayList al;

    ClientThread(Socket s, ArrayList al) {
        this.s = s;
        this.al = al;
        start();
    }

    public void run() {
        try {
            DataInputStream din = new DataInputStream(s.getInputStream());
            while (true) {
                String msg = din.readUTF();
                if (msg.equals("stop")) {
                    break;
                }
                broadcast(msg, al);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void broadcast(String msg, ArrayList al) {
        try {
            Iterator itr = al.iterator();
            while (itr.hasNext()) {
                Socket sc = (Socket) itr.next();
                DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
                dout.writeUTF(msg);
                dout.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
