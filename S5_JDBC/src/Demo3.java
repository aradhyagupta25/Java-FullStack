import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class Demo3 {
    public static void main(String[] args) throws Exception{

    Class.forName("org.postgresql.Driver");
    String url = "jdbc:postgresql://localhost:5432/Demo";
    String user = "postgres";
    String password = "2005";

    int sid = 99;
    String sname = "Gyaneshwar";
    int marks = 87;

    String query = "insert into student values (?,?,?)";    // ? for the dynamic data.


    Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection Established.");

    PreparedStatement ps = con.prepareStatement(query) ;     // updating table, structure, altering table, Select query -> "Statement".
    // others, Select with word clause -> "PreparedStatement".

    ps.setInt(1, sid);  // col no., data
    ps.setString(2, sname);
    ps.setInt(3, marks);
    ps.execute();


    con.close();
    System.out.println("Connection Closed.");


    }
}
