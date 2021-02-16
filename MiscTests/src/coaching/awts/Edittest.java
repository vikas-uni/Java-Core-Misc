package coaching.awts;

//prog to demo cut copy and paste functions
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class Edittest implements ActionListener {

    JPanel fr;
    JTextField tf;                    //Declares a text field for single line input for text
    Color c;
    JButton cut, copy, paste;

    Edittest() {
        fr = new JPanel();
        fr.setLayout(null);
        fr.setVisible(true);

        tf = new JTextField();

        cut = new JButton("Cut");
        copy = new JButton("Copy");
        paste = new JButton("Paste");

        fr.setSize(647, 400);
        tf.setBounds(10, 10, 600, 50);
        cut.setBounds(20, 100, 80, 30);
        copy.setBounds(130, 100, 80, 30);
        paste.setBounds(240, 100, 80, 30);

        c = new Color(255, 114, 0);              //define a color object
        tf.setBackground(c);                 //set background color of text field

        fr.add(tf);
        fr.add(cut);
        fr.add(copy);
        fr.add(paste);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

//fr.setDefaultCloseOperation(JPanel.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String st;
        if (e.getSource() == cut) {
            tf.cut();
        }
        if (e.getSource() == copy) {
            tf.copy();
        }
        if (e.getSource() == paste) {
            tf.paste();
//int a,b,f;
//a=(int)(Math.random()*255);
//b=(int)(Math.random()*255);
//f=(int)(Math.random()*255);
            c = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            tf.setBackground(c);
        }
    }

    public static void main(String s[]) {
        new Edittest();
    }
}
