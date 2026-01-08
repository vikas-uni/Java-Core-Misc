/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 * Searching Arrays and Collections
The Collections class and the Arrays class both provide methods that allow you 
to search for a specific element. When searching through collections or arrays, the 
following rules apply:
■  Searches are performed using the binarySearch() method.
■  Successful searches return the int index of the element being searched.
■  Unsuccessful searches return an int index that represents the insertion point. 
The insertion point is the place in the collection/array where the element 
would be inserted to keep the collection/array properly sorted. Because positive
return values and 0 indicate successful searches, the binarySearch() 
method uses negative numbers to indicate insertion points. Since 0 is a valid 
result for a successful search, the first available insertion point is -1. There-
fore, the actual insertion point is represented as (-(insertion point) -1). For 
instance, if the insertion point of a search is at element 2, the actual insertion 
point returned will be -3.
■  The collection/array being searched must be sorted before you can search it.
■  If you attempt to search an array or collection that has not already been 
sorted, the results of the search will not be predictable. 
■  If the collection/array you want to search was sorted in natural order, it must 
be searched in natural order. (Usually this is accomplished by NOT sending 
a Comparator as an argument to the binarySearch() method.)
■  If the collection/array you want to search was sorted using a Comparator, it 
must be searched using the same Comparator, which is passed as the second 
argument to the binarySearch() method. Remember that Comparators 
cannot be used when searching arrays of primitives.
 */
public class SearchObjArray {
    public static void main(String [] args) {
    String [] sa = {"one", "two", "three", "four"};
    Arrays.sort(sa);                                      // #1
    for(String s : sa) {
            System.out.print(s + " ");
        } 
    System.out.println("\none = " 
                       + Arrays.binarySearch(sa,"one"));  // #2
    System.out.println("now reverse sort");
    ReSortComparator rs = new ReSortComparator();         // #3
    Arrays.sort(sa,rs);                              
    for(String s : sa) {
            System.out.print(s + " ");
        } 
    System.out.println("\none = " 
                       + Arrays.binarySearch(sa,"one"));  // #4
    System.out.println("one = " 
                    + Arrays.binarySearch(sa,"one",rs));  // #5
  }
    static class ReSortComparator 
                  implements Comparator<String> {         // #6
    public int compare(String a, String b) {
      return b.compareTo(a);                              // #7
    }
  }
}

/**
 * Here's what happened:
Line 1  Sort the sa array, alphabetically (the natural order).
Line 2  Search for the location of element "one", which is 1.
Line 3   Make a Comparator instance. On the next line we re-sort the array using 
the Comparator.
Line 4   Attempt to search the array. We didn't pass the binarySearch() 
method the Comparator we used to sort the array, so we got an incorrect 
(undefined) answer.
Line 5   Search again, passing the Comparator to binarySearch(). This time 
we get the correct answer, 2
Line 6   We define the Comparator; it's okay for this to be an inner class.
Line 7   By switching the use of the arguments in the invocation of 
compareTo(), we get an inverted sort. 
 */