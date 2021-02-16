/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

/**
 *
 * @author ADMIN this class adds the numbers represented as strings without using Integer.parseInt
 */
public class StringNumberAdd {

    public static void main(String[] args) {
        String s1 = "458322";
        String s2 = "6542410";
       
        
        int num1 = 0;
        int num2 = 0;
        
        for (int i = s1.length()-1, j = 0; i >= 0; i--, j++) {
            
            int multiplier = (int)Math.pow(10.0, j);
            num1 += multiplier*(s1.charAt(i)-'0');
            
//            System.out.println(num1+"  "+multiplier);

        }
        for (int i = s2.length()-1, j = 0; i >= 0; i--, j++) {
            
            int multiplier = (int)Math.pow(10.0, j);
            num2 += multiplier*(s2.charAt(i)-'0');
        }
        System.out.println(num1 + num2);
    }
}
