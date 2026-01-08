package coaching.awts;

//prog for a small func calculator(implementation of TextListener)
import java.awt.*;
import java.awt.event.*;

class Smallcalc implements ActionListener, TextListener {

    int n1, n2;
    float res;
    Frame fr;
    TextField tf1, tf2, tr;
    Button ad, sub, mul, div;
    Label l1, l2, lr;

    Smallcalc() {
        fr = new Frame("Mini calc");
        fr.setLayout(null);
        fr.setSize(400, 400);
        fr.setVisible(true);
        tf1 = new TextField();
        tf1.setBounds(120, 40, 70, 30);
        tf2 = new TextField();
        tf2.setBounds(120, 90, 70, 30);
        tr = new TextField();
        tr.setBounds(150, 130, 100, 30);
        tf1.addTextListener(this);
        tf2.addTextListener(this);
        l1 = new Label("No1");
        l1.setBounds(70, 40, 30, 20);
        l2 = new Label("No2");
        l2.setBounds(70, 90, 30, 20);
        lr = new Label("Result");
        lr.setBounds(80, 130, 50, 30);
        ad = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");
        ad.setBounds(30, 200, 30, 20);
        sub.setBounds(70, 200, 50, 20);
        mul.setBounds(130, 200, 50, 20);
        div.setBounds(190, 200, 50, 20);

        fr.add(tf1);
        fr.add(tf2);
        fr.add(tr);
        fr.add(l1);
        fr.add(l2);
        fr.add(lr);
        fr.add(ad);
        fr.add(sub);
        fr.add(mul);
        fr.add(div);
        tf1.addTextListener(this);
        tf2.addTextListener(this);
        ad.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void textValueChanged(TextEvent t) {
        try {
            if (t.getSource() == tf1) {
                n1 = Integer.parseInt(tf1.getText());
            }


            if (t.getSource() == tf2) {
                n2 = Integer.parseInt(tf2.getText());
            }
        } catch (NumberFormatException e) {
            return;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ad) {
            res = n1 + n2;
        } else if (e.getSource() == sub) {
            res = n1 - n2;
        } else if (e.getSource() == mul) {
            res = n1 * n2;
        } else if (e.getSource() == div) {
            res = (float) n1 / n2;
        }
        tr.setText("" + res);
    }

    public static void main(String s[]) {
        new Smallcalc();

    }
}