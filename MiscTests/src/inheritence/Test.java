/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author Vikas-PC
 */
public class Test {
    public static void main(String[] args) {
        ParentClass p1 = new ParentClass();
        ParentClass parent = new ChildClass();
        //line below will compile but generate at runtime 'ClassCastException'
//        ChildClass childClass = (ChildClass)new ParentClass();  
        ChildClass c2 = (ChildClass)parent;
        c2.met1();
        System.out.println(c2.a);
        System.out.println(parent.a);
        p1 = parent;
        System.out.println(p1.a);
        parent.runAnimal(new Horse());
    }
    
}
