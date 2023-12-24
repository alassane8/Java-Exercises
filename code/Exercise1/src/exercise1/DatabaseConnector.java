/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnector {
    
    private Connection connection;
    
    public DatabaseConnector(String dbURL, String dbUser, String dbPassword){
        
        try {
            connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            System.out.println("Connected database successfully.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
      public synchronized List<EmployeeInfo> getEmployees() throws Exception{
        
        // We try a connection with the database
        try (Statement statement = connection.createStatement()){
            
            // creation of a variable for the sql query
            ResultSet result = statement.executeQuery("select eid, ename, sal from emp");
            System.out.println("test1");
            // creation of a list to return
            List<EmployeeInfo> list = new ArrayList<>();
            
            // while another result is possible
            while (result.next()){
                list.add(new EmployeeInfo(result.get,result.getString(1),result.getFloat(2)));
                }
            }
            
        return list;
        }
    }
    
    public void close(){
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection to the database is closed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to close the database connection.");
        }
    }
}
