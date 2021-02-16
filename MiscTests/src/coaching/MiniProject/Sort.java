package coaching.MiniProject;

import javax.swing.*;
import java.awt.event.*;

class Sort implements ActionListener {

    JFrame fr;
    String srt[] = {"Name", "Marks", "Roll No."};
    JComboBox cb;
    JLabel lb;

    Sort() {
        fr = new JFrame();
        fr.setLayout(null);
        fr.setSize(200, 100);

        cb = new JComboBox(srt);

        lb = new JLabel("Sort by");


        lb.setBounds(15, 15, 80, 30);
        cb.setBounds(105, 15, 80, 30);

        fr.add(lb);
        fr.add(cb);

        cb.addActionListener(this);

        fr.setVisible(true);
//fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
//fn to be added
    }

    public static void main(String s[]) {
        new Sort();
    }
}
