/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

import java.util.LinkedHashSet;

/**
 *
 * @author Vikas-PC
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("wer");
        lhs.add("sed");
        lhs.add("dce");
        lhs.add("enm");
        lhs.add(null);    //ok.. can add null once to it but not in TreeSet anywhere
        System.out.println(lhs);
    }
}
