/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

import java.util.Scanner;

public class Insurance1 {
    
    public int customerID;
    public String policy;
    
    public Insurance1(int cID, String pol){
        customerID = cID;
        policy = pol;
    }
    public int healthInsurance(){
        
        Scanner input = new Scanner(System.in);
        
        int choice;
        int premium = 0;
        policy = "HEALTH";
        
        System.out.println("Are you a smoker ?");
        System.out.println("1. YES");
        System.out.println("2. NO");
        choice = input.nextInt();
        
        while (choice != 1 && choice != 2){
            System.out.println("Error.");
            choice = input.nextInt();
        }
        
        if (choice == 1){
            premium = 250;
        }
        else if (choice == 2){
            premium = 190;
        }
        return premium;
    }
    
    
    public int autoInsurance(){
        
        Scanner input = new Scanner(System.in);
        
        int tickets;
        int autoPremium = 0;
        policy = "AUTO";
        
        System.out.println("Enter the number of traffic tickets you have\n"
                + "received in the last three years : ");
        tickets = input.nextInt();
        
        while (tickets < 0){
            System.out.println("Error.");
            tickets = input.nextInt();
        }
        if (tickets >= 3){
            autoPremium = 175;
        }
        else if (tickets < 3 && tickets != 0){
            autoPremium = 140;
        }
        else if (tickets == 0){
            autoPremium = 95;
        }
        return autoPremium;
    }
}
