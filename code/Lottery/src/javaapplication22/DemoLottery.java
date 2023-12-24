/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;
import java.util.Scanner;

public class DemoLottery {
    
    public static void main(String[] args) {
        
        //Variables
        int [] lotNum = new int [5];
        int [] lotRand = new int [5];
        
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        for (int i = 0; i < 5; i++){
            System.out.println("Enter your number "+ (i + 1) +" out of 5 :");
            lotNum [i] = input.nextInt();
        }
        
        Lottery lot1 = new Lottery(lotNum, lotRand);
        
        if (lot1.compare() == 0){
            System.out.println("You loose the lottery !");
        }
        else if (lot1.compare() == 1){
            System.out.println("You win the lottery !");
        }  
        
        
        System.out.println("Lottery Player : ");
        for (int j = 0; j < 5; j ++){
            System.out.print(lotNum [j]);
        }
        
        System.out.println("\nLottery Random : ");
        for (int k = 0; k < 5; k ++){
            System.out.print(lotRand [k]);
        }
        System.out.println();
    }
}
