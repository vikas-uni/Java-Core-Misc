package coaching.Collection;

//prog to demo. set interface
import java.util.*;

class SetTest {

    public static void main(String s[]) {
        HashSet hs = new HashSet();                //HashSet  will add elements in the set in random order while TreeSet stores in sorted order
        hs.add("abc");
        hs.add("xyz");
        hs.add("mno");
        hs.add("abc");
        hs.add("hij");
        System.out.println("total no of elements added: " + hs.size());
        System.out.println("list of elements: ");
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            String st = (String) itr.next();
            System.out.println(st);
        }
    }
}

//HashSet and TreeSet are the implemented classes of set Interface