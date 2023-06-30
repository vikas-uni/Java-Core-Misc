/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.DS;

/**
 *
 * @author ADMIN
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {23, 56, 34, 89, 76, 12, 42, 11, 86, 54, 52};
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {

                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        for (int i : data) {
            System.out.println(i);
        }
    }
}
