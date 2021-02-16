/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misc;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Administrator
 */
public class IpTest {
  
  
    public static void main(String args[]) throws UnknownHostException {
    
        InetAddress addr = InetAddress.getLocalHost();
      
        //Getting IPAddress of localhost - getHostAddress return IP Address
        // in textual format
        String ipAddress = addr.getHostAddress();
      
        System.out.println("IP address of localhost from Java Program: " + ipAddress);
      
        //Hostname
        String hostname = addr.getHostName();
        System.out.println("Name of hostname : " + hostname);
      
    }
  
}


