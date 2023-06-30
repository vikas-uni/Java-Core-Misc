package coaching.annotation;

import java.lang.annotation.*;

class Test {

    @Deprecated
    void display() {
        System.out.println("deprecated method");
    }

    void m1() {
    }
}

class SubTest extends Test {

    @Override
    void m1() {
    }
}

class AnnotTest {

    public static void main(String s[]) {
        Test t = new Test();
        t.display();
    }
}
