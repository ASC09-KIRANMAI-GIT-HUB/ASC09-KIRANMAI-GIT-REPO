package com.demo.jdbc;

import java.sql.*;


public class JDBCWork {
     
    public static void main(String[] args) {

        /*

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your SRN: ");
        int srn = sc.nextInt();

        System.out.println("Enter first name: ");
        String f_name = sc.nextLine();

        System.out.println("Enter last name: ");
        String l_name = sc.nextLine();

        */

        Connection connection = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyFriendDB;user=sa;password=sqlserver;trustServerCertificate=true;";

            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!");

            Statement statement = connection.createStatement();
            System.out.println("Statement created");

            String insertQuery = "INSERT INTO Friend (sr_num, first_name, last_name) VALUES (67, 'parvati', 'bagewadi')";
            int rowsInserted = statement.executeUpdate(insertQuery);
            System.out.println(rowsInserted + "row(s) inserted.");

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()){
                    connection.close();
                    System.out.println("Connection is closed.");
                }
            } catch (SQLException exception2) {
                exception2.printStackTrace();    
            }
        }
        
    }
 
}
