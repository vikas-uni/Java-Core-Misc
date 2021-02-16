package coaching.basics;

class employee2 {

    String name, type;
    int id, tax, basic, noh, rate, ta;

    employee2(String name, int id, int basic) {
        this.name = name;
        this.type = "fulltime";
        this.id = id;
        this.basic = basic;
        ta = (basic * 10 / 100);
        tax = (basic + ta) * 6 / 100;
        System.out.println("Name " + name);
        System.out.println("ID " + id);
        System.out.println("Type " + type);
        System.out.println("basic " + basic);
        System.out.println("Tax " + tax);

    }

    employee2(String name, int id, int noh, int rate) {
        this.name = name;
        this.id = id;
        this.noh = noh;
        this.rate = rate;
        this.type = "parttime";
        tax = (noh * rate) * 8 / 100;
        tax = (noh * rate) * 8 / 100;
        System.out.println("Name " + name);
        System.out.println("ID" + id);
        System.out.println("Type " + type);
        System.out.println("no. of hours & rate " + noh + " " + rate);
        System.out.println("Tax " + tax);
    }
}

class emptestConst {

    public static void main(String s[]) {
        employee2 e1 = new employee2("Amit", 203, 20000);
        System.out.println("");
        employee2 e2 = new employee2("Kishore", 207, 4, 50);

    }
}