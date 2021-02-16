/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author Admicountistrator
 */
public class Pyramid {

    public static void main(String[] args) {
        int levels = 10;
        int k = 1;
//        int count = levels;
        for (int i = levels; i >= 1; i--) {
            for (int j = 0; j <= i + k; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
//            i--;
            k += 2;
            System.out.println("");
        }
        


    }
}
