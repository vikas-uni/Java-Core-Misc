package coaching.awts;

//prog to style text
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

class TextStyle implements ActionListener {

    JFrame fr;
    JTextArea ta;
    JCheckBox bl, it, pl;
    JLabel fn, bk, frg;
    String col[] = {"Red", "Green", "Blue", "Yellow"};
    JRadioButton rb[];

    TextStyle() {
        fr = new JFrame("Text Styler");
        fr.setLayout(null);
        fr.setSize(400, 700);

        ta = new JTextArea();

        bl = new JCheckBox("Bold");
        it = new JCheckBox("Italic");
        pl = new JCheckBox("plain");

        fn = new JLabel("Font");
        bk = new JLabel("Background");
        frg = new JLabel("Foreground");

        ButtonGroup bg = new ButtonGroup();   //button group created to add similar buttons
        ButtonGroup fg = new ButtonGroup();
        rb = new JRadioButton[8];             //array of radio button references created

        for (int i = 0; i < 4; i++) {
            rb[i] = new JRadioButton(col[i]);
        }
        for (int i = 4, j = 0; i < 8; i++, j++) {
            rb[i] = new JRadioButton(col[j]);
        }

        ta.setBounds(10, 10, 350, 150);
        fn.setBounds(10, 190, 50, 30);
        bl.setBounds(10, 240, 80, 30);
        it.setBounds(10, 290, 80, 30);
        pl.setBounds(10, 340, 80, 30);

        bk.setBounds(100, 190, 80, 30);
        for (int i = 0, y = 240; i < 4; i++) {
            rb[i].setBounds(100, y, 80, 30);
            y += 50;
        }
        frg.setBounds(100, 430, 80, 30);
        for (int i = 4, y = 470; i < 8; i++) {
            rb[i].setBounds(100, y, 80, 30);
            y += 50;
        }

        for (int i = 0; i < 4; i++) {
            bg.add(rb[i]);
        }
        for (int i = 4; i < 8; i++) {
            fg.add(rb[i]);
        }

        fr.add(ta);
        fr.add(fn);
        fr.add(bk);
        fr.add(frg);
        fr.add(bl);
        fr.add(it);
        fr.add(pl);

        for (int i = 0, k = 4; i < 4; i++, k += 1) {
            fr.add(rb[i]);
            fr.add(rb[k]);
        }

        fr.setVisible(true);
        bl.addActionListener(this);
        it.addActionListener(this);
        pl.addActionListener(this);
        for (int i = 0; i < 8; i++) {
            rb[i].addActionListener(this);
        }
//bg.addActionListener(this);
//fg.addActionListener(this);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        Color c = new Color(0, 0, 0);
        {
            if (bl.isSelected()) {
                Font f = new Font(ta.getText(), Font.BOLD, 20);
                ta.setFont(f);
            }
            if (it.isSelected()) {
                Font f = new Font(ta.getText(), Font.ITALIC, 20);
                ta.setFont(f);
            }
            if ((bl.isSelected()) && (it.isSelected())) {
                Font f = new Font(ta.getText(), Font.BOLD + Font.ITALIC, 20);
                ta.setFont(f);
            }
            if (pl.isSelected()) {
                bl.setSelected(false);
                it.setSelected(false);
                Font f = new Font(ta.getText(), Font.PLAIN, 20);
                ta.setFont(f);
            }
        }
        if (rb[0].isSelected()) {
            ta.setBackground(Color.RED);
        }
        if (rb[1].isSelected()) {
            ta.setBackground(Color.GREEN);
        }
        if (rb[2].isSelected()) {
            ta.setBackground(Color.BLUE);
        }
        if (rb[3].isSelected()) {
            ta.setBackground(Color.YELLOW);
        }
        if (rb[4].isSelected()) {
            ta.setForeground(Color.RED);
        }
        if (rb[5].isSelected()) {
            ta.setForeground(Color.GREEN);
        }
        if (rb[6].isSelected()) {
            ta.setForeground(Color.BLUE);
        }
        if (rb[7].isSelected()) {
            ta.setForeground(Color.YELLOW);
        }


    }

    public static void main(String s[]) {
        new TextStyle();
    }
}
