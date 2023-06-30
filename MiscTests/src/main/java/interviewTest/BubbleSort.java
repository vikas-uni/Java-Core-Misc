/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {23,56,-34,89,76,-12,42,-11,86,54,52};
        int temp = 0;
        for (int i = data.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j+1]) {
                    
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for (int i : data) {
            System.out.println(i);
        }
    }
    
}
