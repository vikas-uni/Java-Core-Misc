/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsTest;

/**
 *
 * @author ADMIN
 * A LinkedList is ordered by index position, like ArrayList, except 
that the elements are doubly-linked to one another. This linkage gives you new 
methods (beyond what you get from the List interface) for adding and removing 
from the beginning or end, which makes it an easy choice for implementing a stack 
or queue. Keep in mind that a LinkedList may iterate more slowly than an ArrayList, 
but it's a good choice when you need fast insertion and deletion. As of Java 5, the 
LinkedList class has been enhanced to implement the java.util.Queue interface. As 
such, it now supports the common queue methods: peek(), poll(), and offer().
 */
// Demonstrate LinkedList.
import java.util.*;

class LinkedListDemo {

    public static void main(String args[]) {
// Create a linked list.
        LinkedList<String> ll = new LinkedList<String>();
// Add elements to the linked list.
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Original contents of ll: " + ll);
        ll.add(5, "X");
// Remove elements from the linked list.
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of ll after deletion: "
                + ll);
// Remove first and last elements.
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting first and last: " + ll);
// Get and set a value.
        String val = ll.get(2);
        ll.set(2, val + " Changed");
        System.out.println("ll after change: " + ll);
    }
}
