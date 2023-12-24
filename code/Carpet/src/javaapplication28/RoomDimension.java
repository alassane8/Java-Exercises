
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;
import java.util.Scanner;

/**
 *
 * @author wadea
 */

public class RoomDimension {
    
    public double length;
    public double width;
    
    public RoomDimension(double len, double wid){
        
        length = len;
        width = wid;
    }
    
    public double getArea(){
        
        return length * width;
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        double len;
        double wid;
        double price;
        
        System.out.println("Length of the room : ");
        len = input.nextDouble();
        System.out.println("Width of the room : ");
        wid = input.nextDouble();
        
        RoomDimension room1 = new RoomDimension(len, wid);
        System.out.println(room1.getArea());
        
        System.out.println("Carpet Price Per Square Foot : ");
        price = input.nextDouble();
        
        RoomCarpet carpet1 = new RoomCarpet(room1, price);
        System.out.println("Carpet Price : "+ carpet1.getTotalCost());
    }
}
