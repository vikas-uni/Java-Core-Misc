package coaching.Collection;

//prog to demo Comparable interface in TreeSet
import java.util.*;

class TreeSetTest2 {

    public static void main(String s[]) {
        TreeSet ts = new TreeSet();
        ts.add(new Students("abc", 101));
        ts.add(new Students("xyz", 102));
        ts.add(new Students("mno", 103));
        ts.add(new Students("hij", 104));

        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class Students implements Comparable {

    String name;
    int rollno;

    Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return (name + " " + rollno);
    }

    public int compareTo(Object ob) {              //return -ve value if object is stored in left of root and +ve value if object is stored to right of root
        Students st = (Students) ob;
        return (rollno - st.rollno);
    }
}