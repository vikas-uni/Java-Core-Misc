/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceTest;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import misc.Test;

/**
 *
 * @author ADMIN
 */
public class InterfaceTest implements Interface1,Interface2{
    int fact = 1;
    int count = 0;
    
    public void test() {
        System.out.println(test2(6));
    }

   
   
   
    public void meth1(){
        System.out.println("meth11");
    }


//    @Override
//    public void meht2() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
    
    //an experimental inner class is declared
     class Inner{
     int local = 10;
    }
   Inner in = new Inner();
   //------------------------
  
    //this method tests recursion
    public int test2(int x){
        System.out.println(x);
        if (x == 1) {
            return 1;
        }
//        fact *= x;
//        x--;
       
        
//        test2(--x);
//        return fact;
        return x*test2(--x);
    }
//-------------------------------
    
    
    public static void main(String[] args) {
        InterfaceTest it = new InterfaceTest();
    it.test();      
    
    InterfaceTest.Inner in = it.new Inner();    ///create inner class outside the outer class code(experimental)
        System.out.println("inner local: "+in.local);
        
         //the new object will be an anonymous class which implements Test interface
        Test t = new Test(){
        public void inTest(){
//            super.inTest();
            
            System.out.println("test run");
        }};
        t.inTest();
        InterfaceTest it1 = new InterfaceTest();
        it1.meth1();
        
    }




	@Override
	public String testMethod()  {
		// TODO Auto-generated method stub
		return null;
	}
    
}
