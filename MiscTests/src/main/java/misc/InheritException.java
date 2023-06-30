/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class InheritException {
    
}
class Animal {
  public void eat() throws FileNotFoundException {
    // throws an Exception
      System.out.println("in animal");
  }
}
class Dog2 extends Animal {
    @Override
  public void eat(){ /* can choose to throw no Exceptions bur cannot throw any newer or broader Exception */
        System.out.println("in dog");
    }
  public static void main(String [] args) {
    Animal a = new Dog2();
    Dog2 d = new Dog2();
    d.eat();           // ok
//    a.eat();           // compiler error - 
                       // unreported exception
  }
}