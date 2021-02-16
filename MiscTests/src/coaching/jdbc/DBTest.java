package coaching.jdbc;

//prog to demo java storage using database 
import java.sql.*;
//import com.mysql.jdbc.*;

class DBTest {

    public static void main(String s[]) {
        System.out.println("DB interaction going to start");
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load specified class of jdbc driver(found in rt.jar) in the memory(step 1)
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123"); //create connection to the specified database url and return instance of Connection(step 2)
            Statement st = con.createStatement();                                  //create Statement to execute query(step 3)
            st.executeUpdate("create table student1(name varchar(10),rollno varchar(5),marks int,grade varchar(2))"); //use Statement to interact with database(step 4)
            System.out.println("table created successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("table already exist");
        } catch (ClassNotFoundException e) {
            System.out.println("invalid name of driver class");
        }
    }
}
