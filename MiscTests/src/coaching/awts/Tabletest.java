package coaching.awts;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

class Tabletest implements ActionListener {

    JFrame fr1, fr2;
    JTable table;
    JTextField tfname, tfroll, tfmarks;
    JButton badd, bsubmit;
    DefaultTableModel model;        //model for JTable
    JScrollPane spane;

    Tabletest() {
        fr1 = new JFrame();
        fr2 = new JFrame();
        fr1.setLayout(null);
        fr2.setLayout(null);

        table = new JTable();
        model = new DefaultTableModel();
        model.addColumn("Name");             //add columns to model
        model.addColumn("Roll No");
        model.addColumn("Marks");

        table.setModel(model);                //model is set on table
        spane = new JScrollPane(table);         //table is set on scroll pane
        spane.setBounds(40, 50, 200, 200);
        fr2.add(spane);                      //scroll pane is set on frame 2
        tfname = new JTextField();
        tfroll = new JTextField();
        tfmarks = new JTextField();

        tfname.setBounds(40, 50, 100, 50);
        tfroll.setBounds(40, 120, 100, 50);
        tfmarks.setBounds(40, 190, 100, 50);

        badd = new JButton("Add");
        badd.setBounds(10, 260, 60, 50);
        bsubmit = new JButton("Submit");
        bsubmit.setBounds(140, 260, 80, 50);

        fr1.add(tfname);
        fr1.add(tfroll);
        fr1.add(tfmarks);
        fr1.add(badd);
        fr1.add(bsubmit);

        fr1.setSize(400, 400);
        fr2.setSize(300, 300);
        fr1.setVisible(true);
        badd.addActionListener(this);
        bsubmit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == badd) {
            String row[] = new String[3];
            row[0] = tfname.getText();              //this will add specified values in rows it specified positions
            row[1] = tfroll.getText();
            row[2] = tfmarks.getText();
            model.addRow(row);
            tfname.setText("");
            tfroll.setText("");
            tfmarks.setText("");
        }
        if (e.getSource() == bsubmit) {
            fr2.setVisible(true);
        }
    }

    public static void main(String s[]) {
        new Tabletest();
    }
}
