package coaching.basics;

//prog to demo private access modifier
class acctest {

    private int x, sum;
    int y;

    void set(int a, int b) {
        x = a;
        y = b;
    }

    private void calc() {
        sum = x + y;
    }

    void show() {
        calc();
        System.out.println("sum is " + sum);
    }
}

class accesstest {

    public static void main(String s[]) {
        acctest t = new acctest();
        t.set(5, 8);
//t.calc();  this will create compile error as calc() is private to test
        t.y = 50;
//t.x=55;  this will create compile error as x is private to test
        t.show();
    }
}