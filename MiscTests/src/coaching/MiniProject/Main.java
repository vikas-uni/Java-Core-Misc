package coaching.MiniProject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Main implements ActionListener {

    Add ad;
    School sc;
    JFrame fr;
    JPanel panel;
    JMenuBar bar;
    JMenu info, student, report, exam;
    JMenuItem course, school, adds, update, delete, all, sort, filter, marks;
    CardLayout clayout;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;

    Main() {
        fr = new JFrame("Student info");
        panel = new JPanel();                               //panel object created
        clayout = new CardLayout();                     //card layout object created
        panel.setLayout(clayout);                      //card layout applied to panel
        fr.setLayout(new FlowLayout());                //flow layout applied to frame

        bar = new JMenuBar();

        info = new JMenu("Info.");                        //menus created
        student = new JMenu("Student");
        report = new JMenu("Report");
        exam = new JMenu("Exam");

        course = new JMenuItem("Course");               //menu items created
        school = new JMenuItem("School");
        adds = new JMenuItem("Add");
        delete = new JMenuItem("Delete");
        update = new JMenuItem("Update");
        all = new JMenuItem("All");
        sort = new JMenuItem("Sort");
        filter = new JMenuItem("Filtered");
        marks = new JMenuItem("Marks");

        info.add(course);                              //menu items added to respective menus
        info.add(school);

        student.add(adds);
        student.add(update);
        student.add(delete);

        report.add(all);
        report.add(sort);
        report.add(filter);

        exam.add(marks);

        bar.add(info);                    //menu items added to menu bar
        bar.add(student);
        bar.add(report);
        bar.add(exam);

        fr.setJMenuBar(bar);              //menu bar set to frame


        ad = new Add();
        System.out.println(ad);
        sc = new School();
//l1=new JLabel(ad);              //experimental
        panel.add("Add", ad.fr);
        panel.add(sc.fr, "School");

        adds.addActionListener(this);
        school.addActionListener(this);


        fr.add(panel);
        fr.setSize(500, 500);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == adds) {
            System.out.println("in add");
            clayout.show(panel, "Add");
        }
        if (e.getSource() == school) {
            clayout.show(panel, "School");
            System.out.println("school");
        }
    }

    public static void main(String s[]) {

        new Main();
    }
}
