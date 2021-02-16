/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewTest;

/**
 *
 * @author Administrator
 * 1*2*3*4*5
 * 11*12*13*14*15
 * 21*22*23*24*25
 * 16*17*18*19*20
 * 6*7*8*9*10
 */
public class ForLoopDifficult {
    public static void main(String[] args) {
        printPattern(12);
    }
    
    public static void printPattern(int n){
        int t = 1;
        int k = n-1;
        
        if(n%2 != 0)
         k = n-2;
        
        for (int i = 0; i < n; i++) {          
            for (int j = 1; j <= n; j++) {
                System.out.print(t);
                t++;
                if (j == n) {
                    continue;
                }
                System.out.print("*");
            }
            System.out.println("");
            if(n%2!=0){
            if (i < n/2) {
                t += n;
            }
            else{
            t = k*n +1;
            k-=2;
            }
            }
            else{
                if(i < n/2 -1){
                    t+=n;
                }
                else{
                    t = k*n +1;
                    k-=2;
                }
            }
            
        }
        
    }
}
