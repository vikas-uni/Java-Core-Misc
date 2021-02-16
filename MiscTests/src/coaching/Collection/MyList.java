package coaching.Collection;

//create the ArrayList for user defined class objects.
import java.util.*;

class Student {

    int rollno, marks;
    String name;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void exam(int m) {
        marks = m;
    }

    void show() {
        System.out.println(rollno + "\t" + name + "\t" + marks);
    }
}

class MyList {

    public static void main(String s[]) {
        ArrayList al = new ArrayList();                     //ArrayList created
        al.add(new Student(101, "abc"));                    //objects added to ArrayList of type Student objects
        al.add(new Student(102, "xyz"));
        al.add(new Student(103, "mno"));
        al.add(new Student(104, "hij"));
        System.out.println("List of students");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {                        //checks if iteration has more elements& returns true if found
            Student st = (Student) itr.next();                 //next() checks next elements of type Object(a ref var to Student here) and downcast it into specified type
            st.exam((int) (Math.random() * 101));         //exam() in Student called for each Student object to store marks for each Student
            st.show();                                  //show called from each Student object
        }
        System.out.println("Remove abc: " + al.remove(new Student(101, "abc")));
        System.out.println("contains xyz: " + al.contains(new Student(102, "xyz")));
    }
}
