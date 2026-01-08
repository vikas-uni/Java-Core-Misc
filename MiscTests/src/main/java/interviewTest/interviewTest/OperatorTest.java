/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

/**
 *
 * @author ADMIN
 */
public class OperatorTest {
    public static void main(String[] args) {
        byte b = 7, c = 9;
        int x = 8;
        
        b = (byte)(b + c);     //cast necessary
        
        c += b;                 //cast not necessary using compound operator
        
        x *= 2 + 5;            //RHS will be evaluated first.The expression becomes x * (2+5)
        
        System.out.println(b + " " + c + " " + x);
    }
    
}
