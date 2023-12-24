/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2.pkg1;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class Javatutorial2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definition
        int store1;
        int store2;
        int store3;
        int store4;
        int store5;
        
        System.out.println("Store 1 sales :");
        store1 = input.nextInt();
        System.out.println("Store 2 sales :");
        store2 = input.nextInt();
        System.out.println("Store 3 sales :");
        store3 = input.nextInt();
        System.out.println("Store 4 sales :");
        store4 = input.nextInt();
        System.out.println("Store 5 sales :");
        store5 = input.nextInt();
        
        
        System.out.print("\nSALES BAR CHART");
        System.out.print("\nStore 1 :");
        for (int i = 0; i < store1/100; i ++){
            System.out.print("*");
        }
        System.out.print("\nStore 2 :");
        for (int i = 0; i < store2/100; i ++){
            System.out.print("*");
        }
        System.out.print("\nStore 3 :");
        for (int i = 0; i < store3/100; i ++){
            System.out.print("*");
        }
        System.out.print("\nStore 4 :");
        for (int i = 0; i < store4/100; i ++){
            System.out.print("*");
        }
        System.out.print("\nStore 5 :");
        for (int i = 0; i < store5/100; i ++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
