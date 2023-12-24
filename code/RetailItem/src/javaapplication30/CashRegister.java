/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication30;


/*
 * @author wadea
 */

public class CashRegister {
    
    private RetailItem objectItem;
    public int quantityOfItems;
    
    public CashRegister(RetailItem item, int qoi){
        
        objectItem = item;
        quantityOfItems = qoi;
    }
    
    public double getSubtotal(){
        
        return quantityOfItems * objectItem.getRetailPrice() ;
    }
    public double getTax(){
        
        return .06 * objectItem.getRetailPrice() * quantityOfItems;
    }
    public double getTotal(){
        
        return (quantityOfItems * objectItem.getRetailPrice()) + (.06 * objectItem.getRetailPrice() * quantityOfItems);
    }
}
