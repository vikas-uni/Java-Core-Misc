/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

/**
 *
 * @author Vikas-PC
 */
public class NoOfDigits {
    public static void main(String[] args) {
        int n = 58767868;
        int d = 0;
        int temp = n;
         while(temp >= 1){
             d++;
             temp = temp/10;
             System.out.println(temp);
             
         }
         System.out.println("digits:"+d);
//         System.out.println(3/4);
    }
}
