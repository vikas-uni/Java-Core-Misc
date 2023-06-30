package coaching.Collection;

//prog to demo ResourceBundle
import java.util.*;
import java.awt.*;
import javax.swing.*;

class ResourceTest {

    static Locale l;
    JFrame fr;
    JButton b1, b2;

    ResourceTest() {
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        ResourceBundle bundle = ResourceBundle.getBundle("MyResource", l);
        b1 = new JButton(bundle.getString("welcome"));
        b2 = new JButton(bundle.getString("gone"));
        fr.add(b1);
        fr.add(b2);
        fr.setSize(200, 300);
        fr.setVisible(true);
    }

    public static void main(String s[]) {
        l = new Locale(s[0], s[1]);
        new ResourceTest();
    }
}