/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interviewTest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ArrayListCapacityTest {
    static int a[] = new int[2];
    
    
    static{
        a[1]=8;
        System.out.println(a);
    }
    
    
    public static void main(String[] args) {
        List l = new ArrayList();
//        for (int i = 0; i < Integer.MAX_VALUE; i++)          
        l.add(0);
        l.add(0);
        l.add(1);
        System.out.println("size: "+l.size());
    }
    
}
