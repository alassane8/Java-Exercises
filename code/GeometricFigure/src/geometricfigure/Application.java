/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricfigure;

import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class Application {
    
    public static void main(String[] args) {
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definitons :
        double h;
        double w;
        String ft;
        
        System.out.println("Enter the following object of your choice :"
                + "\nSquare."
                + "\nTriangle.");
        ft = input.next();
        System.out.println("Enter width :");
        w = input.nextDouble();
        
        System.out.println("Enter heigth :");
        h = input.nextDouble();
        
        if (ft.equals("Square")){
            Square square1 = new Square(h, w, ft);
            System.out.println("Heigth              : " + square1.getWidth());
            System.out.println("Width               : " + square1.getHeigth());
            System.out.println("AArea of the square : " + square1.getArea());
        }
        else if (ft.equals("Triangle")){
            Triangle triangle1 = new Triangle(h, w, ft);
            System.out.println("Heigth               : " + triangle1.getWidth());
            System.out.println("Width                : " + triangle1.getHeigth());
            System.out.println("Area of the triangle : " + triangle1.getArea());
        }
    }
}
