package coaching.awts.imgVu;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ImageView implements ActionListener {

    JFrame fr;
    JLabel lb;
    Icon tn[], full;            //a class of java.awt.Icon to work with images nd icon
    String img[] = {"img1.jpg", "img2.jpg", "img3.jpg", "img4.jpg", "img5.jpg", "img6.jpg", "img7.jpg", "img8.jpg"};
    String ico[] = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg"};
    JButton jb[];

    ImageView() {
        fr = new JFrame("Image Viewer");
        fr.setLayout(null);
        fr.setSize(800, 790);

        tn = new ImageIcon[8];             //ImageIcon() is constructor of Icon class to create icons 


        for (int i = 0; i < ico.length; i++) {
            tn[i] = new ImageIcon(ico[i]);
        }




        lb = new JLabel("", JLabel.CENTER);
        jb = new JButton[8];
        for (int i = 0; i < 8; i++) {
            jb[i] = new JButton(tn[i]);     //sets icons on buttons
        }

        lb.setBounds(10, 10, 750, 600);

        {
            int x = 10, y = 620, n = 1;
            for (int i = 0; i < jb.length; i++) {
                jb[i].setBounds(x, y, 50, 40);


                if (n == 4) {
                    x = 10;
                    y += 60;
                    n = 1;
                } else {
                    x += 80;
                    n++;
                }
            }
        }

        fr.add(lb);
        for (int i = 0; i < jb.length; i++) {
            fr.add(jb[i]);
        }

        for (int i = 0; i < jb.length; i++) {
            jb[i].addActionListener(this);
        }

        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < jb.length; i++) {
            if (e.getSource() == jb[i]) {
                full = new ImageIcon(img[i]);

                lb.setIcon(full);
            }
        }
    }

    public static void main(String s[]) {
        new ImageView();
    }
}
