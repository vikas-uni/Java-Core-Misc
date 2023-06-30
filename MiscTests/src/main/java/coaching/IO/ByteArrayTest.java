package coaching.IO;

//prog to demo ByteArrayOutputStream
import java.io.*;

class ByteArrayTest {

    public static void main(String s[]) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte b[] = new byte[bis.available()];
        bis.read(b);                             //data copied into byte array
        ByteArrayInputStream bin = new ByteArrayInputStream(b);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bin.read(b);
        bout.write(b);                            //data copied into stream
        FileOutputStream fout = new FileOutputStream("newfile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fout);
        bout.writeTo(bos);
        bos.flush();
        bos.close();
        System.out.println("Following data has been copied: ");
        bin.reset();
        bin.read(b);
        System.out.println(new String(b));
    }
}