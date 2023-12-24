/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

import java.util.Scanner;
//Class and Methods will always be public but variable private
/**
 *
 * @author wadea
 */
public class Rectangle {
    private double length;
    private double width;
    Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public void setLengthWidth(double l, double w){
        
        length = l;
        width = w;
    }
    
    public double getArea(){
        
        //Return area
        return length*width;
    }
    
    public double perimeter(){
        
        //Return perimeter
        return (length + width)* 2;
    }
    
    public void input(double len, double wid){
        
        //Input of length and width
        System.out.print("Enter length : ");
        len = input.nextDouble();
        System.out.print("Enter width : ");
        wid = input.nextDouble();
    }
    
    public static void main(String[] args){
        
        //Variable definition
        double len = 0;
        double wid = 0;
        
        //Doing the following will initizailed all variable in it 
        Rectangle room1 = new Rectangle();
        
        //Get values
        room1.input(len, wid);
        
        //The following will set length and width
        room1.setLengthWidth(len,wid);
        
        //The following will display area of room1 previusly defined
        System.out.println("Area is " + room1.getArea());
        
        //The following will display perimeter of room1 previusly defined
        System.out.println("Perimeter is " + room1.perimeter());
    }
    
}
