package coaching.IO;

//prog to demo PrintStream
import java.io.*;

class PrintStreamTest {

    public static void main(String s[]) throws FileNotFoundException {
        PrintStream p = new PrintStream("check.txt");   //creates a new PrintStream file of specified name 
        String txt = "this is first line";
        p.print(txt);                         //writes specified txt to file
        txt = "this is second line";
        p.print(txt);
        txt = "this is third line";
        p.print(txt);
        p.close();                           //close file
    }
}