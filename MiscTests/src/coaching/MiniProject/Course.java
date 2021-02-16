package coaching.MiniProject;

import javax.swing.*;
import java.awt.event.*;

class Course implements ActionListener {

    JFrame fr;
    String f[] = {"15000", "25000", "12000", "40000"};
    String d[] = {"3 years", "2 years", "3 years", "2 years"};
    String courses[] = {"BCA", "MCA", "BBA", "MBA"};
    JComboBox cb;
    JLabel dur, fee;
    JTextField tdur, tfee;

    Course() {
        fr = new JFrame();
        fr.setLayout(null);

        cb = new JComboBox(courses);
        dur = new JLabel("Duration: ");
        fee = new JLabel("Fees: ");

        tdur = new JTextField();
        tfee = new JTextField();

        cb.setBounds(15, 20, 80, 30);
        dur.setBounds(110, 20, 55, 30);
        fee.setBounds(110, 70, 50, 30);
        tdur.setBounds(180, 20, 80, 30);
        tfee.setBounds(180, 70, 80, 30);

        tdur.setEditable(false);
        tfee.setEditable(false);

        fr.add(cb);
        fr.add(dur);
        fr.add(fee);
        fr.add(tdur);
        fr.add(tfee);
        cb.addActionListener(this);

        fr.setSize(450, 250);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int i = cb.getSelectedIndex();
        tfee.setText(f[i]);
        tdur.setText(d[i]);


    }

    public static void main(String s[]) {
        new Course();
    }
}
