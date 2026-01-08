package coaching.basics;

//program to illustrate objects passed as arguments


class Student{
     int rollno,marks;
  void admission(int rollno){
       this.rollno=rollno;
       }
  void exam(int marks){
       this.marks=marks;
	}
  void show(){
      System.out.println("Roll no.= "+rollno);
	System.out.println("marks= "+marks);
  }
  }

class Test{
void m(Student st){           //parameter defined as reference variable of student data type
st.exam(80);
st.show();
    }}

class ArgMethodTest{
public static void main(String s[]){
Student s1;
s1=new Student();
s1.admission(110);
Test t=new Test();
t.m(s1);        //ref variable passed as argument
}
}