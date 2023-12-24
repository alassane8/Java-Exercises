/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatutorial2;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class Javatutorial2 {

    /**
     * @param args the command line arguments
     * 1, 2, 3, 4, 5, 6, 7, 8, 9
     * Redo tuto 2
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //OOP Tutorial 2 Q1
        //Variable definiton
        int salary;
        double taxe1 = 0;
        double taxe2 = 0;
        double total = 0;
        
        //Salary input
        System.out.println("What is your salary :");
        salary = input.nextInt();
        
        //Calculus of the taxes
        if (salary <= 10000){
            taxe1 = 0;
            taxe2 = 0;
        }
        if (salary > 10000 && salary <= 50000){
            taxe1 = (salary - 10000) * 0.2;
            taxe2 = 0;
        }
        if (salary > 50000){
            taxe2 = (salary - 50000) * 0.5;
            taxe1 = 40000 * 0.2;
        }
        total = taxe1 + taxe2;
        
        //Dispaly all results
        System.out.println("Salary: " + salary);
        System.out.println("Taxe 1: " + taxe1);
        System.out.println("Taxe 2: " + taxe2);
        System.out.println("Total : " + total);
        
        //OOP Tutorial 2 Q2
        
        //Variable definiton
        int a = 0;
        int returne = 0;
        
        for (int i = 0; i < 3; i ++){
            System.out.println("Enter number "+ (i + 1) +" : ");
            a = input.nextInt();
            if (a > returne){
                returne = a;
            }
        }
        System.out.println("Maximum among the inputs : " + returne);
        
        //OOP Tutorial 2 Q3
        
        //Variable definiton
        int b;
        int c;
        int choice;
        double totalll;
        
        System.out.println("Enter number 1 :");
        b = input.nextInt();
        System.out.println("Enter number 2 :");
        c = input.nextInt();
        
        
        System.out.println("\n1. Add two numbers"
                + "\n2. Substract two numbers"
                + "\n3. Multiply two numbers"
                + "\n4. Divide two numbers");
        choice = input.nextInt();
        
        switch(choice){
            
            case 1: 
                totalll = b + c;
                System.out.println("Result : "+ totalll);
            case 2:
                totalll = b - c;
                System.out.println("Result : "+ totalll);
            case 3:
                totalll = b * c;
                System.out.println("Result : "+ totalll);
            case 4:
                if (c == 0){
                     System.out.println("Calcul impossible.");
                }
                else if (c != 0) {   
                    totalll = b / c;
                    System.out.println("Result : "+ totalll);
                }
        }
        
        //OOP Tutorial 2 Q4
        
        //Variable definiton
        int positiveNumber;
        int ref = 0;
        
        //Input of a positive number by the user
        System.out.println("Enter a positive number : ");
        positiveNumber = input.nextInt();
        
        while (positiveNumber <= 0){   
            System.out.println("Error.");
            positiveNumber = input.nextInt();
        }
        if (positiveNumber > 0){
            ref = positiveNumber / 2;
            if (ref * 2 == positiveNumber){
                System.out.println(positiveNumber + " is an even number.");
            }
            else if (ref * 2 != positiveNumber){
                System.out.println(positiveNumber + " is an odd number.");
            }
        }
        
        
        //OOP Tutorial 2 Q5
        
        //Variable definition
        double monthlyBill = 0.0;
        int numberOfHours;
        int letter;
        
        //Input of the letter by the user
        System.out.println("\nEnter the number of your choosen package :");
        System.out.println("\n1. Package A:  For $9.95 per month 10 hours"
                + "\nof access are provided."
                + "\nAdditional hours are $2.00 per hour"
                + "\n\n2. Package B: For $13.95 per month"
                + "\n20 hours of access are provided."
                + "\nAdditional hours are $1.00 per hour. "
                + "\n\n3. Package C: For $19.95 per month unlimited"
                + "\naccess is provided. ");
        letter = input.nextInt();
        
        //Errors
        while(letter != 1 && letter != 2 && letter != 3){
            System.out.println("Error.");
            letter = input.nextInt();
        }
        
        System.out.println("Number of hours that were used :");
        numberOfHours = input.nextInt();
        
        if (letter == 1){
            if (numberOfHours > 10){
                monthlyBill = 9.95 + ((numberOfHours - 10) * 2.00);
            }
            else if (numberOfHours <= 10) {
                monthlyBill = 9.95;
            }
        }
        
        if (letter == 2){
            if (numberOfHours > 20){
                monthlyBill = 13.95 + (numberOfHours - 20); 
            }
            else if (numberOfHours <= 20){
                monthlyBill = 13.95;
            }
        }
        
        if (letter == 3){
            monthlyBill = 19.95;    
        }
        
        System.out.println("Total charges for Package" + letter + " :" + monthlyBill);
                
        
        //OOP Tutorial 2 Q6
        
        //Variable definition
        int number = 0;
        int reef;
        
        for(int i = 0; i < 300; i ++){
            reef = i / 3;
            if (reef * 3 == i){
                System.out.println(i);
                number ++;
            }
        }
        System.out.println("Number divided by three with no reminder"
                + "\nbetween 1 and 300 : \n" + number);
        
        
        //OOP Tutorial 2 Q7
        
        //Variable definition
        int numbersToBeAveraged;
        int numbeer;
        int totaal = 0;
        
        System.out.println("Numbers to be averaged :");
        numbersToBeAveraged = input.nextInt();
        
        for (int i = 0; i < numbersToBeAveraged; i ++){
            System.out.println("Enter number " + (i + 1) +" : ");
            number = input.nextInt();
            totaal = totaal + number;
        }
        System.out.println("Average of the numbers : " + (totaal / numbersToBeAveraged));
        
        //OOP Tutorial 2 Q8
        
        //Variable definition
        int e;
        int f;
        int result = 1;
        
        System.out.println("Enter the first number : ");
        e = input.nextInt();
        System.out.println("Enter the second number : ");
        f = input.nextInt();
        
        for (int i = 0; i < f; i ++){
            result = result * e;
        }
        
        System.out.println("Results of e^f : " + result);
        
        //OOP Tutorial 2 Q9
        
        //Variable definition
        int numbr;
        int min = 0;
        int max = 0;
        
        do {
            System.out.println("Enter number (to stop the input, enter '-99') :");
            numbr = input.nextInt();
            if (numbr == -99){
                break;
            }
            if (numbr < min){
                min = numbr;
            }
            if(numbr > max){
                max = numbr;
            }
        }
        while(numbr != -99);
        
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        
        //OOP Tutorial 2 Q10
        
        //Variable definition
        int days_work = 0;
        int calculus = 10;
        int totall = 0;
        int end = 0;
        int r;
        
        //Input days of work by the user
        System.out.print("Enter of number of days of work : ");
        days_work = input.nextInt();
        
        while(days_work < 1){
            System.out.print("Do not accept a number less than "
                    + "1 for the number of days worked : ");
            days_work = input.nextInt();
        }
        if (days_work >= 1){
            for(r = 0; r < days_work; r ++){
                calculus = (calculus * 2);
                end += 10 + calculus;
                calculus += 10;
            }
            System.out.print("Total amount : " + end );
        }
    }  
}