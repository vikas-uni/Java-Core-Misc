/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

/**
 *
 * @author Vikas
 */
public class NullTest {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s);
        NullTest nt = new NullTest();
        nt.test(null);
        Object o = (Object)null;
        System.out.println(o);
        nt.test(o);
    }
    
    void test(String s){
        System.out.println("string");
    }
    void test(Object o){
        System.out.println("object");
    }
}
