package coaching.basics;

//program to demo. polymorphism
class shape {

    void set() {
        System.out.println("set in shape");
    }

    void calc() {
        System.out.println("calc in shape");
    }
}

class square extends shape {

    void set() {
        System.out.println("set in square");
    }

    void show() {
        System.out.println("show in square");
    }
}

class polyTest {

    public static void main(String arg[]) {
        shape s = new square();
        s.set();     //will override set() in shape
        s.calc();    //calc() will be inherited from shape
//s.show();    this will not compile as show() is unique to square class
    }
}