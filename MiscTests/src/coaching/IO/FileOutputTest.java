package coaching.IO;

//prog to accept text from user and store it in a file
import java.io.*;

class FileOutputTest {

    public static void main(String st[]) {
        try {
            File f = new File(st[0]);                         //create a file object
            FileOutputStream fout = new FileOutputStream(f);         //create a FileOutputStream object with file object as parameter
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter text and press only enter to stop");
            while (true) {
                String s = br.readLine();
                byte b[] = s.getBytes();
                fout.write(b);
            }
        } catch (IOException e) {
        }
    }
}