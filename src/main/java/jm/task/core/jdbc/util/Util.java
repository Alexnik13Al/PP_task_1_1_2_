package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USER = "root";
    private static final String PASSWORD = "12345678";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Connection OK");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Connection error");
        }
        return connection;
    }
}
