/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewTest;

/**
 *
 * @author Administrator
 */
public class ArraySum {
    
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int len = arr.length;
        int sum = 0;
        
        for (int i = len; i >=0; i--) {   
            int temp = arr[0];
            for (int j = 1; j < len; j++) {
                sum = temp + arr[j];
                arr[j-1] = sum;
              System.out.println("s"+sum);
            }
            len--;
        }       
        System.out.println("a"+arr[0]);
        
    }    
}
