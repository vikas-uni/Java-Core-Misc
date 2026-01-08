package coaching.awts.cardLayout;

//prog to demo CardLayout
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class CardLayoutTest implements ActionListener {

    JPanel panel;                                      //remember,cardlayout is only applicable to panel
    JFrame fr;
    JMenuBar mbar;
    JMenu menu;
    CardLayout clayout;                            //declare varible of card layout
    JMenuItem i1, i2, i3;
    JLabel lb1, lb2, lb3;

    CardLayoutTest() {
        panel = new JPanel();
        fr = new JFrame("Card Test");
        clayout = new CardLayout();
        panel.setLayout(clayout);                     //cardlayout set to panel;
        fr.setLayout(new FlowLayout());
        mbar = new JMenuBar();                          //menu bar created 
        menu = new JMenu("Images");                    //menu created

        i1 = new JMenuItem("First");
        i2 = new JMenuItem("Second");
        i3 = new JMenuItem("Third");

        menu.add(i1);                               //menus added
        menu.add(i2);
        menu.add(i3);

        mbar.add(menu);                             //menu added to menu bar

        fr.setJMenuBar(mbar);

        lb1 = new JLabel(new ImageIcon("1.jpg"));
        lb2 = new JLabel(new ImageIcon("2.jpg"));
        lb3 = new JLabel(new ImageIcon("3.jpg"));

        panel.add(lb1, "A");                        //label components added to panel with specified name
        panel.add(lb2, "B");
        panel.add(lb3, "C");

        fr.add(panel);                             //panel added to frame

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);

        fr.setSize(500, 500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == i1) {
            clayout.show(panel, "A");                        //this method puts the required panel on frame
        }
        if (e.getSource() == i2) {
            clayout.show(panel, "B");
        }
        if (e.getSource() == i3) {
            clayout.show(panel, "C");
        }
    }

    public static void main(String s[]) {
        new CardLayoutTest();
    }
}
