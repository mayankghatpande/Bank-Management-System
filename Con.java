package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    // Declare Connection and Statement objects
    Connection connection;
    Statement statement;

    // Constructor to establish the connection
    public Con() {
        try {
            // Establish connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "root");
            // Create a statement object to execute SQL queries
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
