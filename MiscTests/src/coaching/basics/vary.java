package coaching.basics;

class firstA {

    int x = 40;
    int y = 70;

    firstA() {
        System.out.println("const inherited");//here constructor will be inherited in all child
    }
}

class secondA extends firstA {

    int x = 20;       //x becomes 40 here
}

class thirdA extends secondA {

    int x = 30;

    void show() {
        System.out.println("x is: " + x);
    }
}

class vary {

    public static void main(String s[]) {
        firstA f = new secondA();
        System.out.println("value of x is: " + f.x + " " + f.y);
        secondA t = new thirdA();
//t.show();
        System.out.println("x in third= " + t.x);
        thirdA th = new thirdA();
        th.show();

    }
}