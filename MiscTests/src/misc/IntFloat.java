/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author ADMIN
 */
public class IntFloat{
    public static void main(String[] args) {
        int x = 4;
        float y = 4.88f;
        System.out.println(x+y);
        
        
        int k = 1;
        
        for (int i = 1; i < 16; i+= 2) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
                
                if (j <= i/2) {
//                    System.out.print(" i = "+i/2);
                    k += 2;
                }
                else
                    k -= 2;
            }
            k = 1;
            System.out.println("");
        }
    }
    
}
