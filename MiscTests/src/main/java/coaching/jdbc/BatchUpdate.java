package coaching.jdbc;

//prog to demo batch update in databases
import java.sql.*;

class BatchUpdate {

    public static void main(String s[]) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
            Statement st = con.createStatement();
            st.addBatch("insert into student values('jkl','101',55,'c')");
            st.addBatch("delete from student where rollno='103'");
            st.addBatch("update student set marks=100 where rollno='456'");
            st.executeBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}