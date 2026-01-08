/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class StringMatch {
    public static void main(String[] args) {
        String input = "my name is praveen";
        if (input.contains("is")) {
            System.out.println("yes\n");
        }
        String tokens[] = input.split(" ");
//        StringBuffer sb = new StringBuffer();
//        StringTokenizer st = new StringTokenizer(input, " ");
       
        
        for (String string : tokens) {
           
            for (int i = string.length()-1; i >= 0; i--) {
                if (i == string.length()-1) {
                    String t = (""+string.charAt(i)).toUpperCase();
                    System.out.print(t);
                }
                else
                
                System.out.print(string.charAt(i));
            }
            
            System.out.print(" ");
        }
        
        
        
//        do {
//            
//        } while (true);
        
    }
    
}
