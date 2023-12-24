/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinrental;

import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class DemoCabinRental {
    
    public static void main(String[] args) {
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definiton
        int number;
        int rnum; 
        int wrr = 0;
        
        System.out.println("Cabin Number (1 to 6): ");
        number = input.nextInt();
        while(number > 6 || number <= 0){
            System.out.println("Error.");
            number = input.nextInt();
        }
        System.out.println("Room Number : ");
        rnum = input.nextInt();
        
        HolidayCabinRental rental = new HolidayCabinRental(number, wrr, rnum);
        
        System.out.println("Rental informations : ");
        System.out.println("Cabin Number : " + rental.getCabinNumber());
        System.out.println("Weekly Rental Rate : " + rental.getWeeklyRentalRate());
        System.out.println("Room Number : " + rental.getRoomNumber());
        System.out.println("Total Rent Cost : " + rental.getTotalRent());
    }
}
