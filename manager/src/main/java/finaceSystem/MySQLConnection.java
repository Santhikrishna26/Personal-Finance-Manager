package finaceSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/minipro";
    private static final String USER = "root";
    private static final String PASS = "ROOT";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
