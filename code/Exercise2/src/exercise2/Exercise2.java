/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    
    private Connection connection;
    
    public Exercise2 (String url, String login, String password){
        
         try {
            connection = DriverManager.getConnection(url, login, password);
            System.out.println("Connected database successfully.");
        } 
        catch (SQLException ConnectionFailed) {
            System.out.println("Exception : " + ConnectionFailed.getMessage());
        }
    }
    
  
     public void close(){
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection to the database is closed.");
            }
        } catch (SQLException ConnectionFailed) {
            System.out.println("Exception : " + ConnectionFailed.getMessage());
        }
    }
    
    public static void main(String[] args) throws Exception {
       
         //Variable definition
        String url = "jdbc:mysql://localhost:3306/lab_2?useTimezone=true&serverTimezone=UTC ";
        String login = "root";
        String password = "";
    
        // Create a DatabaseConnector instance and establish a connection
        Exercise2 connect = new Exercise2(url, login, password);
    
        // Close the database connection when done
        connect.close();
        connect.getEmployees();
    }
}