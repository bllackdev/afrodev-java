import java.sql.*;

public class CrudAuthors {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        String url = "jdbc:mariadb://localhost:3306/bookstore?";
        String user = "root";
        String password = "9417";

        try {
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            System.out.println("Connected!!!");
            pstmt = con.prepareStatement(
                    "INSERT INTO authors (name_last, name_first, country)" +
                            "VALUES('Kafka', 'Franz', 'Czech Repuplic')"
            );
            pstmt.execute();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
