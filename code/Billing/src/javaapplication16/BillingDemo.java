/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;

public class BillingDemo {
    
    public static void main(String[] args) {
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definitions
        double c;
        double pbp = 20;
        double q; 
        double cv = 8;
        
        //Options display
        System.out.print("\nWhat option do you chose :");
        System.out.print("\n1. One Photo Book");
        System.out.print("\n2. Multiple photo Book");
        System.out.print("\n3. Multiple photo Book and a coupon value\n");
        c = input.nextInt();
        
        //Differents cases
        if (c == 1){
            q = 1;
            cv = 0;
            Billing bill1 = new Billing(c, pbp, q, cv); 
            System.out.print("\nTotal price : "+ bill1.computeBills(c, pbp, q, cv));
        }
        else if (c == 2){
            System.out.print("\nHow many photo book : ");
            q = input.nextInt();
            cv = 0;
            Billing bill1 = new Billing(c, pbp, q, cv); 
            System.out.print("\nTotal price : "+ bill1.computeBills(c, pbp, q, cv));
        }
        else if (c == 3){
            System.out.print("\nHow many photo book ? ");
            q = input.nextInt();
            System.out.print("\nWhat is the coupon value ? ");
            cv = input.nextInt();
            Billing bill1 = new Billing(c, pbp, q, cv); 
            System.out.print("\nTotal price : "+ bill1.computeBills(c, pbp, q, cv));
        }
    }
    
}
