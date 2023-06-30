package coaching.IO;

//prog to demo reader classes
import java.io.*;

class FileCopyTest {

    public static void main(String s[]) throws IOException {
        FileInputStream fis = new FileInputStream("file1.txt");
        FileOutputStream fout = new FileOutputStream("file2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        PrintWriter pw = new PrintWriter(fout);
        while (true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            str = sb.toString();
            pw.println(str);
            pw.flush();
        }
        fis.close();
        fout.close();
    }
}