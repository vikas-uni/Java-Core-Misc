package coaching.basics;

//employee prog using inheritence
class Employee {

    String name;
    int id, net, tax;

    void setdetail(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showdetails() {
        System.out.println("Name= " + name);
        System.out.println("ID= " + id);
    }
}

class FulltimeEmp extends Employee {

    int basic, hra, ta, da;

    void setsal(int sal) {
        basic = sal;
    }

    void salcalc() {
        hra = (int) (basic * 0.5);
        da = (int) (basic * 0.6);
        tax = (basic + da + ta + hra) * 4 / 100;
        net = basic + da + hra - tax;
    }

    void show() {
        showdetails();
        System.out.println("Basic: " + basic);
        System.out.println("TA: " + ta);
        System.out.println("HRA: " + hra);
        System.out.println("Tax: " + tax);
        System.out.println("Net salary: " + net);
    }
}

class EmployeeInherit {

    public static void main(String s[]) {
        FulltimeEmp f = new FulltimeEmp();
        f.setdetail("ramu", 110);
        f.setsal(15000);
        f.salcalc();
        f.show();
    }
}