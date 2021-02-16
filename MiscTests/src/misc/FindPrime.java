/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author Administrator
 */
public class FindPrime {

    public static void main(String[] args) {
        for (long i = 0; i <= 1000000000L; i++) {
            long prime = 0;
                     
            
            if (i == 1 || i==2 || i == 3) {
//                sum+= i;
                continue;
            }
            for (long j = 2; j <= i/2; j++) {
                //check for prime
                if (i % j == 0) {
                    prime = 0;
                 break;   
                }else{
                    prime = i;
                }
            }
            if (prime == 0) {
                continue;
            }
//            sum+= prime;
            System.out.println("Primes "+prime);
        }
     
    }
}
