package coaching.awts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Gridtest implements ActionListener {

    JFrame fr;
    JButton bt[], b;
    JPanel pan;
    int count;

    Gridtest() {
        fr = new JFrame("Grid test");
        //fr.setLayout(new FlowLayout(FlowLayout.LEFT));
        fr.setLayout(null);

        b = new JButton("Start");
        pan = new JPanel();
        pan.setLayout(new GridLayout(4, 4));
        bt = new JButton[16];
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton("" + (i + 1));
            bt[i].setVisible(false);
        }
        for (int i = 0; i < 16; i++) {
            pan.add(bt[i]);
        }
        //pan.setPreferredSize(new Dimension(400,400));
        //b.setPreferredSize(new Dimension(80,30));

        pan.setBounds(5, 5, 400, 400);
        b.setBounds(420, 15, 80, 30);

        fr.add(pan);
        fr.add(b);
        fr.setSize(550, 450);
        fr.setVisible(true);
        b.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        while (true) {
            int x = (int) (Math.random() * 16);
            if (count == 16) {
                JOptionPane.showMessageDialog(fr, "All values generated", "Test game", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            if (!bt[x].isVisible()) {
                bt[x].setVisible(true);
                count++;
                break;
            }
        }

    }

    public static void main(String s[]) {
        new Gridtest();
    }
}