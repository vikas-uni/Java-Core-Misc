package coaching.Threads;

//not properly implemented
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ThreadGame implements ActionListener, Runnable {

    JFrame fr;
    JButton bt[], b;
    JPanel pan;
    Thread th;
    int num;

    ThreadGame() {
        th = new Thread(this, "Game");
        fr = new JFrame("Thread game");
        fr.setLayout(null);
        b = new JButton("Start");
        pan = new JPanel();
        pan.setLayout(new GridLayout(3, 3));
        bt = new JButton[9];
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton("" + (i + 1));
            bt[i].setVisible(false);
        }
        for (int i = 0; i < 9; i++) {
            pan.add(bt[i]);
        }
        pan.setBounds(5, 5, 300, 300);
        //b.setPreferredSize(new Dimension(80,30));
        b.setBounds(320, 15, 80, 30);

        fr.add(pan);
        fr.add(b);
        fr.setSize(450, 400);
        fr.setVisible(true);
        b.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void tstart() {
        th.start();
    }

    public void run() {
        try {
            for (int i = 0; i < bt.length; i++) {
                th.sleep(2000);
                bt[i].setVisible(true);
            }
        } catch (InterruptedException ie) {
        }
    }

    public void actionPerformed(ActionEvent e) {
        tstart();
    }

    public static void main(String s[]) {
        new ThreadGame();
    }
}