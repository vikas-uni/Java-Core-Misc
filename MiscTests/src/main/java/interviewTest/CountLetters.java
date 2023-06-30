/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN counts no. of occurrence of an alphabet in a string and
 * displays highest counting alphabet
 */
public class CountLetters {

    public static void main(String[] args) {
        String input = "ADFDSRWUAAAAAAASHFFDNMGDSERSDFAAIOOOODG";
        int count = 0;
        String output = "";
        for (int i = 0; i < input.length() - 1; i++) {
            int max = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    max++;
                }
                if (max >= count) {
                    count = max;
                    output = "";
                    output = output + input.charAt(i);
                }

            }

        }
        System.out.println("count: " + count + " char: " + output);


    }
}
