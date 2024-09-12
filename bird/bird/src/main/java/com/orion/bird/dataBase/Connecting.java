package com.orion.bird.dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecting {

    public static Connection conecter() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/", "root", "");
            return connection;

        } catch (SQLException e) {
            System.out.println("Error in conecter = " + e.getMessage());
        }
        return null;
    }
}
