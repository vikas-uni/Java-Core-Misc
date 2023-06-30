package coaching.basics;

// prog to demonstrate static block
class testA {          //start of static block
    static {
        System.out.println("Test class loaded");
    }

    testA() {
        System.out.println("Object created");
    }

    static void m1() {           //a static method(can be called using classname
        System.out.println("m1 invoked");
    }
}

class statictest2 {

    public static void main(String s[]) {
        testA t1;
        System.out.println("welcome");
        t1 = new testA();
        testA.m1();
        testA.m1();
    }
}