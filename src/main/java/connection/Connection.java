/*package connection;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connection {
    public static void main(String[] args){
        Connection con = null;
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet result = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:8080/soccer");
            st = con.createStatement();

            result = st.executeQuery("select from Cup Tournament");
            String tournamentName
        }
        jdbc:mysql://localhost:8080/soccer
    }
}
*/