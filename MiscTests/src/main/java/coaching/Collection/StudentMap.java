package coaching.Collection;

//prog using Map to store Object of Student as key and Object of Course as value
import java.util.*;

class Student3 implements Comparable {

    int rollno;
    String name;

    Student3(int r, String n) {
        rollno = r;
        name = n;
    }

    public int compareTo(Object ob) {
        Student3 st = (Student3) ob;
        return (rollno - st.rollno);
    }

    public String toString() {
        return (rollno + " " + name);
    }
}

class Course {

    String cname, hod;
    int dur, fee;

    Course(String cn) {
        cname = cn;
        if (cn == "java") {
            dur = 2;
            fee = 10000;
            hod = "amit";
        } else if (cn == ".net") {
            dur = 1;
            fee = 8000;
            hod = "sumit";
        } else if (cn == "oracle") {
            dur = 3;
            fee = 15000;
            hod = "namit";
        }
    }

    public String toString() {
        return (cname + " " + dur + " years" + " fee:" + fee + " HOD:" + hod);
    }
}

public class StudentMap {

    public static void main(String s[]) {
        Map m = new TreeMap();
        m.put(new Student3(105, "jim"), new Course("java"));
        m.put(new Student3(102, "jil"), new Course(".net"));
        m.put(new Student3(101, "kim"), new Course("java"));
        m.put(new Student3(104, "tim"), new Course("oracle"));
        m.put(new Student3(103, "sid"), new Course(".net"));

        System.out.println("records inserted into map");

        Set st = m.entrySet();                           //returns the set that has objects of Map.Entry type
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}