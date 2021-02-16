/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN
 */
public class StringFrequency {
    public static void main(String[] args) {
        String s = "this is test string which is to be tested by this is is test test test";
        String[] tokens = s.split(" ");
        
        int[] times = new int[tokens.length];
        
        for (int i = 0; i < tokens.length; i++) {
            
            
            if (tokens[i] == null) {
                    continue;
                }
            times[i]+= 1;
            for (int j = i+1; j < tokens.length; j++) {
                
                
               
                if (tokens[i].equals(tokens[j])) {
                    times[i] = times[i] +1;
                    tokens[j] = null;
                }
            }
        }
        for (int i = 0; i< tokens.length;i++) {
            if (tokens[i] == null) {
                continue;
            }
            System.out.println(tokens[i]+" "+times[i]+" times");
        }
        
        
//        for (String st : tokens) {
//            System.out.println(st);
//        }
    }
}
