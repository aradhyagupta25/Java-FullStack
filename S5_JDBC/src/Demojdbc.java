import java.sql.*;      //importing package

public class Demojdbc extends  Exception{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         /*
                import package
                load and register the driver
                create connection
                create statement
                execute statement
                process the results
                close
          */

        Class.forName("org.postgresql.Driver");     //loading and registering the driver. optional cuz automatically done.


        //creating connection
        String url = "jdbc:postgresql://localhost:5432/Demo";
        //java will be connecting with jdbc: jdbc will be connecting with postgresql: database name in postgresql available in the network
        // "://localhost:5432/demo" - the database is local (postgresql) so we mention local otherwise if available on network, mention IP add. portno. for postgresql is 5432.
        String uname = "postgres";
        String pass = "2005";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established.");


        // Creating and executing Statement
        //String  query = "select sname from student where sid = 1";

        String query =  "select * from student";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);  //executeQuery returns ResultSet. ResultSet is an Interface.
        //System.out.println(rs.next());  //returns true if the new current row is valid (meaning there is another row to process) and false if there are no more rows in the result set.

        //rs.next();  //the pointer's before the first line. next() method will bring the pointer to the first line.
        //System.out.println("Name of the student is " + rs.getString("sname"));

        while(rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }

        //closing connection
        con.close();
        System.out.println("Connection closed.");

    }
}
