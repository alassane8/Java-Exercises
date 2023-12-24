/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatutoriel1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author wadea
 */
public class Javatutoriel1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        
        
        ////////////////////////////////////////////////////////////////////////
        //OOP Tutorial 1 Q1
        
        //Variable definition
        double a;
        double b;
        double c; 
        double sum = 0;
        double average = 0;
        
        //Input of the first number by the user
        System.out.print("Enter the first number : ");
        a = input.nextDouble();
        
        //Input of the second number by the user
        System.out.print("Enter second number    : ");
        b = input.nextDouble();
        
        //Input of the third number by the user
        System.out.print("Enter third number     : ");
        c = input.nextDouble();
        
        //Calculus
        sum = a + b + c;
        average = sum / 3;
        
        //Display of the sum and the average of the three numbers
        System.out.print("\nSum     : " + sum);
        System.out.print("\nAverage : " + average);
        
        ////////////////////////////////////////////////////////////////////////
        
        //OOP Tutorial 1 Q2
        
        //Variable definition
        int charge;
        double tax;
        double tip;
        double total;
        
        //Inpt the charge of the meal by user
        System.out.print("\n\nHow much was the charges for this meal ?");
        charge = input.nextInt();
        
        //Calculus 
        tax = charge * 0.0675;
        tip = (charge + tax )* 0.20;
        total = tax + tip + charge;
        
        //Display all charges
        System.out.print("\nMeal charge : " + charge);
        System.out.print("\nTax         : " + tax);
        System.out.print("\nTip         : " + tip);
        System.out.print("\nTotal       : " + total);
        
        
       /////////////////////////////////////////////////////////////////////////
       
        //OOP Tutorial 1 Q3
        
        //Variable definition
        int number; 
        int vingt;
        int dix;
        int cinq;
        int un;
        
        //Input of a number
        System.out.print("\nEnter number for currency conversion : ");
        number = input.nextInt();
        
        //Calculus 
        vingt = number / 20;
        dix = (number - (vingt * 20)) / 10;
        cinq = (number - (vingt * 20) - (dix * 10)) / 5;
        un = (number - (vingt * 20) - (dix * 10) - (cinq * 5)) / 1;
        
        //Display of the currency
        System.out.print("\n20s : " + vingt);
        System.out.print("\n10s : " + dix);
        System.out.print("\n5s  : " + cinq);
        System.out.print("\n1s  : " + un);
        
        
        ////////////////////////////////////////////////////////////////////////
        
        //OOP Tutorial 1 Q4
        
        //Variable definition
        int dozen = 0;
        double Total = 0;
        int number_eggs;
        int loose_egg = 0;
        double dozen_eggs = 3.25;
        double individual_egg = 0.45;
        
        //Input number of eggs by user
        System.out.print("\nHow many eggs do you want to buy ?");
        number_eggs = input.nextInt();
        
        //Calculus
        dozen = number_eggs / 12;
        loose_egg = (number_eggs - (dozen*12));
        Total = (dozen * dozen_eggs) + (loose_egg * individual_egg);
        
        //Display the user's order
        System.out.print("You ordered " + number_eggs + " egggs."
                + "\nThat's " + dozen +" dozen at " + dozen_eggs + " per dozen\n"
                        + "and " + loose_egg + " loose eggs at $"
                                + individual_egg + " each for a total of $"
                                        + Total +".");
        
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////////////////////////////////
    }
}
