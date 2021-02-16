package coaching.awts;

// prog to demo MouseAdapter
import javax.swing.*;
import java.awt.event.*;

class MouseTest extends MouseAdapter {

    JFrame fr;
    JButton b1, b2;

    MouseTest() {
        fr = new JFrame();
        fr.setLayout(null);
        b1 = new JButton("Welcome");
        b2 = new JButton("good bye");
        b1.setBounds(30, 50, 80, 50);
        b2.setBounds(150, 50, 100, 50);
        fr.add(b1);
        fr.add(b2);
        fr.setSize(200, 300);
        fr.setVisible(true);
        b1.addMouseListener(this);
        b2.addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e) {
        String text = b1.getText();
        b1.setText(b2.getText());
        b2.setText(text);
    }

    public void mouseExited(MouseEvent e) {
        String text = b1.getText();
        b1.setText(b2.getText());
        b2.setText(text);
    }

    public static void main(String s[]) {
        new MouseTest();
    }
}