package coaching.awts;

//the first applet
import java.awt.*;

class FirstFrame {

    FirstFrame() {
        Frame fr = new Frame("my frame");    //step1-create object of Frame class or its subclass
        fr.setLayout(null);                //set the layout(remove predefined layout)
        fr.setSize(400, 300);               //set size of frame(width,height)
        fr.setVisible(true);               //make frame visible 
    }

    public static void main(String s[]) {
        new FirstFrame();
    }
}