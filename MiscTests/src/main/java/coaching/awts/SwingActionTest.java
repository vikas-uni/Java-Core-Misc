/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coaching.awts;

/**
 *
 * @author ADMIN
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingActionTest extends JFrame {

    public static void main(String[] args) {
        new SwingActionTest().setVisible(true);
    }

    public SwingActionTest() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4, 3));
        String[] Phone = {"7", "8", "9", "4", "5", "6",
            "1", "2", "3", "*", "0", "#"};
        for (int i = 0; i < Phone.length; i++) {
            JButton current;
            cp.add(current = new JButton(Phone[i]));

            current.addActionListener(al);
        }
        pack();
    }
    
    ActionListener al = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print(e.getActionCommand());
        }
    };
}