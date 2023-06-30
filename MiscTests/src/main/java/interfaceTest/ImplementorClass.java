package interfaceTest;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ImplementorClass implements Interface1,Interface2 {

	/*@Override
	public String testMethod() throws SQLException, FileNotFoundException{   //this doesnt works
		// TODO Auto-generated method stub
		return null;
	}*/
	public String testMethod() throws FileNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}


	/*public String testMethod() {                                         //this works too
		// TODO Auto-generated method stub
		return null;
	}*/
	}
