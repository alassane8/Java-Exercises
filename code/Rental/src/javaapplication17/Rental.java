/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;

/*
 * @author wadea
 */
public class Rental {
    
    public int numberMinuteInHour = 60;
    public int hourlyRentalRate = 40;
    private int contractNumber;
    private int numberOfHourRental;
    private double numberOfMinuteOverHour;
    private double price;
    
 
    public Rental(int cn, int nomih){
        contractNumber = cn;
        numberMinuteInHour = nomih;
    }
    public Rental (){
        contractNumber = 000;
        numberOfMinuteOverHour = 100;
    }
    
    public double calculate (int hours_of_rent){
        if (hours_of_rent < 60){
            numberMinuteInHour = hours_of_rent;
            numberOfMinuteOverHour = 0;
            price = (numberMinuteInHour + numberOfMinuteOverHour) * hourlyRentalRate / 60;
        }
        else if (hours_of_rent >= 60){
            numberOfHourRental = hours_of_rent / 60;
            numberOfMinuteOverHour = hours_of_rent - (numberOfHourRental * 60);
            price = (numberOfHourRental + (numberOfMinuteOverHour / 60))  * hourlyRentalRate;
        }
        return price;
    }
    public static void main(String[] args){
        
        //Variables 
        int cn;
        int nomih = 0;
        double nomoh = 0;
        int hours_of_rent; 
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter contract number : ");
        cn = input.nextInt();
        
        System.out.println("Enter number of minutes of the rent : ");
        hours_of_rent = input.nextInt();
        
        Rental rent1 = new Rental(cn, nomih);
        Rental rent2 = new Rental();
        
        //Display of both objetcs
        System.out.println("Contract number : " + cn);
        System.out.println("\nNumbers of hours : "+ hours_of_rent / 60);
        System.out.println("Numbers of minutes over an hour : "+ (hours_of_rent - ((hours_of_rent / 60) * 60)));
        System.out.println("Total price : " + rent1.calculate(hours_of_rent));
        
        hours_of_rent = 100;
        
        System.out.println("\nNumbers of hours : "+ hours_of_rent / 60);
        System.out.println("Numbers of minutes over an hour : " + (hours_of_rent - ((hours_of_rent / 60) * 60)));
        System.out.println("Total price : " + rent2.calculate(hours_of_rent));
        
        
    }
    
}
