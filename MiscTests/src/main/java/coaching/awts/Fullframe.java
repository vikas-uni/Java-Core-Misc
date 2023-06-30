package coaching.awts;

//prog to implement a full frame
import java.awt.*;

class Fullframe {

    Frame fr;
    Button b;
    Label lb1, lb2;
    TextField tf1, tf2;

    Fullframe() {
        fr = new Frame("Student Form");   //step1- craete object of frame or its subclass
        fr.setLayout(null);             //step2- set layout
        tf1 = new TextField();
        tf2 = new TextField();            //step3- create objects of components 
        lb1 = new Label("Name");
        lb2 = new Label("Marks");
        b = new Button("Submit");

        lb1.setBounds(20, 40, 100, 40);      //step4- create size and location of components
        tf1.setBounds(140, 40, 100, 40);
        lb2.setBounds(20, 120, 100, 40);
        tf2.setBounds(140, 120, 100, 40);
        b.setBounds(50, 160, 120, 50);

        fr.add(lb1);                       //step5-set components on frame
        fr.add(lb2);
        fr.add(tf1);
        fr.add(tf2);
        fr.add(b);

        fr.setSize(300, 400);               //step6- set size of frame 
        fr.setVisible(true);               //step7- make it visible 
    }

    public static void main(String s[]) {
        new Fullframe();
    }
}
