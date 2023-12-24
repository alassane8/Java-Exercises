/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll2;
import java.util.Scanner;
public class Payroll2{
	
	protected String employeeName;
	protected int employeeID;
	protected double hourlyPayRate;
	protected int numberOfHoursWorked;

	protected Payroll2(String en, int ei, double hpr, int nohw){
		employeeName = en;
		employeeID = ei;
		hourlyPayRate = hpr;
		numberOfHoursWorked = nohw;
	}

	protected String getName(){
		return employeeName;
	}

	protected int getID(){
		return employeeID;
	}

	protected double grossPay(){
		return numberOfHoursWorked * hourlyPayRate;
	}

	public static void main (String[] args){
		//Scanner definiton
		Scanner input = new Scanner(System.in);

		//Variables definitions :
		String en; 
		int ei; 
		double hpr; 
		int nohw;

		//Inputs : 
		System.out.println("Enter employee's name : ");
		en = input.next();

		System.out.println("Enter employee's ID   : ");
		ei = input.nextInt();

		System.out.println("Hourly Pay Rate : ");
		hpr = input.nextDouble();

		System.out.println("Numbers of Hours Worked : ");
		nohw = input.nextInt();

		//Creating on object
		Payroll2 emp = new Payroll2(en, ei, hpr, nohw);

		//Display informations :
		System.out.println("EMPLOYEE'S INFORMATIONS");
		System.out.println("Name      : " + emp.getName());
		System.out.println("ID        : " + emp.getID());
		System.out.println("Gross Pay : " + emp.grossPay());


	}
}