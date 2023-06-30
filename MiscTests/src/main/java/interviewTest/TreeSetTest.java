/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

import java.util.TreeSet;

/**
 *
 * @author Vikas-PC
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(null);   //will throw NPE at runtime
        treeSet.add("apple");
        treeSet.add("zinc");
        treeSet.add("mercury");
        
        System.out.println(treeSet);
    }
}
