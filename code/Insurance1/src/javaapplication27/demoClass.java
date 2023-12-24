/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;
import java.util.Scanner;

public class demoClass {

    public static void main(String[] args) {
        // Scanner definition :
        Scanner input = new Scanner(System.in);
        
        //Variables definitions : 
        int a;
        int cID;
        String pol = " ";
        
        //Choice of how many ppl to display by the user :
        System.out.println("How many user do you want to display ? ");
        a = input.nextInt();
        
        
        for(int i = 0; i < a; i ++){
            System.out.println("Customer " + (i + 1) + " Identification number : ");
            cID = input.nextInt();
            Insurance1 n1 = new Insurance1(cID, pol);
            System.out.println("Premium Total : "+ (n1.autoInsurance()+ n1.healthInsurance()));
            System.out.println("Customer "+ (i + 1) +" Identification number : " + cID );
        }
    }
    
}
