/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Student {
    
    int rollno,marks;
    
    Student(int roll, int mark){
      this.rollno = roll;
      this.marks = mark;
      
    }
    public String toString(){
    return "roll no = "+rollno+" marks = "+marks;
    }
    
}
