/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productexception;
import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        
        //Scanner definition :
        Scanner input = new Scanner(System.in);
        
        //Variables definitions : 
        int pn;
        int pp;
        String info; 
        
        //User's input : 
        System.out.println("Enter product number :");
        pn = input.nextInt();
        if (pn > 999){
            ProductException ex = new ProductException("Only 3 digit number.");
            throw ex;
        }
        else {
            System.out.println("Enter product price :");
            pp = input.nextInt();
            
            if(pp > 1000 || pp < .01){
                ProductException ex = new ProductException("Only 3 digit number.");
                throw ex;
            }
            else {
                System.out.println("Product Number : " + pn);
            }
        }
    }
}
