package com.demo.jdbc;

import java.sql.*;

public class JDBCDeleteStatement {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            // Connect to database
            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyFriendDB;user=sa;password=sqlserver;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!");

            // SQL DELETE query
            String deleteQuery = "DELETE FROM Friend WHERE sr_num > 100";

            // Prepare and execute
            preparedStatement = connection.prepareStatement(deleteQuery);
            int rowsDeleted = preparedStatement.executeUpdate();

            System.out.println(rowsDeleted + " row(s) deleted.");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
