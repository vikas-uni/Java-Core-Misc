/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import interfaceTest.Interface1;

/**
 *
 * @author ADMIN
 */
public class ChildInherit extends InheritTest {
    @Override
    public void showMessage(){
        System.out.println("This is child");
    }
    public void testMessage(){
        super.showMessage();
        this.showMessage();
        showMessage();
    }
    
    public static void main(String[] args) {
        ChildInherit ch = new ChildInherit();
        Interface1 in = ch;   //can reference a subclass of a class which implements this interface(testing only)
        ch.testMessage();
    }
    
}
