package interfaceTest;

import java.sql.SQLException;

public class ChildClass extends ParentClass {

	public void testIt(){
		System.out.println("child test");
	
	}
	
	public static void main(String[] args) {
		ParentClass parentClass = new ChildClass();
		
		//parentClass.testIt();  //compile error
		((ChildClass)parentClass).testIt();
		
//		ChildClass ch = new ParentClass();  // compile error
		ChildClass ch = (ChildClass)new ParentClass();  //throws ClassCastException
		try {
			((ParentClass)ch).testIt();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = (String)new Object();
	}
	
}
