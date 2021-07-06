package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection getMySQLConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Example: jdbc:mysql://localhost:3306/simplehr
            String connectionURL = "jdbc:mysql://localhost:3306/new_test";
            Connection conn = DriverManager.getConnection(connectionURL, "root", "123456");
            System.out.println("Connect success");
            return conn;
        } catch (Exception ex) {
            System.out.println("Connect fail");
            return null;
        }

    }

    public static void close(PreparedStatement preparedStatement, Connection connection) {
        try {
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Cannot close");
        }
    }
}
