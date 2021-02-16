package coaching.awts;

//Program to demonstrate Layout managers(Flowlayout)found on java.awt
import javax.swing.*;
import java.awt.*;

class FlowLayoutTest {

    JFrame fr;
    JTextField tf1, tf2;
    JButton b1, b2;

    FlowLayoutTest() {
        fr = new JFrame();

        fr.setLayout(new FlowLayout(FlowLayout.LEFT));   //creates layout with left alignment of contents with 5pix gap(value in bracket is int type)
        //(new FlowLayout(int alignment,int vgap,int hgap));   is an overloaded version  


        tf1 = new JTextField();
        tf2 = new JTextField();
        b1 = new JButton("OK");
        b2 = new JButton("Cancel");

        tf1.setPreferredSize(new Dimension(200, 30));   //sets preferred size of text field (or any other component) with specified dimensions
        b1.setPreferredSize(new Dimension(60, 30));
        b2.setPreferredSize(new Dimension(80, 30));

        fr.add(tf1);
        fr.add(tf2);
        fr.add(b1);
        fr.add(b2);

        fr.setSize(400, 200);
        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String s[]) {
        new FlowLayoutTest();
    }
}
