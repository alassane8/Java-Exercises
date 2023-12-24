/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author wadea
 */
public class RoomCarpet{
    
    private RoomDimension size;
    private double carpetPricePerSquareFoot;
    
    public RoomCarpet(RoomDimension S, double price){
        
        size = S;
        carpetPricePerSquareFoot = price;
    }
    
    public double getTotalCost(){
        
        return carpetPricePerSquareFoot * size.getArea();
    }
}
