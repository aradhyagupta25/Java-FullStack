import javax.lang.model.element.NestingKind;
import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws Exception {

    Class.forName("org.postgresql.Driver");

    String url = "jdbc:postgresql://localhost:5432/Demo";
    String user = "postgres";
    String password = "2005";
    //String query = "insert into student values (5, 'John', 69)";
        //String query = "update student set sname='Dharampal' where sid=5";
        String query = "delete from student where sid=5";




    Connection con = DriverManager.getConnection(url, user, password);
    System.out.println("Connection Established.");
    Statement st = con.createStatement();
    System.out.println("Executing query: " + st.execute(query));        // Returns true if the first object that the query returns is a ResultSet object. Use this method if the query could return one or more ResultSet objects. Retrieve the ResultSet objects returned from the query by repeatedly calling Statement.getResultSet.

    con.close();
    System.out.println("Connection Closed.");

    }
}
