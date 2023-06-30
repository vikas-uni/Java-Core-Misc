package SQLTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLdbTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = null;
	    try
	    {
	      // the sql server driver string
	      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    
	      // the sql server url
	      
	      String url = "jdbc:sqlserver://VIKASGOND:1433;databaseName=test;user=NAGARRO\\vikasgond;password=Redmi3sprime";
	    		  
	    		  //"jdbc:sqlserver://172.24.94.219\\medqa11;DatabaseName=Transformer_temp;User=qaadmin;Password=qanalyst2";  //qsql102v
	      
	      //String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=OAUTH";//"jdbc:sqlserver://MITCHELLCOE1\\SQLEXPRESS:1433;DatabaseName=ClaimDB;User=ccUser;Password=info123!"
	     // String url = "jdbc:sqlserver://VIKASGOND:1433;DatabaseName=ClaimCenterDatabase;User=ccUser;Password=info@123";
	      //String url = "jdbc:sqlserver://10.0.54.81\\SQLEXPRESS;DatabaseName=ClaimCenterDatabase;User=ccUser;Password=info@123";
	      //String url = "jdbc:sqlserver://172.18.66.126:1433;DatabaseName=Guidewire_ci;User=ccUser;Password=info@2017";
	      // get the sql server database connection
	      //connection = DriverManager.getConnection(url,"claimUser", "info123!");
	      connection = DriverManager.getConnection(url);
	      
	      // now do whatever you want to do with the connection
	      // ...
	      System.out.println(connection.getMetaData().getDatabaseProductName());
	      System.out.println(connection.getMetaData().getDatabaseMajorVersion());
	      System.out.println(connection.getMetaData().getDatabaseMinorVersion());
	      System.out.println(connection.getMetaData().getDatabaseProductVersion());
	      System.out.println(connection.getMetaData().getURL());
	      
//	      Statement st = connection.createStatement();
//	      String s = "select * from oauth_access_token";
//	      ResultSet rs = st.executeQuery(s);
//	       while(rs.next()){
//	    	   
//	    	   System.out.println(rs.getBytes(2));
//	       }
	      
	      connection.close();
	    }
	    catch (ClassNotFoundException e)
	    {
	      e.printStackTrace();
	      System.exit(1);
	    }
	    catch (SQLException e)
	    {
	      e.printStackTrace();
	      System.exit(2);
	    }
	    

	}

}
