/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author ADMIN
 */
public class Elephant extends Mammal {
    @Override
    public void run(){
        System.out.println("Elephant run");
    }
    //this is an overload,not an override
    /**
     *
     * @param e
     */
    public void eat(Elephant e){
        
        System.out.println("in elephant eat");
    }
}
