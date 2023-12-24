/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author professeur
 */
public class DemoClass {
    
     public static void main(String[] args) throws Exception {
    
        //Variable definition
        String dbURL = "jdbc:mysql://localhost:3306/lab_2?useTimezone=true&serverTimezone=UTC ";
        String dbUser = "root";
        String dbPassword = "";
    
        // Create a DatabaseConnector instance and establish a connection
        DatabaseConnector connector = new DatabaseConnector(dbURL, dbUser, dbPassword);
    
        // get employees list
        connector.getEmployees();
        
        // close connection to database
        connector.close();
    }
}
