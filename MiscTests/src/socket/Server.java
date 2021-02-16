/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Server started");
        try {
            ServerSocket ss = new ServerSocket(1050);
            System.out.println("waiting for request");
            Socket st = ss.accept();
            System.out.println("client connected");
            
            DataInputStream din = new DataInputStream(st.getInputStream());
            DataOutputStream dout = new DataOutputStream(st.getOutputStream());
            
            while(true){
                String msg = din.readUTF();
                System.out.println("client : "+msg);
                msg = msg.toUpperCase();
                dout.writeUTF(msg);
                dout.flush();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
