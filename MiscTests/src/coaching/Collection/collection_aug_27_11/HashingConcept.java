package coaching.Collection.collection_aug_27_11;

import java.util.HashSet;
import java.util.Iterator;

class Student {

    String name;
    int age;

    Student(String name, int a) {
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
        Student s = (Student) o;
        boolean objectResult = s.name.equals(this.name);
        return objectResult;

    }
}

public class HashingConcept {

    public static void main(String dfdf[]) {
        HashSet studentSet = new HashSet();
        Student st1 = new Student("sumit", 23);
        Student st2 = new Student("athar", 25);
        Student st3 = new Student("sumit", 23);
        Student st4 = new Student("athar", 25);
        Student st5 = new Student("dheeraj", 27);
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);


        Iterator iter = studentSet.iterator();

        while (iter.hasNext()) {
            Student o = (Student) iter.next();
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
