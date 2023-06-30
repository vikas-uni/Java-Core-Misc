/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Vikas-PC
 */
class Employee {

    int id;
    String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        String e1 = o1.name;
        String e2 = o2.name;
        int id1 = o1.id;
        int id2 = o2.id;

        if (id1 > 0 && id2 > 0) {
            return e1.compareTo(e2);
        }
        if (id1 < 0 && id2 < 0) {
            return e1.compareTo(e2);
        }
        if (id1 < 0 && id2 > 0) {
            return 1;
        }
        if (id1 > 0 && id2 < 0) {
            return -1;
        }

        return 0;
    }
}

public class ListSortingByComparator {

    public static void main(String[] args) {
        EmployeeComparator ec = new EmployeeComparator();
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(12, "sdfre"));
        list.add(new Employee(12, "uyyi"));
        list.add(new Employee(16, "lhjkghfg"));
        list.add(new Employee(1, "cgfdse"));
        list.add(new Employee(10, "werrfg"));
        list.add(new Employee(18, "aerfg"));
        list.add(new Employee(-12, "rcghg"));
        list.add(new Employee(17, "qwzff"));
        list.add(new Employee(-2, "kjbmn"));
        list.add(new Employee(-62, "vgffddff"));
        list.add(new Employee(-22, "drtytf"));

        Collections.sort(list, ec);
        for (Employee e : list) {
            System.out.println(e.name + " " + e.id);
        }
    }
}
