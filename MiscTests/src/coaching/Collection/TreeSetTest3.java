package coaching.Collection;

//prog to demo TreeSet 

import java.util.*;

class Student4 {

    String name;
    int rollno;

    Student4(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return (name + " " + rollno);
    }
}

class NameSort implements Comparator {

    public int compare(Object ob1, Object ob2) {
        Student4 st1 = (Student4) ob1;
        Student4 st2 = (Student4) ob2;
        return (st1.name.compareTo(st2.name));
    }
}

class RollnoSort implements Comparator {

    public int compare(Object ob1, Object ob2) {
        Student4 st1 = (Student4) ob1;
        Student4 st2 = (Student4) ob2;
        return (st1.rollno - st2.rollno);
    }
}

class TreeSetTest3 {

    public static void main(String s[]) {
        NameSort nsort = new NameSort();
        RollnoSort rsort = new RollnoSort();
        TreeSet ts = new TreeSet(rsort);              //sort by rollno(passing nsort will sort by name)
        ts.add(new Student4("abc", 101));
        ts.add(new Student4("xyz", 102));
        ts.add(new Student4("mno", 103));
        ts.add(new Student4("hij", 104));
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
