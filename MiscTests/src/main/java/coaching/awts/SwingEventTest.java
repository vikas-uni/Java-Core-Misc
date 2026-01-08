/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coaching.awts;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.event.*;

// Swing main program


public class SwingEventTest {
    public static void main (String [] args) {
    JFrame frame  = new JFrame ("Stand alone");
    JLabel jl = new JLabel("Exits properly");
    frame.getContentPane().add(jl);
    frame.setSize(180,80);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter (){
    public void windowClosing(WindowEvent e) {
        System.out.println("exiting");
    System.exit(0);
    }});
    }
    
    
    
}
