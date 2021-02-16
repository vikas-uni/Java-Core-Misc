package coaching.Collection;

//prog to demo Vector
import java.util.*;

class VectorTest {

    public static void main(String s[]) {
        Vector v = new Vector(5);                        //creates vector array with specified size             
        System.out.println("current capacity: " + v.capacity());
        v.add("abc");
        v.add("abc");
        v.add("abc");
        v.add("abc");
        v.add("abc");
        v.add("abc");
        System.out.println(v);
        System.out.println("current capacity: " + v.capacity());
    }
}
