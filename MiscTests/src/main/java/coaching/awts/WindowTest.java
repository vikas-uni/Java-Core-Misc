package coaching.awts;

import java.awt.*;
import java.awt.event.*;

class WindowTest extends WindowAdapter {   //implements WindowListener{if all methods to be included
    Frame fr;
    TextField tf;

    WindowTest() {
        fr = new Frame("myframe");
        fr.setLayout(null);
        fr.setSize(200, 323);
        tf = new TextField();
        tf.setBounds(30, 30, 150, 30);
        fr.add(tf);
        fr.setVisible(true);
        fr.addWindowListener(this);
    }
    /*
     public void windowOpened(WindowEvent e)
     {tf.setText("window opened");
     }
     public void windowClosed(WindowEvent e){}
     public void windowDeactivated(WindowEvent e){
     tf.setText("Window deactivated");
     }
     public void windowDeiconified(WindowEvent e){}
     public void windowIconified(WindowEvent e){}
     public void windowActivated(WindowEvent e)
     {tf.setText("Window activated");
     }
     */

    public void windowClosing(WindowEvent e) {
        System.out.println("prog closing");
        System.exit(1);                       //command to exit program
    }

    public static void main(String s[]) {
        new WindowTest();
    }
}