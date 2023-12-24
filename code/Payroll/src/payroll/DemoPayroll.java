/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;
import java.util.Scanner;

public class DemoPayroll {
    
     public static void main(String[] args) {
         
        //Scanner definiton :
        Scanner input = new Scanner(System.in);
        
        //Variables definitions :
        String n;
        int ID;
        double hpr;
        double hw;
        double gp;
        
        //User's informations input : 
        System.out.print("Employee's name : ");
        n = input.next();
        System.out.print("Employee's ID   : ");
        ID = input.nextInt();
        System.out.print("Hourly Pay Rate : ");
        hpr = input.nextDouble();
        System.out.print("Hours Worked    : ");
        hw = input.nextDouble();
        
        //Creating an object : 
        Payroll Employee = new Payroll(n, ID, hpr, hw);
        
        //Display informations : 
        System.out.println("\n\nEMPLOYEE'S INFORMARTIONDS");
        System.out.println("NAME            : " + Employee.getName());
        System.out.println("ID              : " + Employee.getID());
        System.out.println("HOURLY PAY RATE : " + Employee.getHourlyPayRate()+"$/hour");
        System.out.println("HOURS WORKED    : " + Employee.getHoursWorked());
        System.out.println("GROSS PAY       : " + Employee.getGrossPay()+ "$");
    }
}
