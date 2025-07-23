package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDel {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            Connection connection = null;

            // Use Windows Authentication
            // String url =
            // "jdbc:sqlserver://localhost:1433;databaseName=TestDB;integratedSecurity=true;";
            // String url =
            // "jdbc:sqlserver://localhost:1433;databaseName=TestDB;user=sa;password=sqlserver;";
            // jdbc is the protocol used to connect to the database
            // sqlserver is the subprotocol used for SQL Server
            // localhost is the server name
            // 1433 is the default port for SQL Server
            // TestDB is the name of the database
            // user is the username to connect to the database
            // password is the password for the user
            // trustServerCertificate=true is used to bypass SSL certificate validation
            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyFriendDB;user=sa;password=sqlserver;trustServerCertificate=true;";

            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
}
