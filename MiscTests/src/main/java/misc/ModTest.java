/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ModTest {
    static{   //this static block will run as the class is loaded into memory.Run only once
        System.out.println("Static");
    }
    
    {     //this init block will run before constructor runs
        System.out.println(" init run");
//        System.exit(0);
    }
    
    
//     abstract void run();

    public ModTest() {
        System.out.println("constructor run");
        
    }
    {
        System.out.println(" init run2");
//        System.exit(0);
    }
    
    public static void main(String[] args) {
        String st = "This is a test which is performed";
//        System.out.println(st.replaceFirst("is", "at"));
        String [] spt = st.split(" ",3);
        for (String string : spt) {
            System.out.println(string);           
        }
//        System.out.println(int.class.);
        
        List<Number> numberList = new ArrayList<Number>();
        numberList.add(3);
        numberList.add(3.6);
        numberList.add(4.5d);
        
        for (Number number : numberList) {
            System.out.println(number);
        }
       ModTest mt = new ModTest();
       
    }
}
