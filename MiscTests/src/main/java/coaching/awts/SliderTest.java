package coaching.awts;

import javax.swing.*;
import javax.swing.event.*;

class SliderTest implements ChangeListener {

    JFrame fr;
    JSlider jl;
    JLabel lb;

    SliderTest() {
        fr = new JFrame();
        fr.setLayout(null);

        jl = new JSlider(0, 100, 50);
        lb = new JLabel();

        jl.setMajorTickSpacing(10);
        jl.setPaintTicks(true);
        jl.setPaintLabels(true);
        jl.setSnapToTicks(true);

        jl.setBounds(50, 50, 250, 50);
        lb.setBounds(100, 120, 100, 50);

        fr.add(jl);
        fr.add(lb);

        fr.setSize(300, 400);
        fr.setVisible(true);

        jl.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        int val = jl.getValue();
        lb.setText(val + "%");
    }

    public static void main(String s[]) {
        new SliderTest();
    }
}
