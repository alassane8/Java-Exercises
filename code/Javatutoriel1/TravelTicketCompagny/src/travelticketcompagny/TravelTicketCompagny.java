/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelticketcompagny;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class TravelTicketCompagny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //OOP Tutorial 1 Q5
        
        //Variable definition
        int ticketNumber;
        int remainder;
        boolean state;
        int lastDigit;
        
        System.out.println("Enter ticket number : ");
        ticketNumber = input.nextInt();
        
        remainder = ticketNumber / 10;
        lastDigit = ticketNumber % 10;
        
        remainder = remainder % 7;
        
        if (remainder == lastDigit){
            state = true;
            System.out.println(state);
        }
        else if (remainder != lastDigit){
            state = false;
            System.out.println(state);
        }
    }
}
