package coaching.awts;

//prog to create a functioning frame
import java.awt.*;
import java.awt.event.*;

class MyListener implements ActionListener //Actionlistener is an interface
{

    public void actionPerformed(ActionEvent e) {   //this is one and only callback method of ActionListener 
        if (e.getActionCommand().equals("Button1")) {
            System.out.println("hello and welcome");
        }
        if (e.getActionCommand().equals("Button2")) {
            System.out.println("bye");
        }
    }
}

class Mframe {

    Frame fr;
    Button b1, b2;

    Mframe() {
        fr = new Frame("my frame");
        fr.setLayout(null);
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b1.setBounds(20, 40, 80, 50);
        b2.setBounds(20, 120, 80, 50);
        fr.add(b1);
        fr.add(b2);
        MyListener listener = new MyListener();         //listener object created
        b1.addActionListener(listener);      //methods registered with buttons 
        b2.addActionListener(listener);
        fr.setSize(120, 300);
        fr.setVisible(true);
    }

    public static void main(String s[]) {
        new Mframe();
    }
}