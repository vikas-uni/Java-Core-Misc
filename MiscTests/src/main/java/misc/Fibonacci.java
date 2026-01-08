/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author ADMIN
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 0,b = 1;
        int iter = 15;
        
        for (int i = 0; i < iter; i++) {
            System.out.println(a);
            a = a + b;
            b = a - b;
        }
        String s = "qwertyuiop";
        System.out.println(s.substring(2, 10));
    }
}
