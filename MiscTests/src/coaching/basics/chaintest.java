package coaching.basics;

//prog to demo constructor chaining
class first1 {

    first1() {
        System.out.println("First const");
    }
}

class second2 extends first1 {

    second2() {
        System.out.println("second const");
    }
}

class third3 extends second2 {

    third3() {
        System.out.println("third const");
    }
}

class chaintest {

    public static void main(String[] s) {
        third th = new third();
    }
}