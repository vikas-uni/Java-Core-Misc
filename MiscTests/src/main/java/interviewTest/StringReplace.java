/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author Vikas-PC
 *  
Given a string of n characters how would you replace all occurrences of a particular 
* character with some other character- with a time complexity less than O(n)? 
Note: W/o using any inbuilt string replace functions of the language.

 */
public class StringReplace {
    public static void main(String[] args) {
        String s = "sjkdruioandbhriwohdjfklasjd"; 
        String out = "";
        char rep = 'Q';
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'k') {   //replace k with Q
                out = out + rep;
                continue;
            }
            out = out + s.charAt(i);
        }
        System.out.println(out);
        System.out.println(System.currentTimeMillis() - t1 + " ms");
    }
}
