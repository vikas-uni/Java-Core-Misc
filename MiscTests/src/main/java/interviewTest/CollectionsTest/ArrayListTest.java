/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest.CollectionsTest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("asd");
        list.add("uiio");
        list.add("wer");
        
        list.add("tyu");
        list.add("bnhg");
        System.out.println(list);
        list.set(3, "opi");        //replaces element at specified index
        System.out.println(list);
        list.remove(0);            //removes element at 0 index ind shifts rest elements to fill the position
        System.out.println(list.get(0));
        System.out.println(list.get(4));  //IndexOutOfBoundsException: Index: 4, Size: 4
    }
}
