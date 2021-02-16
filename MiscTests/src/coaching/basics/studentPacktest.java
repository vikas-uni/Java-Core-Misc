package coaching.basics;

import coaching.packg.pkg1.studentP;

class javaStudent extends studentP {

    javaStudent(int n) {
        super(n);
    }

    void display() {
        show();
    }
}

class studentPacktest {

    public static void main(String s[]) {
        javaStudent js = new javaStudent(102);
        js.set(40);
        js.display();
    }
}