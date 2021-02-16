/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

/**
 *
 * @author Vikas-PC
 */
public class WrapperTest {
    public static void main(String[] args) {
         Integer i = 10;
         Integer i2 =  new Integer(10);
         Integer i3 = 10;
         
         Long ln = 36L;
         
          Float f = (float)2;  //2f will also work without cast but not 2 or 2.0
          Double d = 12.0;
          
          Character c = 'j';
          
          Byte b = 5;
          Short s = 10;
          
         System.out.println(i == i2);    //false
         System.out.println(i == i3);    //true
         
         int k = c;
         k = b;
//         k = ln;   //will not work
//         k = d;   //will not work
//         k = f;    //will not work
//         k = (int)f;  //will not work
         
         
    }
   
}
