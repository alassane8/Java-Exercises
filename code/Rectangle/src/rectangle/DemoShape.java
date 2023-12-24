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
public class DemoShape {
    

    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
        
        //Variable definition
        double r = 0; 
        
        //Doing the following will initizailed all variable in it 
        Circle circle1 = new Circle();
        
        //The following will set length and width
        circle1.setRadius(r);
        circle1.setInput();
        
        //The following will display area of room1 previusly defined
        System.out.println("Area is " + circle1.getArea());
        
        //The following will display perimeter of room1 previusly defined
        System.out.println("Perimeter is " + circle1.perimeter());
    }
}
