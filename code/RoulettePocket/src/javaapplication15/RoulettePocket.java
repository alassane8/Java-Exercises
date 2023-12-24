/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class RoulettePocket {
    
    public int pocket_number;
    
    public RoulettePocket(int pn){
        
        pocket_number = pn;
    }
    
    public String getPocketColor(int pn, String pocket_color){
        
        if (pocket_number == 0){
            
        }
        else if (pocket_number >= 1 && pocket_number <= 10){
            if ((pocket_number / 2)* 2 == pocket_number){
                //EVEN Black
                pocket_color = "Black";
            }
            else if ((pocket_number/2) * 2 != pocket_number){
                //ODD RED
                pocket_color = "Red";
            }
        }
        else if (pocket_number >= 11 && pocket_number <= 18){
            if ((pocket_number / 2)* 2 == pocket_number){
                //EVEN Red
                pocket_color = "Red";
            }
            else if ((pocket_number / 2) * 2 != pocket_number){
                //ODD Black
                pocket_color = "Black";
            }
        }
        else if (pocket_number >= 19 && pocket_number <= 28){
            if ((pocket_number / 2)* 2 == pocket_number){
                //EVEN Black
                pocket_color = "Black";
            }
            else if ((pocket_number / 2) * 2 != pocket_number){
                //ODD Red
                pocket_color = "Red";
            }
        }
        else if (pocket_number >= 29 && pocket_number <= 36){
            if ((pocket_number / 2)* 2 == pocket_number){
                //EVEN Red 
                pocket_color = "Red";
            }
            else if ((pocket_number / 2) * 2 != pocket_number){
                //ODD Black
                pocket_color = "Black";
            }
        }
        return pocket_color;
    }
    
    public static void main(String[] args) {
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        // Variable
        int pn;
        String pocket_color = "NULL";
        
        
        //Ask the user to enter a pocket number between 0-36
        System.out.print("Enter a pocket number (0-36) : ");
        pn = input.nextInt();
        
        RoulettePocket pocket1 = new RoulettePocket(pn);
        
        //Errors
        while (pn < 0 || pn > 36){
            System.out.print("Erreur.");
            pn = input.nextInt();
        }
        //No input errors
        if (pn >= 0 && pn <= 36){
            
            //getPocketColor
            pocket1.getPocketColor(pn, pocket_color);
        
            //Display the pocket color
            System.out.print("The pocket color is "
                    + pocket1.getPocketColor(pn, pocket_color)+".");
        } 
    }
}
