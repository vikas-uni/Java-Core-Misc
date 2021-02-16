package coaching.basics;

//prog to demo abstract class
abstract class abs {

    abstract void m1();   //an abstract method(only to be defined in abstract class)
    void m2() {
        System.out.println("m2 in abstract");
    }
}

class A extends abs {

    void m1() {
        System.out.println("m1 in A");
    }

    void m2() {
        System.out.println("m2 in A");
    }
}

class abstest {

    public static void main(String s[]) {
        abs t = new A();
        t.m1();
        t.m2();
    }
}
