package interfaceTest;

import java.sql.SQLException;

public class ParentClass {
	private int pr = 1;
	protected int pt = 2;
	int df = 3;

	public void testIt() throws SQLException{
		System.out.println("parent test");
	}
	
}
