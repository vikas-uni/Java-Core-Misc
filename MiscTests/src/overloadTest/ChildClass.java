package overloadTest;


import overloadTest.ParentClass;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class ChildClass extends ParentClass {
    
    int p = 9;
    int n = 10;
    
    int ch = 'j';
    @Override
    public void parentMethod(){
        System.out.println("child overriden parent");
        
    }
    
    @Override
    public void paramMethod(Object s){
        System.out.println("child param");
    }
    
    //this is overload, not override
    public void parentMethod(char i){
        System.out.println("child overloaded method "+i);
    }
    
    private void privateMethod(){
        
    }
    public int parentover(String s){
        return 0;
        
    }
    
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();
        ParentClass parentRefChild = new ChildClass();
        
        parent.parentMethod();
        child.parentMethod();
        child.parentMethod(4);
        child.parentMethod('f');
        System.out.println("child p: "+child.p);      //child int p will be printed
        parentRefChild.parentMethod();
        System.out.println("Parent p: "+parentRefChild.p);   //parent int p will be printed
        System.out.println(child.ch);
        
    }
}
