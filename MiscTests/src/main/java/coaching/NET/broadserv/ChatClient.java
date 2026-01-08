package coaching.NET.broadserv;

import java.net.*;
import java.io.*;

class ChatClient {

    public static void main(String s[]) {
        System.out.println("client started");
        try {
            Socket st = new Socket("localhost", 1050);
            System.out.println("connection established");
            DataInputStream din = new DataInputStream(st.getInputStream());
            DataOutputStream dout = new DataOutputStream(st.getOutputStream());
            new ReaderThread(din);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("enter text,enter stop to terminate");
                String str = br.readLine();
                dout.writeUTF(str);
                dout.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ReaderThread extends Thread {

    DataInputStream din;

    ReaderThread(DataInputStream din) {
        this.din = din;
        setDaemon(true);
        start();
    }

    public void run() {
        try {
            while (true) {
                String str = din.readUTF();
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
