/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.GPStracker;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import socket.Server;

/**
 *
 * @author Administrator
 */
public class GPSserver {

    public static void main(String[] args) {

        System.out.println("Server started");
        try {
            ServerSocket ss = new ServerSocket(1050);
            System.out.println("waiting for request");
            Socket st = ss.accept();
            System.out.println("client connected");

            DataInputStream din = new DataInputStream(st.getInputStream());
            DataOutputStream dout = new DataOutputStream(st.getOutputStream());

            while (true) {
                try {
                    //                String msg = din.readUTF();
//                System.out.println("client : " + msg);
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GPSserver.class.getName()).log(Level.SEVERE, null, ex);
                }
                String msg = getNewLocation();
                dout.writeUTF(msg);
                dout.flush();
            }

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String getNewLocation() {
        return (Math.random()*10)+","+(Math.random()*10);

    }
}
