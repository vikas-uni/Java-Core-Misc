package coaching.MiniProject;

import javax.swing.*;
import java.awt.event.*;

class Update implements ActionListener {

    JFrame fr;
    JLabel roll, nm, cs, mk;
    JTextField tfroll, tfnm, tfcs, tfmk;
    JButton get, update;

    Update() {
        fr = new JFrame();
        fr.setLayout(null);

        roll = new JLabel("Roll No.");
        nm = new JLabel("Name");
        cs = new JLabel("Course");
        mk = new JLabel("Marks");

        tfroll = new JTextField();
        tfnm = new JTextField();
        tfcs = new JTextField();
        tfmk = new JTextField();

        get = new JButton("Get");
        update = new JButton("Update");

        roll.setBounds(15, 15, 80, 30);
        tfroll.setBounds(105, 15, 80, 30);
        get.setBounds(195, 15, 60, 30);

        nm.setBounds(15, 55, 80, 30);
        cs.setBounds(15, 95, 80, 30);
        mk.setBounds(15, 135, 80, 30);

        tfnm.setBounds(105, 55, 80, 30);
        tfcs.setBounds(105, 95, 80, 30);
        tfmk.setBounds(105, 135, 80, 30);

        update.setBounds(30, 175, 80, 30);

        get.addActionListener(this);
        update.addActionListener(this);

        fr.add(get);
        fr.add(roll);
        fr.add(nm);
        fr.add(cs);
        fr.add(mk);
        fr.add(update);
        fr.add(tfroll);
        fr.add(tfnm);
        fr.add(tfcs);
        fr.add(tfmk);

        fr.setSize(300, 300);
        fr.setVisible(true);
//fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
//functions to be added
    }

    public static void main(String s[]) {
        new Update();
    }
}
