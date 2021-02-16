package coaching.basics;

//prog to demo. Dynamic method dispatching
class Top {

    void m1() {
        System.out.println("m1 in Top");
    }
}

class Bottom extends Top {

    void m1() {
        System.out.println("m1 in bottom");
    }

    void m2() {
        System.out.println("m2 in bottom");
    }
}

class DynamicTest {

    public static void main(String s[]) {
        Top t = new Bottom();   //parent class ref initialized with child object 
        t.m1();
//t.m2();    this will create compile error
    }
}