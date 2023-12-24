/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import java.util.Scanner;

public class LandTract {
    public double length;
    public double width;
    
    public LandTract(int len, int wid){
        length = len;
        width = wid;
    }
    public double getTractArea (){
        return length * width;
    }
    
    public static void main(String[] args) {
        //Variables 
        int len;
        int wid;
        
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter dimensions of the first tract of land : ");
        System.out.println("Lenght : ");
        len = input.nextInt();
        System.out.println("Width : ");
        wid = input.nextInt();
        
        LandTract tract1 = new LandTract(len, wid);
        
        System.out.println("Area tract 1 : " + tract1.getTractArea());
        System.out.println("Enter dimensions of the second tract of land : ");
        System.out.println("Lenght : ");
        len = input.nextInt();
        System.out.println("Width : ");
        wid = input.nextInt();
        
        LandTract tract2 = new LandTract(len, wid);
        
        System.out.println("Area tract 2 : " + tract2.getTractArea());
        
        if (tract1.getTractArea() == tract2.getTractArea()){
            System.out.println("Same area for both tract.");
        }
        else if(tract1.getTractArea() != tract2.getTractArea()){
            System.out.println("Two different area of tract.");
        }
    }
}