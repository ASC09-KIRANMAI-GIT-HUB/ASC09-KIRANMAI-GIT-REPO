package com.demo.jdbc;

import java.sql.*;

public class JDBCSelectStatement {
    public static void main(String[] args) {
// The Connection interface provides methods for connecting to a database, creating statements, and managing transactions.
// The DriverManager class manages a list of database drivers and establishes connections to databases.
// The Statement interface is used to execute SQL statements against a database.
        Connection connection = null;
        try {
            // Load SQL Server JDBC driver
            // The class Class is used to load the JDBC driver class dynamically.
            // We dynmacally load the driver because it allows us to use the driver without hardcoding it in the code.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            // Use Windows Authentication
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;integratedSecurity=true;";
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;user=sa;password=sqlserver;";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyFriendDB;user=sa;password=sqlserver;trustServerCertificate=true;";


            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!");

            Statement statement = connection.createStatement();
            System.out.println("Statement created");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Friend ORDER BY sr_num");
            System.out.println("Result set returned");

            while(resultSet.next()) {

                int sr_num = resultSet.getInt("sr_num");
                System.out.println("SRN: " + sr_num);

                String first_name = resultSet.getString("first_name");
                System.out.println("First name: " + first_name);

                String last_name = resultSet.getString("last_name");
                System.out.println("Last name: " + last_name);

            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    
    }
}