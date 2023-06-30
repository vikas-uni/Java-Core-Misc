/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Student implements Serializable {

        private int rollno;
		private int marks;
        private char grade;
        private String name;

        public Student(String name, int rollno, int marks) {
            this.setRollno(rollno);
            this.setMarks(marks);
            this.setName(name);
        }

        public void result() {
            if (getMarks() >= 80) {
                setGrade('A');
            } else if (getMarks() >= 60) {
                setGrade('B');
            } else if (getMarks() >= 40) {
                setGrade('C');
            } else {
                setGrade('D');
            }
        }
        void show(){
            System.out.println(getRollno()+" "+getMarks()+" "+getGrade());
        }

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public char getGrade() {
			return grade;
		}

		public void setGrade(char grade) {
			this.grade = grade;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
    }
    