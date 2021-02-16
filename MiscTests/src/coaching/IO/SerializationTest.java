package coaching.IO;

//prog to demo Serializable         (contain errors)
import java.io.*;

class Student implements Serializable {

    int rollno, marks;
    char grade;

    Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    void result() {
        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }
    }

    void show() {
        System.out.println(rollno + " " + marks + " " + grade);
    }
}

class SerializationTest {

    public static void main(String s[]) {
        Student st;

        try {
            FileOutputStream fos = new FileOutputStream("stud");                    //creates a FileOutputStream with specified name in which object state is to be stored          
            ObjectOutputStream oos = new ObjectOutputStream(fos);                   //create an ObjectOutputStream which is connected to FileOutputStream 
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Enter the name of student");
                String name = br.readLine();
                System.out.println("Enter roll no.");
                int rollno = Integer.parseInt(br.readLine());
                System.out.println("Enter marks");
                int marks = Integer.parseInt(br.readLine());


                st = new Student(rollno, marks);
                st.result();
                System.out.println("Writing the student object into file...");
                oos.writeObject(st);                                              //write object into ObjectOutputStream
                oos.flush();
                System.out.println("Object Serialized");
                System.out.println("\n do you want to add more(Y/N)");
                String op = br.readLine();
                if (op.equalsIgnoreCase("N")) {
                    break;
                }
            }
            oos.close();



//retrieve records from file
            FileInputStream fin = new FileInputStream("stud");
            ObjectInputStream ops = new ObjectInputStream(fin);

            while (true) {

                try {
                    ops.readObject();

                } catch (EOFException e) {
                    break;
                }
                System.out.println(st.rollno + "\t" + st.marks + "\t" + st.grade);
            }

            ops.close();

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}