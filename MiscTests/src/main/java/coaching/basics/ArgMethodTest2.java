package coaching.basics;

//program to illustrate objects passed as arguments
class StudentT {

    int rollno, marks;

    void admission(int rollno) {
        this.rollno = rollno;
    }

    void exam(int marks) {
        this.marks = marks;
    }

    void show() {
        System.out.println("Roll no.= " + rollno);
        System.out.println("marks= " + marks);
    }
}

class TestT {

    void m(StudentT st) {           //parameter defined as reference variable of student data type
        st.admission(101);
        st = new StudentT();
        st.exam(90);
    }
}

public class ArgMethodTest2 {

    public static void main(String s[]) {
        StudentT st1, st2;
        st1 = new StudentT();
        st2 = st1;
        TestT t = new TestT();
        t.m(st2);                  //ref variable passed as argument
        st2 = new StudentT();
        t.m(st1);
        st2.show();
        st1.show();
    }
}