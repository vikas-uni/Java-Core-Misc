package coaching.packg.pkg1;

public class studentP {

    int rollno, marks;

    public studentP(int r) {
        rollno = r;
    }

    public void set(int m) {
        marks = m;
    }

    public void show() {
        System.out.println("roll no= " + rollno + "  marks= " + marks);
    }
}