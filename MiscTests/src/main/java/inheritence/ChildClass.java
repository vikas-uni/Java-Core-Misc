/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author Vikas-PC
 */
public class ChildClass extends ParentClass {
    int a = 6;
    void met1(){
        System.out.println("Child");
    }
    void met2(){
        System.out.println("method 2");
    }
    
    public void runAnimal(Horse h){
        h.run();
    }
}
