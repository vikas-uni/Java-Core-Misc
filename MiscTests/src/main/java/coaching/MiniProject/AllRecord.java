package coaching.MiniProject;


import javax.swing.*;
import javax.swing.table.*;
//import java.awt.event.*;

class AllRecord {

    JFrame fr;
    JTable jt;
    DefaultTableModel model;
    JScrollPane sp;

    AllRecord() {
        fr = new JFrame();
        fr.setLayout(null);
        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Roll No.");
        model.addColumn("Marks");
        model.addColumn("Course");

        jt = new JTable(model);

        sp = new JScrollPane(jt);

        sp.setBounds(10, 10, 300, 200);

        fr.add(sp);
        fr.setSize(340, 260);
        fr.setVisible(true);
//fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String s[]) {
        new AllRecord();
    }
}
