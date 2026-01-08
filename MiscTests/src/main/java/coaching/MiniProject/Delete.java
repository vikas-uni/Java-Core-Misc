package coaching.MiniProject;

import javax.swing.*;
import java.awt.event.*;

class Delete implements ActionListener {

    JFrame fr;
    JLabel roll, info, rec;
    JTextField tf;
    JButton del;

    Delete() {
        fr = new JFrame("Delete Record");
        fr.setLayout(null);

        roll = new JLabel("Roll No.");
        info = new JLabel("Record Deleted");
        rec = new JLabel("", JLabel.CENTER);

        tf = new JTextField();
        del = new JButton();

        del.setBounds(195, 15, 80, 30);
        roll.setBounds(15, 15, 80, 30);
        tf.setBounds(105, 15, 80, 30);
        info.setBounds(30, 55, 100, 30);
        rec.setBounds(30, 90, 80, 30);

        del.addActionListener(this);


        fr.add(del);
        fr.add(roll);

        fr.add(rec);
        fr.add(info);
        fr.add(tf);


        fr.setSize(300, 200);
        fr.setVisible(true);
//fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
//functions to be added
    }

    public static void main(String s[]) {
        new Delete();
    }
}
