/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN
 */
public class InterfaceTest {
    public static void main(String[] args) {
        InterfaceHavingClass.A a = new InterfaceHavingClass.A();
       
        System.out.println(a.getPI());
        InterfaceHavingClass.B b = new InterfaceHavingClass.B();
        b.showPI();
    }
}
