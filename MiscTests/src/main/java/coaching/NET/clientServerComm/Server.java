package coaching.NET.clientServerComm;

import java.io.*;
import java.net.*;

class Server {

    public static void main(String s[]) {
        try {
            System.out.println("server started");
            ServerSocket st = new ServerSocket(1050);
            Socket sc = st.accept();
            System.out.println("client connected");
            DataInputStream din = new DataInputStream(sc.getInputStream());
            DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
            while (true) {
                String msg = din.readUTF();
                System.out.println("client: " + msg);
                msg = msg.toUpperCase();
                dout.writeUTF(msg);
                dout.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}