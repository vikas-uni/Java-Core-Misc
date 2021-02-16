/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vikas-PC
 */
public class ClassLoadTest {
    public static void main(String[] args) {
        try {
            Class.forName("Custom");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassLoadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
