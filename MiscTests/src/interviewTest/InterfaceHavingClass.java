/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN
 */
public interface InterfaceHavingClass {
    double PI = 3.14;
    class A{
        public double getPI(){
            return PI;
        }
    }
    static class B{
        public void showPI(){
            System.out.println(PI);
        }
    }
}
