package coaching.basics;

class area {

    int a, b, c, s, l, w, res;

    area(int s) {
        this.s = s;
        res = s * s;
        System.out.println("Area of square is: " + res);
    }

    area(int l, int w) {
        this.l = l;
        this.w = w;
        res = l * w;
        System.out.println("Area of rectangle is: " + res);
    }

    area(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        int x = ((a + b + c) / 2);


        res = (int) (Math.sqrt(x * (x - a) * (x - b) * (x - c)));
        System.out.println("Area of triangle is: " + res);
    }
}

class areatest {

    public static void main(String s[]) {
        area sq = new area(23);
        area rec = new area(23, 4);
        area tri = new area(4, 4, 5);
    }
}
