/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.CollectionsTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vikas-PC
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("asd");
        al.add("cvbn");
        al.add("wert");
        al.add("qwer");
        al.add("zxcv");
        
        
        
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            String s = (String)itr.next();
            System.out.println(s);
            if (s.equals("wert")) {
               itr.remove(); 
               //al.remove(0);  this wil throw java.util.ConcurrentModificationException
            }
            
        }
        System.out.println(al);
    }
}
