/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author ADMIN
 */
public class ExceptionTest {
    public int method1(){
        try{
            throw new Exception();
            
        }
        //can comment here
        catch(Exception e){
             return 0;
        }
        finally{
            return 1;
        }
       
        
    }
    
    public int method2(){
        try{
            throw new RuntimeException();
            
        }
        finally{
            return 1;
        }
       
        
    }
    public static void main(String[] args) {
        ExceptionTest t = new ExceptionTest();
        //System.out.println(t.method1());  //prints 1
        
        System.out.println(t.method2());   //prints 1
        
//        int n = Integer.parseInt("12");
//        System.out.println(n);
    }
}
