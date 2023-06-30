package coaching.IO;

//prog to demo Scanner class(this has the capability to parse the text into primitive types
import java.util.Scanner;

class ScannerTest {

    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter marks");
        int marks = sc.nextInt();

        System.out.println("name= " + name + "  rollno= " + rollno + "  marks= " + marks);
    }
}
