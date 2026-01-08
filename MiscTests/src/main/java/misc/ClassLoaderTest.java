/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misc;

import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import inheritence.Elephant;

/**
 *
 * @author Administrator
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        try {
            Elephant e = new Elephant();
            e.run();
            System.out.println(e.getClass().getClassLoader().getParent());
            Properties property = System.getProperties();
            Enumeration<Object> elements = property.elements();
            System.out.println(property);
            while(elements.hasMoreElements()){
                System.out.println(elements.nextElement());
            }
            
            Class.forName("CoffeeTest");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassLoaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
