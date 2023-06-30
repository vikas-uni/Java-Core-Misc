/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author ADMIN
 */
public class ArrayPolymorphism {
    public static void main(String[] args) {
        Object[] ob = new String[5];
        ob[0] = "asdf";
        ob[1] = "tyui";
        System.out.println(ob[1].getClass());
       
    }
    
}
