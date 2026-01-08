package coaching.basics;

class StudentA {

    int rollno, marks;
    String name;

    StudentA(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void exam(int marks) {
        this.marks = marks;
    }

    void show() {
        System.out.println(name + "  " + rollno + "  " + marks);
    }
}

class StudentOperation {

    void sort(StudentA st[]) {       //here argument received is a ref variable of type array
        StudentA temp;
        for (int i = 0; i < st.length; i++) {
            for (int j = i + 1; j < st.length; j++) {
                if (st[i].marks < st[j].marks) {
                    temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;

                }
            }
        }
    }
}

class Refarraytest {

    public static void main(String s[]) {
        StudentA st[] = new StudentA[5];   //an array of ref variables to student objects is created
        for (int i = 0; i < st.length; i++) {
            st[i] = new StudentA(101 + i, "s[i]");
            int m = (int) (Math.random() * 101);
            st[i].exam(m);
        }

        System.out.println("list of students");
        for (int i = 0; i < st.length; i++) {
            st[i].show();
        }
        StudentOperation op = new StudentOperation();
        op.sort(st);
        System.out.println("Sorted list");
        for (int i = 0; i < st.length; i++) {
            st[i].show();
        }
    }
}