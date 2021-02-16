package coaching.Collection;

//load property into property instance
import java.util.*;
import java.io.*;

class PropertyLoad {

    public static void main(String s[]) {
        try {
            Properties p = new Properties();
            FileInputStream fin = new FileInputStream("propstore.txt");
            p.load(fin);                        //loads all properties(key-value pairs)from specified text file into this property instance
            System.out.println("properties are loaded");
            String value = p.getProperty("course");
            System.out.println("course: " + value);
            System.out.println("city: " + p.getProperty("city"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
  
 properties can be retrieved using Enumeration by a method-
 -public Enumeration propertyNames() which returns the list of 
 of names of availabe properties.
 above code to retrieve properties can be replaced using enumeration
 after System.out.println("properties are loaded");
  
 Enumeration en=p.propertyNames();
 while(en.hasMoreElements());
 String key=(String)e.nextElement();
 System.out.println("key: "+key+"value: "+p.getProperty(key));
 }
 */
