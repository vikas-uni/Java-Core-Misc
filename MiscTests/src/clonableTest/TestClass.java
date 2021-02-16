package clonableTest;

public class TestClass implements Cloneable{
int x;
String y;

public static void main(String[] args) {
	TestClass t = new TestClass();
	t.x = 2;
	t.y = "test";
	try {
		Object  ob = t.clone();
		System.out.println(ob);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}

@Override
public String toString() {
	return "TestClass [x=" + x + ", y=" + y + "]";
}

}
