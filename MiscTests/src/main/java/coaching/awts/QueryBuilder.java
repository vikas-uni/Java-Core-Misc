package coaching.awts;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class QueryBuilder implements ActionListener, ListSelectionListener {

    JFrame fr;
    JComboBox tabl, cond1, cond2, opr1, opr2;
    DefaultComboBoxModel mod1, mod2;
    JButton ad, rem, all, view;
    ButtonGroup bg;
    JRadioButton and, or, non;
    JCheckBox ord;
    JList fld, sel;
    DefaultListModel lm1, lm2, selmod;
    JScrollPane sp1, sp2;
    JLabel tab, f1, s1, con, opr, val;
    JTextField ta1, ta2;
    String optr[] = {">", "<", ">=", "<="};
    String[] dbTables = {"Student", "Employee"};
    String[] stfields = {"name", "rollno", "marks", "grade"};
    String[] empfields = {"name", "id", "job", "salary"};

    QueryBuilder() {
        fr = new JFrame("Query Builder");
        fr.setLayout(null);
        fr.setSize(400, 470);


        tabl = new JComboBox(dbTables);
        cond1 = new JComboBox();
        cond2 = new JComboBox();
        opr1 = new JComboBox(optr);
        opr2 = new JComboBox(optr);

        mod1 = new DefaultComboBoxModel();
        mod2 = new DefaultComboBoxModel();
        mod1.addElement("name");
        mod1.addElement("rollno");
        mod1.addElement("marks");
        mod1.addElement("grade");
        mod2.addElement("name");
        mod2.addElement("id");
        mod2.addElement("job");
        mod2.addElement("salary");

        ad = new JButton(">>");
        rem = new JButton("<<");
        all = new JButton("Select all");
        view = new JButton("View Query");

        ta1 = new JTextField();
        ta2 = new JTextField();
        ta1.setEditable(true);
        ta2.setEditable(true);

        and = new JRadioButton("AND");
        or = new JRadioButton("OR");
        non = new JRadioButton("NONE");
        non.setSelected(true);

        bg = new ButtonGroup();
        bg.add(and);
        bg.add(or);
        bg.add(non);

        ord = new JCheckBox("Order by");

        fld = new JList();
        sel = new JList();
        fld.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        sel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        lm1 = new DefaultListModel();
        selmod = new DefaultListModel();

        sp1 = new JScrollPane(fld);
        sp2 = new JScrollPane(sel);

        tab = new JLabel("Tables");
        f1 = new JLabel("Fields");
        s1 = new JLabel("Selected");
        con = new JLabel("Condition Field");
        opr = new JLabel("Operator");
        val = new JLabel("Value");



        tab.setBounds(5, 5, 50, 20);
        f1.setBounds(10, 30, 50, 20);
        s1.setBounds(300, 30, 60, 20);
        tabl.setBounds(60, 5, 80, 20);
        sp1.setBounds(5, 50, 100, 150);
        sp2.setBounds(280, 50, 100, 150);
        ad.setBounds(160, 70, 50, 30);
        rem.setBounds(160, 105, 50, 30);
        all.setBounds(160, 140, 100, 30);
        con.setBounds(5, 210, 105, 20);
        opr.setBounds(120, 210, 70, 20);
        val.setBounds(200, 210, 50, 20);
        cond1.setBounds(5, 235, 70, 20);
        opr1.setBounds(120, 235, 70, 20);
        ta1.setBounds(200, 235, 50, 20);
        and.setBounds(15, 270, 50, 20);
        or.setBounds(75, 270, 50, 20);
        non.setBounds(135, 270, 70, 20);
        cond2.setBounds(5, 310, 70, 20);
        opr2.setBounds(120, 310, 70, 20);
        ta2.setBounds(200, 310, 50, 20);
        ord.setBounds(5, 340, 80, 30);
        view.setBounds(15, 390, 100, 30);

        fr.add(tab);
        fr.add(f1);
        fr.add(s1);
        fr.add(tabl);
        fr.add(sp1);
        fr.add(sp2);
        fr.add(ad);
        fr.add(rem);
        fr.add(all);
        fr.add(con);
        fr.add(opr);
        fr.add(val);
        fr.add(cond1);
        fr.add(opr1);
        fr.add(ta1);
        fr.add(and);
        fr.add(or);
        fr.add(non);
        fr.add(cond2);
        fr.add(opr2);
        fr.add(ta2);
        fr.add(ord);
        fr.add(view);

        tabl.addActionListener(this);
        ad.addActionListener(this);
        rem.addActionListener(this);
        all.addActionListener(this);
        cond1.addActionListener(this);
        cond2.addActionListener(this);
        opr1.addActionListener(this);
        opr2.addActionListener(this);
        ord.addActionListener(this);
        view.addActionListener(this);
        and.addActionListener(this);
        or.addActionListener(this);
        non.addActionListener(this);

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tabl) {
            String ss = (String) tabl.getSelectedItem();
            if (ss.equals("Student")) {
                setCond(stfields);
                fld.setModel(lm1);
            } else if (ss.equals("Employee")) {
                setCond(empfields);
                fld.setModel(lm1);
            }

        }

        if (e.getSource() == ad) {
            Object[] o = fld.getSelectedValues();

            DefaultListModel m = (DefaultListModel) fld.getModel();
            for (int i = 0; i < o.length; i++) {
                selmod.addElement(o[i]);
                m.removeElement(o[i]);
            }
            sel.setModel(selmod);
            return;
        }

        if (e.getSource() == rem) {
            Object[] o = sel.getSelectedValues();

            DefaultListModel m = (DefaultListModel) sel.getModel();
            for (int i = 0; i < o.length; i++) {
                lm1.addElement(o[i]);
                m.removeElement(o[i]);
            }
            fld.setModel(lm1);
            return;
        }

        if (non.isSelected()) {
            cond2.setEnabled(false);
            opr2.setEnabled(false);
            ta2.setEnabled(false);
        } else if (and.isSelected() || or.isSelected()) {
            cond2.setEnabled(true);
            opr2.setEnabled(true);
            ta2.setEnabled(true);
        }

    }

    void setCond(String[] ss) {
        cond1.removeAllItems();
        cond2.removeAllItems();
        lm1.clear();
        selmod.clear();
        for (int i = 0; i < ss.length; i++) {
            cond1.addItem(ss[i]);
            cond2.addItem(ss[i]);
            lm1.addElement(ss[i]);

        }
    }

    public void valueChanged(ListSelectionEvent le) {
    }

    public static void main(String[] arg) {
        QueryBuilder qb = new QueryBuilder();
    }
}
