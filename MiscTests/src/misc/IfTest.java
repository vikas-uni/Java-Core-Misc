/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author ADMIN
 */
public class IfTest {
    public static void main(String[] args) {
        int i = 3;
        assert(i>0);
        if (i == 3) {
            System.out.println(i);
        }
        if (i++ == 3) {
            System.out.println(i);
        }
        if (i++ == 3) {
            System.out.println(i);
        }
        if (i++ == 3) {
            System.out.println(i);
        }
        System.out.println(i);
    }
}
