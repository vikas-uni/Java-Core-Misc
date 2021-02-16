package coaching.awts;

import javax.swing.*;
import java.awt.event.*;

class OnlineTest implements ActionListener {

    JFrame fr1, fr2;
    JLabel lbques, lbresult;
    JRadioButton lbans[];
    JButton bnext, bsubmit, bexit;
    int ans[] = {1, 2, 1, 4, 3};
    String ques[] = {"s as a sas a", "s as as a s", "asa s as ", "sd s d sd ", " d ads as a s", "asd as a s"};
    String options[][] = {{"abc", "xyz", "mno", "hij"}, {"def", "jkl", "qwe", "rty"}, {"abc", "xyz", "mno", "hij"}, {"abc", "xyz", "mno", "hij"}, {"abc", "xyz", "mno", "hij"}};
    int count, result;

    OnlineTest() {
        lbans = new JRadioButton[4];
        ButtonGroup bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            lbans[i] = new JRadioButton(options[0][i]);
            bg.add(lbans[i]);
        }
        fr1 = new JFrame("Online Test Paper");
        fr2 = new JFrame("Result");
        fr1.setLayout(null);
        fr2.setLayout(null);

        lbques = new JLabel(ques[0]);
        lbresult = new JLabel();
        bnext = new JButton("next");
        bsubmit = new JButton("submit");
        bexit = new JButton("bexit");

        lbques.setBounds(30, 40, 200, 40);
        for (int y = 100, i = 0; i < 4; i++) {
            lbans[i].setBounds(30, y, 150, 40);
            y += 60;
        }
        bnext.setBounds(50, 350, 100, 50);
        bsubmit.setBounds(180, 350, 100, 50);

        fr1.add(lbques);
        for (int i = 0; i < 4; i++) {
            fr1.add(lbans[i]);
        }
        fr1.add(bnext);
        fr1.add(bsubmit);
        bsubmit.setVisible(false);

        lbresult.setBounds(50, 50, 200, 50);
        bexit.setBounds(70, 120, 100, 50);

        fr2.add(lbresult);
        fr2.add(bexit);

        fr1.setSize(500, 500);
        fr2.setSize(300, 200);
        fr1.setVisible(true);

        bnext.addActionListener(this);
        bsubmit.addActionListener(this);
        bexit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent al) {
        if (al.getSource() == bnext) {
            int selected;
            if (lbans[0].isSelected()) {
                selected = 1;
            } else if (lbans[1].isSelected()) {
                selected = 2;
            } else if (lbans[2].isSelected()) {
                selected = 3;
            } else {
                selected = 4;
            }
            if (ans[count] == selected) {
                result++;
            }
            count++;
            for (int i = 0; i < 4; i++) {
                lbans[i].setText(options[count][i]);
            }
            lbques.setText(ques[count]);
            if (count == 4) {
                bnext.setEnabled(false);
                bsubmit.setVisible(true);
            }
        }
        if (al.getSource() == bsubmit) {
            lbresult.setText(result + " ans are correct");
            fr2.setVisible(true);
        }
        if (al.getSource() == bexit) {
            System.exit(1);
        }
    }

    public static void main(String s[]) {
        new OnlineTest();
    }
}
