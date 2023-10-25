package coaching.Collection;

import java.util.HashSet;
import java.util.Iterator;

class Student1 {

    String name;
    int age;

    Student1(String name, int a) {
        this.name = name;
        age = a;
    }

    public String toString() {
        return name;
    }

    public int hashCode() {
        return name.length();
    }

    public boolean equals(Object o) {
        Student1 s = (Student1) o;
        boolean objectResult = s.name.equals(this.name);
        return objectResult;

    }
}

public class HashingConcept {

    public static void main(String dfdf[]) {
        HashSet studentSet = new HashSet();
        Student1 st1 = new Student1("sumit", 23);
        Student1 st2 = new Student1("athar", 25);
        Student1 st3 = new Student1("sumit", 23);
        Student1 st4 = new Student1("athar", 25);
        Student1 st5 = new Student1("dheeraj", 27);
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);


        Iterator iter = studentSet.iterator();

        while (iter.hasNext()) {
            Student1 o = (Student1) iter.next();
            if (o.age == 23) {
                System.out.println("-----" + o.name);
            }
        }

        //System.out.println(st1.hashCode()+"  "+st2.hashCode()+"  "+st3.hashCode());
        System.out.println(studentSet);

        HashSet commonSet = new HashSet();
        commonSet.add("java");
        commonSet.add("java");
        commonSet.add("c");

        System.out.println(commonSet);



    }
}
