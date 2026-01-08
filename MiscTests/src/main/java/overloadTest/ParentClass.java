/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadTest;

/**
 *
 * @author ADMIN
 */
public class ParentClass {
    private int n = 3;   //not be available to child classes.Also can't be accessed by reference variable.
     int p = 5;
    
    public void parentMethod(){
        System.out.println("parent method");
    }
    
    public void paramMethod(Object o){
        System.out.println("parent param");
    }
    
      //code below is not an overloaded method
//    public String parentMethod(){
//        return "parent returning string";
//    }
    
    public void parentMethod(int n){
        System.out.println("overloaded parent method "+n);
    }
    
    public void parentover(Object o){
        
    }
}
