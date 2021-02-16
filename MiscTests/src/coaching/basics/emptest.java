package coaching.basics;

class employee {

    String name, type;
    int id, tax, basic, noh, rate, ta;

    void setdetail(String name, int id) {
        this.name = name;
//this.type=type;
        this.id = id;
    }

    void setsal(int basic) {
        this.basic = basic;
        type = "fulltime";
    }

    void setsal(int noh, int rate) {
        this.noh = noh;
        this.rate = rate;
        type = "parttime";
    }

    void calc() {
        if (type == "fulltime") {
            ta = (basic * 10 / 100);
            tax = (basic + ta) * 6 / 100;
        }
        if (type == "parttime") {
            tax = (noh * rate) * 8 / 100;
        }
    }

    void show() {
        System.out.println("Name " + name);

        System.out.println("Type " + type);
        System.out.println("basic " + basic);
        System.out.println("Tax " + tax);
    }
}

class emptest {

    public static void main(String s[]) {
        employee e1 = new employee();
        employee e2 = new employee();
        e1.setdetail("Amit", 21);
        e1.setsal(20000);
        e1.calc();
        e1.show();

        System.out.println("");
        e2.setdetail("Amit", 21);
        e2.setsal(4, 50);
        e2.calc();
        e2.show();

    }
}