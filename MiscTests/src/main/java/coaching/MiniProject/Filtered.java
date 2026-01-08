package coaching.MiniProject;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class Filtered implements ListSelectionListener, ActionListener {    //listener for JList
    JFrame fr;
    JList opr1, opr2;
    String optr[] = {">", "<", ">=", "<=", "!=", "=="};
    JLabel mark, val1, val2;
    JScrollPane sp1, sp2;         //list will be added on scroll pane
    JTextField tf1, tf2;
    JButton show;
    JCheckBox and;

    Filtered() {
        fr = new JFrame();
        fr.setLayout(null);

        opr1 = new JList(optr);
        opr1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        opr2 = new JList(optr);
        opr2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        sp1 = new JScrollPane(opr1);
        sp2 = new JScrollPane(opr2);

        and = new JCheckBox("AND");

        mark = new JLabel("Marks");
        val1 = new JLabel("Value");
        val2 = new JLabel("Value");

        tf1 = new JTextField();
        tf2 = new JTextField();
        show = new JButton("show");

        mark.setBounds(10, 15, 80, 30);
        sp1.setBounds(100, 25, 80, 60);
        val1.setBounds(200, 15, 80, 30);

        and.setBounds(10, 100, 80, 30);
        tf1.setBounds(200, 50, 80, 30);

        sp2.setBounds(100, 130, 80, 60);
        val2.setBounds(200, 100, 80, 30);
        tf2.setBounds(200, 140, 80, 30);


        sp2.setVisible(false);
        val2.setVisible(false);
        tf2.setVisible(false);


        show.setBounds(180, 250, 80, 30);


        opr1.addListSelectionListener(this);
        opr2.addListSelectionListener(this);
        show.addActionListener(this);
        and.addActionListener(this);


        fr.add(sp1);
        fr.add(sp2);

        fr.add(mark);
        fr.add(val1);
        fr.add(val2);
        fr.add(tf1);
        fr.add(tf2);
        fr.add(show);
        fr.add(and);


        fr.setSize(400, 400);
        fr.setVisible(true);
//fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent le) {
//fn to be added
    }

    public void actionPerformed(ActionEvent e) {
        if (and.isSelected()) {
            val2.setVisible(true);
            sp2.setVisible(true);
            tf2.setVisible(true);
        } else {
            sp2.setVisible(false);
            val2.setVisible(false);
            tf2.setVisible(false);
        }
//functions to be added
    }

    public static void main(String s[]) {
        new Filtered();
    }
}
