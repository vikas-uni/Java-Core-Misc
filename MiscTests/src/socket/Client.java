/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Client started");
        System.out.println("ready to connect");
        try {
            Thread.sleep(3000);
            Socket st = new Socket("localhost", 1050);            
            System.out.println("connected");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataInputStream din = new DataInputStream(st.getInputStream());
            DataOutputStream dout = new DataOutputStream(st.getOutputStream());
            
            while(true){
                System.out.println("enter message,press 'Enter' to stop");
                String str = br.readLine();
                if(str.length() == 0)
                    break;
                dout.writeUTF(str);
                dout.flush();
                String response = din.readUTF();
                System.out.println("server: "+response);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
