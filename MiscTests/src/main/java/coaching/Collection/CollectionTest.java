package coaching.Collection;

import java.util.*;

class CollectionTest {

    public static void main(String s[]) {
        ArrayList al = new ArrayList();                  //creates an array list object to store similar objects
        System.out.println("adding the set of values into collection");
        al.add("abc");                                 //string objects added to ArrayList 
        al.add("vbn");
        al.add("mnb");
        al.add("dfg");
        al.add("poi");
        al.add("lkj");
        System.out.println("contains abc: " + al.contains("abc"));
        System.out.println("remove abc: " + al.remove("abc"));
        System.out.println("contains abc: " + al.contains("abc"));
        System.out.println("list of values");
        Iterator itr = al.iterator();    //instance of Iterator stored in itr
        //or ListIterator itr=al.ListIterator(al.size());             //size() returns the no of elements in the list
        while (itr.hasNext()) {                    //hasNext() returns true if any element exists fully traversed(checks if iteration has more elements)     
            String st = (String) itr.next();               //next() retrieves next element in collection and is of type Object(downcasted to String here)
            System.out.println(" " + st);
        }
        System.out.println("showing the list: " + al);
        System.out.println("index of lkj : " + al.indexOf("lkj"));              //indexOf returns index no of first occurrence of element
    }
}