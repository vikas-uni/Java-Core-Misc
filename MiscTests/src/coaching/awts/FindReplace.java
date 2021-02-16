package coaching.awts;

//not implemented properly
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class FindReplace implements ActionListener {

    JFrame fr;
    JTextArea ta;
    JTextField tf1, tf2;
    JLabel fn, rep;
    JButton find, replace;

    FindReplace() {
        fr = new JFrame("Find and Replace");
        fr.setSize(600, 400);

        ta = new JTextArea();
        fn = new JLabel("Find what");
        rep = new JLabel("Replace with");
        find = new JButton("Find");
        replace = new JButton("Replace all");
        tf1 = new JTextField();
        tf2 = new JTextField();

        ta.setBounds(10, 10, 550, 100);
        fn.setBounds(15, 140, 80, 30);
        tf1.setBounds(100, 140, 80, 30);
        find.setBounds(190, 140, 80, 30);
        rep.setBounds(15, 180, 80, 30);
        tf2.setBounds(115, 180, 80, 30);
        replace.setBounds(205, 180, 100, 30);

        ta.setLineWrap(true);

        fr.add(ta);
        fr.add(fn);
        fr.add(rep);
        fr.add(find);
        fr.add(replace);
        fr.add(tf1);
        fr.add(tf2);

        fr.setLayout(null);
        fr.setVisible(true);

        find.addActionListener(this);
        replace.addActionListener(this);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        StringBuffer txt = new StringBuffer(ta.getText());

        if (e.getSource() == find) {
            String st = tf1.getText();
            int n = st.length();
            int i = txt.indexOf(st);


            if (i != 0) {
            }



        }


        if (e.getSource() == replace) {
            String st = tf1.getText();
            String st2 = tf2.getText();
            int nos = 0;
            String gt[] = new String[nos];
            int n = st.length();

            for (int i = 0; i <= txt.length() - n; i++) {
                if (st.equals(txt.substring(i, (i + n)))) {
                    ta.select(i, (i + n));
                    nos++;
                    ta.replaceSelection(st2);
                }
            }
        }
    }

    public static void main(String s[]) {
        new FindReplace();
    }
}
