/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;


/**
 *
 * @author ADMIN
 */
 abstract class AbstractClass {
    int x;
    public abstract void abstractMethod();
    
    //abstract class can have constructor
    public AbstractClass(){
        //this line will be printed
        System.out.println("abstract class constructor");
        x = '0' + 1;
    }
}
public class AbstractTest extends AbstractClass{
    

    @Override
    public void abstractMethod() {
        System.out.println("overriden in child,x is: "+x);
        
        //code below is for assertion test        
        assert(x>=0):"assertion test";   //doesn't works here
        System.out.println("b > a");
    }
    public static void main(String[] args) {
        AbstractTest t = new AbstractTest();
        t.abstractMethod();        
        
    }
}