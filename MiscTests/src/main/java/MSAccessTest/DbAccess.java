/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MSAccessTest;

/**
 *
 * @author ADMIN
 */
import java.sql.*;

public class DbAccess
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");     //load the JDBC-ODBC driver.
            
            //declare a variable which store a string of the driver name for Microsoft Access 2007 and the location of the MyDatabase database.
//            String database = 
//              "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=D:\\Resources\\AccessDB\\MyDatabase.mdb;";
            
            //Make a connection using information on the variable which was created before
            Connection conn = DriverManager.getConnection("JDBC:ODBC:MyAccessDB");
            Statement s = conn.createStatement();
            
            // create a table
            String tableName = "myTable" + String.valueOf((int)(Math.random() * 1000.0));
            String createTable = "CREATE TABLE " + tableName + 
                                 " (id Integer, name Text(32))";
            s.execute(createTable); 
            
            // enter value into table
            for(int i=0; i<25; i++)
            {
              String addRow = "INSERT INTO " + tableName + " VALUES ( " + 
                     String.valueOf((int) (Math.random() * 32767)) + ", 'Text Value " + 
                     String.valueOf(Math.random()) + "')";
              s.execute(addRow);
            }
            
            // Fetch table
            String selTable = "SELECT * FROM " + tableName;
            s.execute(selTable);
            ResultSet rs = s.getResultSet();
            while((rs!=null) && (rs.next()))
            {
                System.out.println(rs.getString(1) + " : " + rs.getString(2));
            }
            
            // drop the table
//            String dropTable = "DROP TABLE " + tableName;
//            s.execute(dropTable);
            
            // close and cleanup
            s.close();
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
