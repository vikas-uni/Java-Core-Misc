package coaching.awts;

import java.awt.*;
import java.awt.event.*;

class Mylist2 implements ActionListener {

    Frame fr;
    Button b1, b2;
    TextField tf;

    Mylist2() {
        fr = new Frame("frame 2");
        fr.setLayout(null);
        tf = new TextField();
        tf.setBounds(40, 30, 100, 40);
        fr.add(tf);
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b1.setBounds(40, 70, 50, 30);
        b2.setBounds(40, 100, 50, 30);

        fr.add(b1);
        fr.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

        fr.setSize(100, 300);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            tf.setText("hello");
        }
        if (e.getSource() == b2) {
            tf.setText("bye");
        }
    }

    public static void main(String s[]) {
        new Mylist2();
    }
}
