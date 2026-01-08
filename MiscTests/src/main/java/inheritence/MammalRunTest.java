/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author ADMIN
 */
public class MammalRunTest {
    public void running(Mammal m){
        System.out.println("In Mammal run");
        m.run();
        m.eat(m);
    }
    public void running(Elephant e){
        System.out.println("In elephant run");
        e.run();
        e.eat(e);
    }
    public static void main(String[] args) {
        MammalRunTest runTest = new MammalRunTest();
        Mammal m = new Mammal();
        Mammal m2 = new Elephant();
        Elephant e = new Elephant();
        
        runTest.running(m);
        runTest.running(m2);
        runTest.running(e);
    }
}
