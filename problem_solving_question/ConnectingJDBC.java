/*How to execute procedure in JBDC connect in java program*/

// /* Java database connectivity with 5 steps
//  * I: Register the drive class.
//  * II: Create connection
//  * III: Create Statement
//  * IV: Execute queries
//  * V: Close connection
//  */

// package problem_solving_question;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class ConnectingJDBC {
//     /* Register the drive class */
//     public static void forName(String className) throws ClassNotFoundException {
//         /* Create Connection */
//         Class.forName("Oracle.jbdc.driver.OracleDriver");
//     }

//     /* Create Connection Object */
//     /* getConnection Syntex */
//     public static Connection getConnection(String url_string) throws SQLException {
//         /* Estabelish connection with the oracle Database */
//         Connection con = DriverManager.getConnection("jbdc:oracle:thin:@localhost:1521:xe", "System", "Password");
//         return con;
//     }

//     public static Connection getConnection(String user_name, String url, String password) throws SQLException {
//         /* Estabelish connection with the oracle Database */
//         Connection con = DriverManager.getConnection("jbdc:oracle:thin@localhost:1521:xe", "System", "Password");
//         return con;
//     }

//     /* Create Statement object */
//     /* Syntex for createStatement() method */
//     public Statement createStatement(String url, String user_name, String password) throws SQLException {
//         Connection con = DriverManager.getConnection("jbdc:oracle:thin@localhost:1521:xe", "System", "Password");
//         Statement stet = con.createStatement();
//         return stet;
//     }

//     /* Execute the querey */
//     /* Syntex for resultSet() method */
//     public ResultSet executeQuery(String sql) throws SQLException {
//         Connection con = DriverManager.getConnection("jbdc:oracle:thin@localhost:1521:xe", "System", "Password");
//         Statement stet = con.createStatement();
//         ResultSet r_set = stet.executeQuery("Select * from emp");
//         while (r_set.next()) {
//             System.out.println(r_set.getInt(1) + " " + r_set.getString(2));
//         }
//         return r_set;
//     }

//     /* Close the connection */
//     public void close() throws SQLException {
//         Connection con = DriverManager.getConnection("jbdc:oracle:thin@localhost:1521:xe", "System", "Password");
//         Statement stet = con.createStatement();
//         ResultSet r_set = stet.executeQuery("Select * from emp");
//         while (r_set.next()) {
//             System.out.println(r_set.getInt(1) + " " + r_set.getString(2));
//         }
//         con.close();
//     }
package problem_solving_question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Connecting the oracle  database
 */
public class ConnectingJDBC {
    public static void main(String[] args) {
        try {
            /*load driver class*/
            Class.forName("oracle.jdbc.driver.OracleDriver");

            /*Create the connection */
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            /*Create the statement object*/
            Statement state = con.createStatement();

            /*Execute query*/
            ResultSet r_set = state.executeQuery("select*from EmployeeInfo");
            while (r_set.next()) {
                System.out.println(r_set.getInt(1)+" " +r_set.getString(2)+" "+r_set.getString(3));
            }

            /*connection the close*/
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }  
    }
}
