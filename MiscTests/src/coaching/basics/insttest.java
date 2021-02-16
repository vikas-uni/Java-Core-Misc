package coaching.basics;

//prog to demo. 'inastanceof' operator
class animal {

    void eat() {
        System.out.println("Eat method in animal");
    }

    void power() {
        System.out.println("power method in animal");
    }
}

class dog extends animal {

    void eat() {
        System.out.println("Eat method in dog");
    }

    void run() {
        System.out.println("run method in dog");
    }
}

class cat extends animal {

    void eat() {
        System.out.println("Eat method in cat");
    }

    void sleep() {
        System.out.println("sleep method in cat");
    }
}

class forest {

    void discover(animal a) {
        if (a instanceof dog) {
            dog d = (dog) a;
            d.run();
            d.power();
        }
        if (a instanceof cat) {
            cat c = (cat) a;
            c.sleep();
            c.power();
        }
    }
}

class insttest {

    public static void main(String s[]) {
        forest f = new forest();
        dog d = new dog();
        cat c = new cat();
        f.discover(d);
        f.discover(c);
    }
}