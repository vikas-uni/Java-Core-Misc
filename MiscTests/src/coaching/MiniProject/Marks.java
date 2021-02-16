package coaching.MiniProject;

import javax.swing.*;
import java.awt.event.*;

class Marks implements ActionListener {

    JFrame fr;
    JComboBox cbroll;
    JLabel rollno, name, course, marks;
    JTextField tf1, tf2, tf3;
    JButton submit;

    Marks() {
        fr = new JFrame();
        fr.setLayout(null);

        cbroll = new JComboBox();
        cbroll.setMaximumRowCount(5);
        rollno = new JLabel("Roll No");
        name = new JLabel("Name");
        course = new JLabel("Course");
        marks = new JLabel("Marks");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        submit = new JButton("submit");

        rollno.setBounds(10, 15, 80, 30);
        name.setBounds(10, 55, 80, 30);
        course.setBounds(10, 95, 80, 30);
        marks.setBounds(10, 135, 80, 30);

        cbroll.setBounds(100, 15, 50, 30);
        tf1.setBounds(100, 55, 80, 30);
        tf2.setBounds(100, 95, 80, 30);
        tf3.setBounds(100, 135, 80, 30);
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);

        submit.setBounds(190, 175, 80, 30);

        submit.addActionListener(this);


        fr.add(rollno);
        fr.add(cbroll);

        fr.add(marks);
        fr.add(course);
        fr.add(name);
        fr.add(submit);

        fr.add(tf1);
        fr.add(tf2);
        fr.add(tf3);


        fr.setSize(400, 400);
        fr.setVisible(true);
//fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
//functions to be added
    }

    public static void main(String s[]) {
        new Marks();
    }
}
