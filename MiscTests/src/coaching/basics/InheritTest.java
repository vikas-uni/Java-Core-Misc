package coaching.basics;

//program to demonstrate inheritence
class Top2 {

    int x;

    void m1() {
        System.out.println("m1 in Top");
    }
}

class Bottom2 extends Top2 {    //properties top copied in bottom
    int y;

    void m2() {
        System.out.println("m2 in Bottom");
    }
}

class InheritTest {

    public static void main(String s[]) {
        Bottom2 b = new Bottom2();
        b.m1();          //m1 can be called using object of bottom
        b.m2();
        b.x = 10;
        b.y = 20;
    }
}
