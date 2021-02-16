package coaching.Collection;

//prog to demo. TreeSet
import java.util.*;

class TreeSetTest {

    public static void main(String s[]) {
        TreeSet ts = new TreeSet();
        ts.add("mno");
        ts.add("hij");
        ts.add("jkl");
        ts.add("abc");
        ts.add(3);   //will generate classcast exception
        System.out.println("sorted list of elements");
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("subset from hij");
        TreeSet sub = (TreeSet) ts.tailSet("hij");                 //this will contain elements after hil
        System.out.println("elements in the subset: " + sub);
    }
}
