/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.DS;

/**
 *
 * @author Vikas
 */
public class SortArrayMyLogic {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{3,1,78,45,32,19,81,54,24,67};
        
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
