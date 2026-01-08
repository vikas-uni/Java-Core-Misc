package coaching.basics;

//prog to demo method oveeriding
class TopT {

    void m1(int x) {
        System.out.println("m1 in Top" + x);
    }

    void m2() {
        System.out.println("m2 in Top");
    }
}

class BottomT extends TopT {

    void m1() {                     //overriden method(it hides m1 in 'Top')
        System.out.println("m1 in bottom");
    }

    void m3() {
        System.out.println("m3 in bottom");
    }
}

class OverrideTest {

    public static void main(String s[]) {
        BottomT b = new BottomT();
        b.m1();
        b.m2();
        b.m3();
//in case if we pass argument to a parameterised top method then it will run
        b.m1(5);    //method in 'Top' will run
    }
}
