/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author Vikas-PC
 */
public class SumIntegers {
    public static void main(String[] args) {
        int num = 5437659;
        int sum = 0;
        while(num > 0){
            sum+= num%10;
            num = num/10;
//            System.out.println(num);
        }
        System.out.println(sum);
    }
}
