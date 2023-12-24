/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author wadea
 */
public class StockCompare {
    
    public String symbol;
    public double sharePrice;
    
    public StockCompare(String sym, double sp){
        symbol = sym;
        sharePrice = sp;
    }
    public boolean equals(StockCompare object2) { 
        boolean status; 
        if (symbol.equals(object2.symbol) && sharePrice == object2.sharePrice) {
            status = true; 
        }
        else {
            status = false; 
        }
        return status; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StockCompare company1 = new StockCompare ("XYZ", 9.62);
        StockCompare company2 = new StockCompare ("XYZ", 9.62);
        
        if (company1.equals(company2)){
            System.out.println("Both objects are the same.");
        }
        else{
            System.out.println("The objects are different.");
        }
    }
    
}
