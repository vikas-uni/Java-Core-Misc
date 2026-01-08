/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN
 * remove duplicate letters from a word
 */
public class DuplicateLetters {
    public static void main(String[] args) {
        String input = "madam", output = ""+input.charAt(0);
        
        for (int i = 1; i < input.length(); i++) {
            boolean matched = false;
            for (int j = 0; j < output.length(); j++) {      //loop through no. of characters in output string
                if (output.charAt(j) == input.charAt(i)) {    //check output already contains the character present in the input string 
                    matched = true;
                    break;               //if found,break
                }
            }
            if (matched) {           //continue to next character in input if match found in output string
                continue;
            }
            else output = output + input.charAt(i);
        }
        System.out.println(output);
    }
}
