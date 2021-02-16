package coaching.Collection;

//prog to demo. Map class
import java.util.*;

class MapTest {

    public static void main(String s[]) {
        Map m = new TreeMap();      //using HashMap instead of TreeMap will store elements in unordered,unsorted manner
        m.put("101", "abc");
        m.put("104", "xyz");
        m.put("103", "mno");
        m.put("102", "hij");
        System.out.println("Record inserted into map");
        System.out.println("list of key-value pairs");
        Set st = m.entrySet();            //returns the ref of Set object that has objects of type Map.Entry
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("contains 103 as key: " + m.containsKey("103"));
        System.out.println("contains mno as value: " + m.containsValue("mno"));
    }
}
