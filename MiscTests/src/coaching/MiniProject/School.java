package coaching.MiniProject;

import javax.swing.*;
//import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

class School {

    JPanel fr;
    Font f;
    JTextArea ta;
    JLabel lb;

    School() {
        fr = new JPanel();
        fr.setLayout(null);
        fr.setSize(400, 500);

        lb = new JLabel("ABC Institute");
        ta = new JTextArea();

        f = new Font("Arial Black", Font.BOLD + Font.ITALIC, 20);

        lb.setFont(f);

        lb.setBounds(15, 15, 190, 80);
        ta.setBounds(15, 100, 300, 200);

        fr.add(lb);
        fr.add(ta);

        fr.setVisible(true);
//fr.setDefaultCloseOperation(JPanel.EXIT_ON_CLOSE);
    }

    public static void main(String s[]) {
        new School();
    }
}
