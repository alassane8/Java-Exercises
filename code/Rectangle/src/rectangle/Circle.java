/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class Circle {
    private double radius;
    Scanner input = new Scanner(System.in);
    
    public void setRadius(double r){
        radius = r;
    }
    public void setInput(){
        
        System.out.print("\nEnter radius for the circle : ");
        radius = input.nextDouble();
    }
    public double getArea(){
        
        //Return area
        return 3.14 * radius * radius;
    }
    
    public double perimeter(){
        
        //Return perimeter
        return 2 * radius * 3.14;
    } 
}
