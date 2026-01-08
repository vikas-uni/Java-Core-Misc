/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author Vikas-PC
 */
public class ParentClass {
    int a = 5;
    void met1(){
        System.out.println("Parent");
    }
    private void met(){
        System.out.println("private");
    }
    
    public void runAnimal(Animal a){
        System.out.println("called in parent class");
        a.run();
    }
}
