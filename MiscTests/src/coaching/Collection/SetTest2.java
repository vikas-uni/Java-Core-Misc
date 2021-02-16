package coaching.Collection;

import java.util.*;

class Student2 {

    int rollno;
    String name;

    Student2(int rollno, String s) {
        this.rollno = rollno;
        name = s;
    }

    public String toString() {
        return (rollno + " " + name);
    }
    //additional method to check duplicacy

    public int hashCode() {     //generate hashCode according to rollno
        return (rollno);
    }

    public boolean equals(Object ob) {
        if (ob instanceof Student2) {
            Student2 st = (Student2) ob;
            return (rollno == st.rollno && name.equals(st.name));
        }
        return (false);
    }
}

public class SetTest2 {

    public static void main(String s[]) {
        Set hs = new HashSet();
        hs.add(new Student2(101, "Abc"));
        hs.add(new Student2(102, "Xyz"));
        hs.add(new Student2(101, "Abc"));
        hs.add(new Student2(103, "Mno"));
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}