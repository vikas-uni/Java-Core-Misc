/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author ADMIN
 * generates random numbers between 1-10 inclusive and stores them in an array
 */
public class RandomGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s = "was it a cat i saw";
        int terms = s.length();
        int[] generated = new int[terms];

        int index = 0;

       while(index < generated.length) {
            boolean matched = false;
            if (index == terms) {
                break;
            }
            int point = (int) (Math.random() * (terms+1));
            if (point == 0) {
                continue;
            }
            inner:
            for (int i = 0; i < terms; i++) {
                if (point == generated[i]) {
//                    System.out.println("point is " + point);
//                    continue outer;
                    matched = true;
                    break inner;
                }
            }
            if (matched) {
                continue;
            }
            generated[index++] = point;           
        }
        for (int i : generated) {
            System.out.print(s.charAt(i-1));
        }

        // TODO code application logic here
    }
}
