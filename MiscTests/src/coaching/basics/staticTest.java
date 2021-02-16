package coaching.basics;

//prog to demonstrate static variables

class Tests{
static int x;           //static variable
int y;
Tests(int a){
x=a;
y=a;
}
void show(){
System.out.println("x is "+x+" ,y is "+y);
}
static void display(){           //a static method
System.out.println("x is "+x+" (accessed through class name)");
}

}
class staticTest{
public static void main(String s[]){
Tests t1=new Tests(10);
Tests t2=new Tests(20);
Tests t3=new Tests(30);
t1.show();
t2.show();
t3.show();
Tests.display();            //static methods can be accessed directly by class name
}
}