package main.java;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtil {
    private static boolean isDriverLoaded = false;
    private static Connection con = null;
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
            isDriverLoaded = true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final static String url = "jdbc:oracle:thin:@//localhost:1521/xe";
    private final static String user = "despensa";
    private final static String password = "12345";

    public static Connection getConnection() throws SQLException {
        if (isDriverLoaded && con == null) {
            try {
                con = DriverManager.getConnection(url, user, password);

                if (con != null) {
                    System.out.println("Connected to the database!");
                } else {
                    System.out.println("Failed to make connection!");
                }

            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return con;
    }

    public static void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
            System.out.println("connection closed");
        }
    }
}
