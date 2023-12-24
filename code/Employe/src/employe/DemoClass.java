/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employe;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class DemoClass {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definition
        String n;
        int Shift;
        double hpr;
        int num;
        String d;
        
        //Input of employee's informations
        System.out.println("Enter name : ");
        n = input.next();
        
        System.out.println("Enter employee number : ");
        num = input.nextInt();
        
        System.out.println("Enter date : ");
        d = input.next();
        
        System.out.println("Shift :"
                + "\n1. DAY"
                + "\n2. NIGHT");
        Shift = input.nextInt();
        
        System.out.println("Hourly pay rate : ");
        hpr = input.nextDouble();
        
        //Creating an employee
        ProductionWorker worker = new ProductionWorker(n, num, d, Shift, hpr);
        
        //Display employee's informations
        System.out.println("EMPLOYEE INFORMATIONS :");
        System.out.println("Name : " + worker.getName());
        System.out.println("Number : " + worker.getNumber());
        System.out.println("Hire Date : " + worker.getDate());
        System.out.println("Shift : " + worker.getShift());
        System.out.println("Hourly pay rate : " + worker.getHourlyPayRate());
    }
}
