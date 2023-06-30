package coaching.IO;

//prog to demo DataIO
import java.io.*;

class DataIOTest {

    public static void main(String s[]) throws IOException {
        FileOutputStream fout = new FileOutputStream("student");                //creates a FileOutputStream -student
        DataOutputStream dout = new DataOutputStream(fout);                      //used to stream data output in FileOutputStream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter the name");
            String name = br.readLine();
            System.out.println("Enter the roll no.");
            int rollno = Integer.parseInt(br.readLine());
            System.out.println("Enter marks");
            float marks = Float.parseFloat(br.readLine());
            System.out.println("Enter grade");
            char grade = br.readLine().charAt(0);

            dout.writeUTF(name);                              //writes values in student
            dout.writeInt(rollno);
            dout.writeFloat(marks);
            dout.writeChar(grade);
            dout.flush();

            System.out.println("Enter more?(yes/no)");
            String option = br.readLine();
            if (option.equalsIgnoreCase("no")) {
                break;
            }
        }
        fout.close();
        System.out.println("Content stored in the file");
        FileInputStream fis = new FileInputStream("student");
        DataInputStream din = new DataInputStream(fis);
        while (true) {
            String name;
            try {

                name = din.readUTF();
            } catch (Exception e) {
                break;
            }

            System.out.println("" + name);
            System.out.println("" + din.readInt());
            System.out.println("" + din.readFloat());
            System.out.println("" + din.readChar());
        }
    }
}