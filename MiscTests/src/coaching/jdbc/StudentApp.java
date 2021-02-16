package coaching.jdbc;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

class StudentApp implements ActionListener {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    JFrame fr, fr2;
    JTable jt;
    JLabel lb1, lb2, lb3, lb4;
    JTextField tf1, tf2, tf3, tf4;
    JButton b1, b2, b3, b4, b5;

    StudentApp() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:mydsn");
            fr = new JFrame("Student Application");
            fr.setLayout(new FlowLayout());

            fr2 = new JFrame();
            fr2.setLayout(null);
            fr2.setSize(300, 300);
            fr2.setVisible(false);


            lb1 = new JLabel("Name");
            lb2 = new JLabel("Roll no");
            lb3 = new JLabel("Marks");
            lb4 = new JLabel("Grade");
            tf1 = new JTextField();
            tf2 = new JTextField();
            tf3 = new JTextField();
            tf4 = new JTextField();
            tf1.setPreferredSize(new Dimension(100, 40));
            tf2.setPreferredSize(new Dimension(100, 40));
            tf3.setPreferredSize(new Dimension(100, 40));
            tf4.setPreferredSize(new Dimension(100, 40));
            b1 = new JButton("Add");
            b2 = new JButton("Delete");
            b3 = new JButton("Update");
            b4 = new JButton("Report");
            b5 = new JButton("Search");

            fr.add(lb1);
            fr.add(tf1);
            fr.add(lb2);
            fr.add(tf2);
            fr.add(lb3);
            fr.add(tf3);
            fr.add(lb4);
            fr.add(tf4);
            fr.add(b1);
            fr.add(b2);
            fr.add(b3);
            fr.add(b4);
            fr.add(b5);

            fr.setSize(400, 400);
            fr.setVisible(true);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                ps = con.prepareStatement("insert into student values(?,?,?,?)");
                ps.setString(1, tf1.getText());
                ps.setString(2, tf2.getText());
                ps.setInt(3, Integer.parseInt(tf3.getText()));
                ps.setString(4, tf4.getText());
                ps.executeUpdate();
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ae.getSource() == b2) {
            try {
                ps = con.prepareStatement("delete from student where rollno=?");
                ps.setString(1, tf2.getText());
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ae.getSource() == b3) {
            try {
                ps = con.prepareStatement("update table student set name=?,marks=?,grade=? where rollno=?");
                ps.setString(1, tf1.getText());
                ps.setInt(2, Integer.parseInt(tf3.getText()));
                ps.setString(3, tf4.getText());
                ps.setString(4, tf2.getText());
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ae.getSource() == b4) {
            try {
                ps = con.prepareStatement("select * from student");
                rs = ps.executeQuery();

                DefaultTableModel mod = new DefaultTableModel();
                JTable jt = new JTable();
                mod.addColumn("Name");
                mod.addColumn("rollno");
                mod.addColumn("marks");
                mod.addColumn("grade");

                JScrollPane sp = new JScrollPane(jt);
                sp.setBounds(5, 5, 290, 290);
                fr2.add(sp);
                String row[] = new String[4];
                while (rs.next()) {
                    row[0] = rs.getString(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    row[3] = rs.getString(4);
                    mod.addRow(row);
                }
                jt.setModel(mod);
                fr2.setVisible(true);
//new ShowRecord(rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ae.getSource() == b5) {
            try {
                ps = con.prepareStatement("select * from student where rollno=?");
                ps.setString(1, tf2.getText());
                rs = ps.executeQuery();
                rs.next();
                tf1.setText(rs.getString(1));
                tf3.setText(rs.getString(2));
                tf4.setText(rs.getString(3));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String s[]) {
        new StudentApp();
    }
}