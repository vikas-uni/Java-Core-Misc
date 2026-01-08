/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serializeTest;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import misc.Student;

/**
 *
 * @author ADMIN
 */
public class SerializationTest {

     
      public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            Student st = new Student("jon",11,50);
            st.result();
            oos.writeObject(st);
            oos.flush();
            
            Student st1 = new Student("jim",12,70);
            st.result();
            oos.writeObject(st1);
            oos.flush();
            
            Student st2 = new Student("jack",13,90);
            st.result();
            oos.writeObject(st2);
            oos.flush();
            
            oos.close();
            
            //retrieve records from file
            FileInputStream fis = new FileInputStream("Student.txt");
            ObjectInputStream ops = new ObjectInputStream(fis);
            
            while(true){
                 Student s;
                try{
                s = (Student)ops.readObject();
                }catch(EOFException e){
                    break;
                }
                System.out.println(s.getRollno()+"\t"+s.getMarks()+"\t"+s.getGrade()+"\t"+s.getName());
            }
            ops.close();
        } catch (Exception ex) {
            Logger.getLogger(SerializationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}

