package coaching.MiniProject;

import javax.swing.*;
import java.awt.event.*;

class Add implements ActionListener {

    JPanel fr;
    JButton b;
    JLabel n, c, r;
    JTextField tfn, tfc, tfr;

    Add() {
        fr = new JPanel();
        fr.setLayout(null);

        b = new JButton("Add");
        n = new JLabel("Name");
        c = new JLabel("Course");
        r = new JLabel("Roll no.");

        tfn = new JTextField();
        tfc = new JTextField();
        tfr = new JTextField();

        n.setBounds(15, 15, 50, 30);
        tfn.setBounds(85, 15, 100, 30);
        c.setBounds(15, 55, 50, 30);
        tfc.setBounds(85, 55, 100, 30);
        r.setBounds(15, 95, 80, 30);
        tfr.setBounds(85, 95, 100, 30);
        b.setBounds(20, 135, 60, 30);

        fr.add(n);
        fr.add(c);
        fr.add(r);
        fr.add(b);
        fr.add(tfn);
        fr.add(tfc);
        fr.add(tfr);

        b.addActionListener(this);

        fr.setSize(250, 250);
        fr.setVisible(true);

//fr.setDefaultCloseOperation(JPanel.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String nm = null;
        String cs = null;
        String rn = null;
        if (e.getSource() == b) {                               //functionality to be added
            nm = tfn.getText();
            System.out.println(nm);
            cs = tfc.getText();
            rn = tfr.getText();

            if (nm == null) {
                JOptionPane.showMessageDialog(fr, "Please fill all fields", "Message", JOptionPane.INFORMATION_MESSAGE);
            }


        }

    }

    public static void main(String s[]) {
        new Add();
    }
}