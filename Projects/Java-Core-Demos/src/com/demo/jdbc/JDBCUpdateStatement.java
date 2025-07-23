package com.demo.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCUpdateStatement {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyFriendDB;user=sa;password=sqlserver;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!");

            // Update statement
            String updateQuery = "UPDATE Friend SET last_name = 'error' WHERE sr_num >= 7";
            preparedStatement = connection.prepareStatement(updateQuery);

            // Execute update
            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        } finally {
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed!");
                }
                scanner.close();
            } catch (SQLException exception2) {
                exception2.printStackTrace();
            }
        }
    }
}
