/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll;

import java.util.Scanner;
/**
 *
 * @author wadea
 */
public class Payroll {

    protected String name;
    protected int id;
    protected double hourlyPayRate;
    protected double hoursWorked; 
    protected double grossPay; 
    
    protected Payroll(String n, int ID, double hpr, double hw){
        name = n;
        id = ID;
        hourlyPayRate = hpr;
        hoursWorked = hw;
    } 
    protected double getGrossPay(){
        grossPay = hoursWorked * hourlyPayRate;
        return grossPay;
    }
    protected double getHourlyPayRate(){
        return hourlyPayRate;
    }
    protected double getHoursWorked(){
        return hoursWorked;
    }
    protected String getName(){
        return name;
    }
    protected int getID(){
        return id;
    }
}
