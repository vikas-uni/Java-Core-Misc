package coaching.basics;

//prog to demonstrate static variables
class salesman {

    String name;
    int id, salesamt, nos, avgsale, comm;
    static int tots, totnos, totcomm;    //static variables
    salesman(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void sales(int amt) {
        salesamt = amt + salesamt;
        nos = nos + 1;
        totnos = totnos + 1;
        tots = tots + 1;
    }

    public void calc() {
        comm = (int) (salesamt * 0.05);
        totcomm = (int) (totnos * salesamt * 0.05);
    }

    public void show() {
        System.out.println("Name= " + name + " ID= " + id);
        System.out.println("Sales amount= " + salesamt);
        System.out.println("No. of sales= " + nos);
    }

    static void showtotal() {
        System.out.println("Total no. of sales= " + totnos);
        System.out.println("Total sales= " + tots);
        System.out.println("Total commission= " + totcomm);
    }
}

class salesmanDemo {

    public static void main(String s[]) {
        salesman s1 = new salesman("ramu", 101);
        salesman s2 = new salesman("mohan", 102);
        salesman s3 = new salesman("karim", 103);
        s1.sales(3000);
        s2.sales(5000);
        s3.sales(8000);
        s1.calc();
        s2.calc();
        s3.calc();
        s1.show();
        s2.show();
        s3.show();
        s2.showtotal();
    }
}