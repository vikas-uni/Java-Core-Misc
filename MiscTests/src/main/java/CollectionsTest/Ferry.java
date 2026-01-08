/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsTest;

/**
 *
 * @author ADMIN 
 * Java 6 introduced (among others) two new interfaces:
 * java.util.NavigableSet and java.util.NavigableMap. For the purposes of the
 * exam, you’re interested in how TreeSet and TreeMap implement these
 * interfaces. Imagine that the Santa Cruz–Monterey ferry has an irregular
 * schedule. Let's say that we have the daily Santa Cruz departure times stored,
 * in military time, in a TreeSet. Let's look at some code that determines two
 * things: 1. The last ferry that leaves before 4 (1600 hours) 2. The first
 * ferry that leaves after 8 (2000 hours)
 */
import java.util.*;

public class Ferry {

    public static void main(String[] args) {
        /**
         * The TreeSet is one of two sorted collections (the other being
         * TreeMap). It uses a Red-Black tree structure (but you knew that), and
         * guarantees that the elements will be in ascending order, according to
         * natural order. Optionally, you can construct a TreeSet with a
         * constructor that lets you give the collection your own rules for what
         * the order should be (rather than relying on the ordering defined by
         * the elements' class) by using a Comparable or Comparator. As of Java
         * 6, TreeSet implements NavigableSet.
         */
        TreeSet<Integer> times = new TreeSet<Integer>();
        times.add(1205);   // add some departure times
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);
        // Java 5 version
        TreeSet<Integer> subset = new TreeSet<Integer>();
        subset = (TreeSet) times.headSet(1600);
        System.out.println("J5 - last before 4pm is: " + subset.last());
        TreeSet<Integer> sub2 = new TreeSet<Integer>();
        sub2 = (TreeSet) times.tailSet(2000);
        System.out.println("J5 - first after 8pm is: " + sub2.first());
        // Java 6 version using the new lower() and higher() methods
        System.out.println("J6 - last before 4pm is: " + times.lower(1600));
        System.out.println("J6 - first after 8pm is: " + times.higher(2000));
    }
}