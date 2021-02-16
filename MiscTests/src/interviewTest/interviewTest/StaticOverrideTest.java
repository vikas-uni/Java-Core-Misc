/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

/**
 *
 * @author Vikas-PC
 */
class Animal { 
  static void doStuff() { 
    System.out.print("a "); 
  } 
}
class Dog extends Animal {
  static void doStuff() {         // it's a redefinition,
                                  // not an override
    System.out.print("d ");  
  }
}

class SuperClass{
    public static void superStatic(){
        System.out.println("Super static");
    }
}


public class StaticOverrideTest extends SuperClass {
    
    
//    public void superStatic(){    //cannot override
//        
//    }
}
