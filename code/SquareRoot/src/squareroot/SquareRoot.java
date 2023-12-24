/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squareroot;
import java.util.Scanner;


public class SquareRoot {

    public static void main(String[] args) {
        // Scanner definition : 
        Scanner input = new Scanner(System.in);
        
        //Variables definiton : 
        int number; 
        
        //Input number by the user : 
        System.out.println("Enter number to be rooted : ");
        number = input.nextInt();
        
        try {
            System.out.println(Math.sqrt(number));
        }
        catch (ArithmeticException mistake){
            System.out.println("Negative numbers can't be rooted.");
        }
    }
    
}
