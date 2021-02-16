package coaching.awts;

//prog to demo tabbed pane
import javax.swing.*;

class TabbedPaneTest {

    JFrame fr;
    JTabbedPane pane;                                   //a ref variable to tabbed pane
    TabbedPaneTest() {
        fr = new JFrame("Tab test");
        fr.setLayout(null);

        Trimtest trtest = new Trimtest();                    //objects of other frames classes created
        Edittest etest = new Edittest();

        pane = new JTabbedPane(JTabbedPane.TOP);            //tabbed pane created
        pane.addTab("First", trtest.fr);                  //frame componebt of trimtest added
        pane.addTab("second", etest.fr);

        pane.setBounds(10, 10, 350, 350);                   //set pane bounds

        fr.add(pane);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }

    public static void main(String s[]) {
        new TabbedPaneTest();
    }
}
