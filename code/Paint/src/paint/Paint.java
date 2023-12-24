/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paint;

import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class Paint {

    /**
     * @param args the command line arguments
     */
    
    public double length;
    public double width;
    public double height;
    
    public Paint(double len, double wid, double hgt){
        length = len;
        width = wid;
        height = hgt;
    }
    
    public double getArea(){
        return length * height * 2;
    }
    public double getArea2(){
        return width * height * 2;
    }
    public double getNumbersOfGallons(){
        return (length * height * 2)/350 ;
    }
    
    public double getNumbersOfGallons2(){
        return (width * height * 2)/350;
    }
    
    public double getPrice(){
        return ((width + length) * (height * 2) / 350) * 32 ;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables definition
        double len;
        double wid;
        double hgt;
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter length");
        len = input.nextDouble();
        
        System.out.println("Enter width");
        wid = input.nextDouble();
        
        System.out.println("Enter height");
        hgt = input.nextDouble();
        
        Paint room = new Paint(len,wid,hgt);
       
        System.out.println("Area of the room : " + (room.getArea() + room.getArea2()) );
        System.out.println("Number of gallons needed : " + (room.getNumbersOfGallons() + room.getNumbersOfGallons2()));
        System.out.println("Total Price : " + room.getPrice());
    }
}
