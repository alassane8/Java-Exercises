/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication30;
import java.util.Scanner;

/*
 * @author wadea
 */

public class RetailItem {
    
    public String description;
    public double retailPrice;
    public int unitsInInventory;
    
    public RetailItem(String descp, double rp, int uii){
        
        description = descp;
        retailPrice = rp;
        unitsInInventory = uii;
    }
    public String getDescription(){
        return description;
    }
    public double getRetailPrice (){
        return retailPrice;
    }
    public int getUnitsInventory(){
        return unitsInInventory;
    }
    public boolean equals(String descp){
        boolean state; 
        
        if(description.equals(descp)){
            state = true;
        }
        else{
            state = false;
        }
        return state;
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables
        int qoi;
        String descp;
            System.out.println("Units description : ");
            descp = input.nextLine();
            
            //Creating objects
            RetailItem item1 = new RetailItem("Jacket", 59.95, 12);
            RetailItem item2 = new RetailItem("Designer Jeans", 34.95, 40);
            RetailItem item3 = new RetailItem("Shirt", 24.95, 20);
        
            if (item1.equals(descp)){
                System.out.println("How many item did you purchased ?");
                qoi = input.nextInt();
                CashRegister retail1 = new CashRegister(item1, qoi);
        
                //Results's Display
                System.out.println("Units description : " + descp);
                System.out.println("Units on Hand : " + item1.getUnitsInventory());
                System.out.println("Price : " + retail1.getSubtotal());
                System.out.println("Taxes : " + retail1.getTax());
                System.out.println("Total : " + retail1.getTotal());
            }
        
            else if (item2.equals(descp)){
                System.out.println("How many item did you purchased ?");
                qoi = input.nextInt();
                CashRegister retail1 = new CashRegister(item2, qoi);
        
                ///Results's Display
                System.out.println("Units description : " + descp);
                System.out.println("Units on Hand : " + item2.getUnitsInventory());
                System.out.println("Price : " + retail1.getSubtotal());
                System.out.println("Taxes : " + retail1.getTax());
                System.out.println("Total : " + retail1.getTotal());
            }
        
            else if (item3.equals(descp)){
                System.out.println("How many item did you purchased ?");
                qoi = input.nextInt();
                CashRegister retail1 = new CashRegister(item3, qoi);
        
                //Results's Display
                System.out.println("Units description : " + descp);
                System.out.println("Units on Hand : " + item3.getUnitsInventory());
                System.out.println("Price : " + retail1.getSubtotal());
                System.out.println("Taxes : " + retail1.getTax());
                System.out.println("Total : " + retail1.getTotal());
            
        }  
    } 
}
