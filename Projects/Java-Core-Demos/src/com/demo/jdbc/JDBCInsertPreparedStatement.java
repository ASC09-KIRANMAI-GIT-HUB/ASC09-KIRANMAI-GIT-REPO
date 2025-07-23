package com.demo.jdbc;

import java.sql.*;
import java.util.Scanner;


public class JDBCInsertPreparedStatement {
    public static void main(String[] args){
        Connection connection = null;

        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyFriendDB;user=sa;password=sqlserver;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!");

            String insertQuery = "INSERT INTO Friend (sr_num, first_name, last_name) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(insertQuery);

            System.out.println("Enter your SRN: ");
            int sr_num = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your first name: ");
            String first_name = scanner.nextLine();
        
            System.out.println("Enter your last name: ");
            String last_name = scanner.nextLine();
            
            preparedStatement.setInt(1,sr_num);
            preparedStatement.setString(2,first_name);
            preparedStatement.setString(3, last_name);
            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println(rowsInserted + "row(s) inserted.");

            for (int i = 1; i <= 100; i++){
                int newSr_num = sr_num + i;
                String newFirst_name = "student" + newSr_num;
                String newLast_name = newSr_num + "asci";

                preparedStatement.setInt(1,newSr_num);
                preparedStatement.setString(2,newFirst_name);
                preparedStatement.setString(3, newLast_name);

                preparedStatement.executeUpdate();
            }

            System.out.println("100 additional rows inserted with auto-generation");


        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        } finally {
            try{
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed!");
                }
                scanner.close();
            } catch (SQLException exception2){
                exception2.printStackTrace();
            }
        }
    }
    
}
