package coaching.Collection.collection_aug_27_11;

import java.util.*;

/*
 *  Collection
 *  HashMap, LinkedHashMap,Hashtable key= HashSet or LinkedHashSet
 */
class Student11 {

    String name;
    int age;

    Student11(String name, int a) {
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
        Student11 s = (Student11) o;
        boolean objectResult = s.name.equals(this.name);
        return objectResult;

    }
}

public class MapOperation {

    public static void main(String dfd[]) {
        Map map = new HashMap();
        Student11 st1 = new Student11("sumit", 23);
        Student11 st2 = new Student11("athar", 25);
        //Student st3=new Student("sumit",23);
        //Student st4=new Student("athar",25);
        Student11 st5 = new Student11("dheeraj", 27);

        map.put(st1, "this is st1");
        map.put(st2, "st2");
        //map.put(null,"yyyyy");

        //map.put(st3, "st3");
        //map.put(st4, "st4");
        map.put(st5, "st5");
        st5.name = "deeraj_uppal";
        System.out.println(map.get(st5));
        System.out.println(map);

        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            System.out.println("---------" + i.next());
//			Student11 stu=(Student11)i.next();
            //System.out.println(map.get(stu));;
        }


        Hashtable mm = new Hashtable();
        mm.put(null, "null value");



        System.out.println(mm);














    }
}
