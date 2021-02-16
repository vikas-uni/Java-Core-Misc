/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netTest;

import java.net.InetAddress;

/**
 *
 * @author ADMIN
 */
public class NetTest {
    public static void main(String[] args) {
        try{
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println("Host name : "+inet.getHostName());
            System.out.println("Address : "+inet.getHostAddress());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
