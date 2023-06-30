/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewTest;

/**
 *
 * @author Administrator
 */
public class NullCastTest {
    static void testIt(){
        System.out.println("in testIt");
    }
    public static void main(String[] args) {
        String toString = ((NullCastTest)null).toString();
        System.out.println(toString);
//        NullCastTest.testIt();
    }
}
