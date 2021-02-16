/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author ADMIN
 */
public class LabelledLoop {
    public static void main(String[] args) {
        int age = 0;
        outer:
        while(++age<=21){
            
            if (age == 16) {
                System.out.println("Get your licence");
                continue outer;
            }
            System.out.println("Another year "+age);
        }
    }
}
