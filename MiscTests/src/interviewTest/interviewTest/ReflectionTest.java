/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.interviewTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 *
 * @author ADMIN
 * Reflection is the ability of software to analyze itself. This is provided by the java.lang.reflect
package and elements in Class. Reflection is an important capability, especially when using
components called Java Beans. It allows you to analyze a software component and describe
its capabilities dynamically, at run time rather than at compile time. For example, by using
reflection, you can determine what methods, constructors, and fields a class supports.
 */
public class ReflectionTest {
    public static void main(String[] args) {
        Class c = NullTest.class;
        Constructor[] constructors = c.getConstructors();
        Annotation[] annotations = c.getAnnotations();
        
        Method[] declaredMethods = c.getMethods();
        Field[] fields = c.getFields();
        
        System.out.print("Constructors: \n");
        for (Constructor constructor: constructors) {
            System.out.println("\t"+constructor);
        }
        System.out.println("\n Annotations:\n");
        for(Annotation annotation:annotations){
            System.out.println("\t"+annotation);
        }
        System.out.println("\nFields:\n");
        for (Field field : fields) {
            System.out.println("\t"+field);
        }
        System.out.println("\nMethods:\n");
        for (Method method:declaredMethods) {
            System.out.println("\t"+method);
        }
        Method mt = declaredMethods[1];
        System.out.println(mt.getModifiers());
        
        
    }  
}
