/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN
 * calculate sum of primes between 1 - 1000
 */
public class SumPrimes {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            int prime = 0;
                     
            
            if (i == 1 || i==2 || i == 3) {
                sum+= i;
                continue;
            }
            for (int j = 2; j <= i/2; j++) {
                //check for prime
                if (i % j == 0) {
                    prime = 0;
                 break;   
                }else{
                    prime = i;
//                    break;
                }
            }
            if (prime == 0) {
                continue;
            }
            sum+= prime;
            System.out.println("Primes "+prime);
        }
        System.out.println(sum);
    }
}
