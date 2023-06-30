package coaching.awts;

import javax.swing.*;
import java.awt.event.*;

class Swingtest implements ActionListener {

    JFrame fr1, fr2;
    JButton bill, pay, exit;
    JLabel list, amt, total, thnx;
    JCheckBox mp, cam, ip, lt;

    Swingtest() {
        fr1 = new JFrame("Product menu");
        fr1.setVisible(true);
        fr1.setSize(647, 400);
        fr1.setLayout(null);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        bill = new JButton("Get Bill");
        bill.setBounds(120, 120, 80, 30);

        list = new JLabel("Product list");
        list.setBounds(5, 5, 100, 30);

        mp = new JCheckBox("Mobile Phone");
        cam = new JCheckBox("Camera");
        ip = new JCheckBox("I-Pod");
        lt = new JCheckBox("Laptop");

        mp.setBounds(10, 70, 130, 30);
        cam.setBounds(10, 120, 80, 30);
        ip.setBounds(10, 170, 80, 30);
        lt.setBounds(10, 220, 80, 30);

        fr1.add(list);
        fr1.add(mp);
        fr1.add(cam);
        fr1.add(lt);
        fr1.add(ip);
        fr1.add(bill);

        mp.addActionListener(this);
        cam.addActionListener(this);
        ip.addActionListener(this);
        lt.addActionListener(this);
        bill.addActionListener(this);


        fr2 = new JFrame("Billing");
//fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr2.setSize(300, 200);
//fr2.setVisible(true);
        fr2.setLayout(null);

        amt = new JLabel("Total Bill Amount");
        amt.setBounds(5, 5, 120, 30);

        total = new JLabel();
        total.setBounds(50, 35, 50, 30);

        pay = new JButton("Pay");
        pay.setBounds(10, 80, 80, 30);

        exit = new JButton("Exit");
        exit.setBounds(10, 110, 80, 30);
        exit.setVisible(false);

        thnx = new JLabel("Thanks!");
        thnx.setBounds(150, 110, 50, 30);

        pay.addActionListener(this);
        exit.addActionListener(this);
        fr2.add(amt);
        fr2.add(pay);
        fr2.add(total);
        fr2.add(exit);
        fr2.add(thnx);
        thnx.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {

        int mpprice = 0, camprice = 0, ltprice = 0, ipprice = 0;


        if (e.getSource() == bill) {

            if (mp.isSelected() == true) {
                mpprice = 4000;
            }
            if (cam.isSelected() == true) {
                camprice = 12000;
            }
            if (ip.isSelected() == true) {
                ipprice = 3000;
            }
            if (lt.isSelected() == true) {
                ltprice = 34000;
            }


            int tot = 0;
            tot = mpprice + ltprice + camprice + ipprice;
//fr2.add(total);
            fr2.setVisible(true);
            total.setText("" + tot);
            tot = 0;


        }

        if (e.getSource() == pay) {
            exit.setVisible(true);
            thnx.setVisible(true);
        }
        if (e.getSource() == exit) {
            System.exit(1);
        }
    }

    public static void main(String s[]) {
        new Swingtest();
    }
}
