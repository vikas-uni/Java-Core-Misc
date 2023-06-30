package coaching.Threads;

//A Full function timer
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Timetest implements ActionListener {

    JFrame fr;
    JTextField tf1, tf2, tf3;
    JButton b1, b2;
    JLabel lb1, lb2, lb3;
    int count = 1;
    TimeThread t;                                 //thread variable
    int num, min, sec;

    Timetest() {

        t = new TimeThread(this);

        fr = new JFrame("Timer");
        fr.setLayout(null);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);

        b1 = new JButton();
        b1.setText("Start");
        b2 = new JButton("Stop");
        lb1 = new JLabel("Minutes");
        lb2 = new JLabel("Seconds");
        lb3 = new JLabel("MilliSeconds");

        lb1.setBounds(5, 5, 80, 30);
        tf1.setBounds(5, 40, 80, 30);
        lb2.setBounds(95, 5, 80, 30);
        tf2.setBounds(95, 40, 80, 30);
        lb3.setBounds(185, 5, 80, 30);
        tf3.setBounds(185, 40, 80, 30);

        b1.setBounds(10, 100, 100, 30);
        b2.setBounds(120, 100, 80, 30);

        fr.add(tf1);
        fr.add(tf2);
        fr.add(tf3);
        fr.add(lb1);
        fr.add(lb2);
        fr.add(lb3);
        fr.add(b1);
        fr.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 210);
        fr.setVisible(true);
    }

    public void beg() {
        tf3.setText("" + num);
        num++;
        if (num == 100) {
            num = 0;
            sec++;

            if (sec == 60) {
                sec = 0;
                min++;
                tf1.setText("" + min);
            }
            tf2.setText("" + sec);
        }
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            if (count == 1) {
                t.strt();                             //start thread
                b1.setText("Pause");
                count = 2;
            } else if (count == 2) {
                t.stop();                          //interrupt thread
                b1.setText("Resume");
                count = 1;
            }
        }


        if (ae.getSource() == b2) {
            t.stop();
            b1.setText("Start");

            tf1.setText("");
            tf2.setText("");
            tf3.setText("");

            count = 1;
            num = sec = min = 0;

        }
    }

    public static void main(String s[]) {
        Timetest tt = new Timetest();

    }
}

//Underlying code is for thread
class TimeThread implements Runnable {

    int num, min, sec;
    Thread t;
    Timetest tt;

    TimeThread(Timetest temp) {
        t = new Thread(this, "Count");
        tt = temp;
    }
    int cnt = 0;
    boolean itr = true;

    public void strt() {
        if (cnt == 0) {
            cnt = 1;
            t.start();
        } else {
            itr = true;
        }
    }

    public void run() {
        try {
            while (true) {
                while (itr) {

                    tt.beg();
                    t.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            itr = false;
        }



    }

    public void stop() {
        itr = false;
    }
}
//thread code finished 




/* another code for iteration

for(;;){
 try{
    tf3.setText(""+num);
     num++;
   Thread.sleep(10);
  
 
   }
  catch(InterruptedException ie){
  break;
   }
  if(num==100){
       num=0;
         sec++;
	
	  if(sec==60){
	    sec=0;
		min++;
		  tf1.setText(""+min);
		  }
		  tf2.setText(""+sec);
	   } 
 
 }
 */