package coaching.basics;

enum Bookprice {

    java(120), oracle(320), sql(190);
    int price;

    Bookprice(int n) {
        price = n;
    }

    int getp() {
        return price;
    }
}

class Entest2 {

    public static void main(String s[]) {
        Bookprice bp;
        bp = Bookprice.java;
        System.out.println("Book name is " + bp + " price is " + bp.getp());
    }
}
