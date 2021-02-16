package coaching.jdbc;

//prog to insert and view the records
import java.sql.*;
import java.io.*;

class DBOperation {

    Connection con;
    Statement st;
    ResultSet rs;

    DBOperation() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:mydsn");
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void insertRecord(String nm, String r, int m, String g) throws SQLException {
        st.executeUpdate("insert into student values('" + nm + "','" + r + "'," + m + ",'" + g + "')");
    }

    void report() throws SQLException {
        rs = st.executeQuery("select*from student");

        while (rs.next()) {
            System.out.print(rs.getString(1));
            System.out.print("\t" + rs.getString(2));
            System.out.print("\t" + rs.getString(3));
            System.out.println("\t" + rs.getString(4));
        }
    }
}

class DBTest2 {

    public static void main(String s[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int option;
            DBOperation db = new DBOperation();
            do {
                System.out.println("\n1.Add record \n 2.Report");
                System.out.println("enter your option");
                option = Integer.parseInt(br.readLine());
                switch (option) {
                    case 1:
                        String nm,
                         rno,
                         grade;
                        int marks;
                        System.out.println("enter the name");
                        nm = br.readLine();
                        System.out.println("enter roll no");
                        rno = br.readLine();
                        System.out.println("enter marks");
                        marks = Integer.parseInt(br.readLine());
                        System.out.println("enter grade");
                        grade = br.readLine();
                        db.insertRecord(nm, rno, marks, grade);
                        break;
                    case 2:
                        db.report();
                        break;
                    default:
                        System.out.println("invalid option");
                }
                System.out.println("do you want to continue?(yes/no)");
            } while (br.readLine().equalsIgnoreCase("yes"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}