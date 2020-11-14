import java.sql.*;

public class CrudBooks {

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
            System.out.println("Connected MariaDB!!!");
            pstmt.execute(
                    "INSERT INTO books (isbn, title, author_id, year_pub)" +
                            "VALUES('0805211064', 'Dark', 'Fulano de Tal', '1996')"
            );
            pstmt.execute(
                    "INSERT INTO books (isbn, title, author_id, year_pub)" +
                            "VALUES('0805211065', 'Cthullu', 'H.P.', '1986')"
            );
            pstmt.execute(
                    "INSERT INTO books (isbn, title, author_id, year_pub)" +
                            "VALUES('0805211066', 'OZOB', 'Deive', '2008')"
            );
            System.out.println("Dados Inseridos!!!");

            String query = "select * from books";
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String isbn
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
