package coaching.IO;

//demo of java.io packaes-read the data in the program from available file
import java.io.*;

class FileInputTest {

    public static void main(String s[]) {

        try {
            FileInputStream fis = new FileInputStream("abc.txt");              //this stream is used to read data from available byte
            System.out.println("content of the file are as follows: \n");
            while (true) {
                int i = fis.read();                           //read() reads the single byte from source stream
                if (i == -1) //if file finished
                {
                    break;
                }
                System.out.print((char) i);                //downcast integers into charater format
            }
            fis.close();                              //close the file
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
