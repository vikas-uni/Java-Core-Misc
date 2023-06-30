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
public class PrimeCalc {

    public static void main(String[] args) {
        
        long n;
        n = 100000L;
        long p = 0L;

        
        for (long i = n; i >= n/2; i--) {
            long temp = i;
            long prime = 0L;
            if (i == 1 || i == 2 || i == 3) {
                continue;
            }
            
            boolean isprime = isPrime(i);
            if (isprime) {
                System.out.println(i);
                break;
            }
            
        }
//        System.out.println(p);
    }

    private static boolean isPrime(long num) {
        for (long j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                return false;
//                    System.out.println("in: "+p);

            }else{
//                System.out.println("num is: "+num);
            }
        }

        return true;

    }
}
