package coaching.IO;

//prog to demo File class
import java.io.*;

class FileTest {

    public static void main(String s[]) throws IOException {
        File f = new File("myfile.txt");                             //create a new File object with specified name
        System.out.println("is file exists: " + f.exists());             //checks if file exists or not
        System.out.println("file created " + f.createNewFile());      //creates new file and returns true if other file does'nt exists
        System.out.println("is file exists: " + f.exists());
        File d = new File("demo");
        System.out.println("directory created: " + d.mkdir());          //create a new directory with name specified in object demo
        System.out.println("creation of new file within the directory");
        File f2 = new File(d, "newfile.txt");                                //create new file within specified directory
        f2.createNewFile();
        System.out.println("changing the name of first file");
        File newfile = new File("myNewfile.txt");
        f.renameTo(newfile);
        System.out.println("file name changed as: " + f.getName());
    }
}
