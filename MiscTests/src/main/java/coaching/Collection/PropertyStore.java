package coaching.Collection;

//prog to demo. java.util.Properties class(this class provides the way to store key-value pairs from the text files and is subclass of Hashtable)
//prog to store properties(key-value)in text files
import java.util.*;
import java.io.*;

class PropertyStore {

    public static void main(String s[]) {
        try {
            Properties p = new Properties();                       //create an instance of Properties class
            FileOutputStream fout = new FileOutputStream("propstore.txt");           //create a FileOutputStream
            p.setProperty("123", "abc");                                          //set properties
            p.setProperty("city", "noida");
            p.setProperty("course", "java");
            p.store(fout, "this is property file");                        //store properties into file specified into FileOutputStream,with comment

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Properties stored successfully");
    }
}