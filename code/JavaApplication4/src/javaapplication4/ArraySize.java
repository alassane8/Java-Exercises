/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;

public class ArraySize {

    public static void main(String[] args) {
        // Scanner definition : 
        Scanner input = new Scanner(System.in);
        
        //Variables definitions :
        int arraySize;
        
        //Input array size by user :
        System.out.println("Enter array size : ");
        arraySize = input.nextInt();
        
        //Exeptions handling
        try {
            //No exeptions 
            int [] Array = new int [arraySize];
            System.out.print("Array : ");
            for (int i = 0; i < arraySize; i ++){
                System.out.print(Array[i] + " ");
            }
        }
        catch(NegativeArraySizeException mistake){
            System.out.println("Negative size for array size.");
        }
        
    }
    
}
