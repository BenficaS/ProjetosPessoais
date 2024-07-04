import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {


        Connection connection = null;
        try {
            String driverName = "org.gjt.mm.mysql.Driver";
            Class.forName(driverName);

            String servername = "localhost";
            String mydatabase = "mydatabase";
            String url = "jdbc:mysql://" + servername + "/" + mydatabase;
            String username = "username";
            String password = "password";

            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {

        }
        try {
            Statement stmt = connection.createStatement();
            String sql = "TRUNCATE my_table";
            sql = "DELETE FROM my_table";
            stmt.executeUpdate(sql);

        }catch (SQLException e){

        }
    }
}
