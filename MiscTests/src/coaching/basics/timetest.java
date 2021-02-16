package coaching.basics;

class time {

    int h, m;

    void settime(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void showtime() {
        System.out.println(h + " " + m);
    }
}

class adder {

    time add(time t1, time t2) {
        int m = (t1.m + t2.m) % 60;
        int h = (t1.h + t2.h) / 60;
        time t3 = new time();
        t3.settime(h, m);
        return (t3);
    }
}

class timetest {

    public static void main(String s[]) {
        time r1, r2, r3;
        r1 = new time();
        r1.settime(5, 50);
        r2 = new time();
        r2.settime(4, 40);
        adder a = new adder();
        r3 = a.add(r1, r2);
        r1.showtime();
        r2.showtime();
        r3.showtime();
    }
}