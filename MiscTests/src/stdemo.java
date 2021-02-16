
class sttest {

    static {
        System.out.println("Class loaded");
    }

    {
        System.out.println("object created");
    }

    sttest() {
        System.out.println("constructor initialized");
    }

    static void m1() {
        System.out.println("m1 invoked");
    }

    void m2() {
        System.out.println("m2 invoked");
    }
}

class stdemo {

    public static void main(String s[]) {
        sttest t;
        System.out.println("Welcome");
        sttest.m1();
        t = new sttest();
        t.m2();
        sttest t2 = new sttest();
        t2.m2();
    }
}
