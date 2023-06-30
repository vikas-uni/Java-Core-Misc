package coaching.awts;

//Program to demonstrate Layout managers(BorderLayout)found on java.awt
import javax.swing.*;
import java.awt.*;

class BorderLayoutTest {

    JFrame fr;
    JTextField tf1;
    JButton b1, b2, b3, b4;

    BorderLayoutTest() {
        fr = new JFrame();

        tf1 = new JTextField("Welcome");

        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("West");
        b4 = new JButton("East");

        fr.add(tf1, BorderLayout.CENTER);     //sets specified component at specified position
        fr.add(b1, BorderLayout.NORTH);
        fr.add(b2, BorderLayout.SOUTH);
        fr.add(b3, BorderLayout.WEST);
        fr.add(b4, BorderLayout.EAST);

        fr.setSize(400, 200);
        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String s[]) {
        new BorderLayoutTest();
    }
}
