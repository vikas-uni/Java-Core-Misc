package coaching.IO;

//prog to demo SequenceInputStream
import java.io.*;

class SequenceTest {

    public static void main(String s[]) throws IOException {
        FileInputStream fis1 = new FileInputStream("first.txt");
        FileInputStream fis2 = new FileInputStream("second.txt");
        SequenceInputStream sq = new SequenceInputStream(fis1, fis2);
        while (true) {
            int i = sq.read();
            if (i == -1) {
                break;
            }
            System.out.println((char) i);
        }
        sq.close();
    }
}