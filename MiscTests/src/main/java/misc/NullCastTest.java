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
public class NullCastTest {
    Object o = null;
    public static void main(String[] args) {
        NullCastTest castTest = new NullCastTest();
        String s = (String)castTest.o;
        System.out.println(s);
    }
}
