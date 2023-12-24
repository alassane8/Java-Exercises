/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discountpolicy;
import java.util.Scanner;

public class DemoDiscount {
    
    public static void main(String[] args) {
        
        // Scanner définition : 
        Scanner input = new Scanner(System.in);
        
        //Variables definition :
        
        DiscountPolicy bulk = new BulkDiscount(10, 20.0);
        System.out.println("Demonstrating bulk discount calculations "); 
        System.out.println("20% off on more than 10 items "); 
        System.out.println("\n10 items at 5.0; discount is " + bulk.computeDiscount(10, 5.0));
        System.out.println("11 items at 5.0; discount is " + bulk.computeDiscount(11, 5.0));
        System.out.println("20 items at 3.0; discount is " + bulk.computeDiscount(20, 3.0));
    }
}
