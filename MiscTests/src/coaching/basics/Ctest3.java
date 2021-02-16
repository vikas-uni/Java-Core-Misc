package coaching.basics;

class first {

    first() {
        this(10);
        System.out.println("default in first");
    }

    first(int x) {
        System.out.println("param in first");
    }
}

class second extends first {

    second() {
        super(10);
        System.out.println("default in second");
    }

    second(int x) {
        this();
        System.out.println("param in second");
    }
}

class third extends second {

    third() {
        super(10);
        System.out.println("default in third");
    }

    third(int x) {
        System.out.println("param in third");
    }
}

class Ctest3 {

    public static void main(String... s) {
        third t = new third();
    }
}