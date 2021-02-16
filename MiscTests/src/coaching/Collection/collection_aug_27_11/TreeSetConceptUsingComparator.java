package coaching.Collection.collection_aug_27_11;

import java.util.Comparator;
import java.util.TreeSet;

class Employee1 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name;
    }
}

class PerformSorting implements Comparator {

    public int compare(Object o1, Object o2) {

        Employee1 emp1 = (Employee1) o1;
        Employee1 emp2 = (Employee1) o2;
        return emp1.getName().compareTo(emp2.getName());
    }
}

public class TreeSetConceptUsingComparator {

    public static void main(String dfd[]) {
        TreeSet empSet = new TreeSet(new PerformSorting());

        Employee1 e1 = new Employee1("raj", 20);
        Employee1 e2 = new Employee1("tim", 23);
        Employee1 e3 = new Employee1("mohit", 24);
        Employee1 e4 = new Employee1("harrick", 20);;

        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e4);

        System.out.println(empSet);

        System.out.println("corejava".compareTo("advancejava"));
    }
}
