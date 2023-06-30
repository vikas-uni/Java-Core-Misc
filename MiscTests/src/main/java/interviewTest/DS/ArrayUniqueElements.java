/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.DS;

/**
 *
 * @author Vikas-PC
 */
public class ArrayUniqueElements {

    public static void main(String[] args) {
        int[] arr = {12, 34, 76, 82, 12, 30, 45, 40, 30, 32, 45, 30, 82,82,90};

        //sort the array
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //--------------end sorting-------------

        for (int i : arr) {
            System.out.println(i);
        }
        //-------count unique elements-----------
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            count++;
        }
        System.out.println("unique " + count);
        //------------unique count end-------------

        //-------------create new array and populate------------
        int[] out = new int[count];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                out[temp] = arr[i];
                break;
            }
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                out[temp] = arr[i];
                temp++;
            }
        }

        for (int i : out) {
            System.out.println(i);
        }
    }
}
