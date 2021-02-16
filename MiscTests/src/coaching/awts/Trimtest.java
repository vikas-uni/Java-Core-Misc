package coaching.awts;

//program to trim a string
import javax.swing.*;
import java.awt.event.*;

class Trimtest implements ActionListener {

    JPanel fr;
    JButton ed;
    JTextArea ta1, ta2;

    Trimtest() {
        fr = new JPanel();
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(400, 200);

        ed = new JButton("Edit");
        ta1 = new JTextArea();
        ta2 = new JTextArea();

        fr.add(ed);
        fr.add(ta1);
        fr.add(ta2);

        ta1.setBounds(10, 10, 300, 40);
        ta2.setBounds(10, 70, 250, 40);
        ed.setBounds(20, 130, 60, 30);
        ed.addActionListener(this);
//fr.setDefaultCloseOperation(JPanel.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String str = new String(ta1.getText());
        if (e.getSource() == ed) {


            str = str.trim();                //trim() removes whitespaces preceding a string



        }

        ta2.setText(str);

    }

    public static void main(String s[]) {
        new Trimtest();
    }
}
