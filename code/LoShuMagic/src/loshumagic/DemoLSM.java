package loshumagic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

public class DemoLSM {
    
    public static void main(String[] args) {
        
        //Variables definitions :
        int [][] a = new int [3][3];
        boolean status = true;
        int [] b = new int [9];
        int nombreAleatoire;
        
        //Random number definition :
        Random numbers = new Random();
        LoShuMagic grid = new LoShuMagic(a, status);
        
        //Run until founding the good combinaison
        //while(grid.getColumns() == false || grid.getRows() == false || grid.getDiagonals() == false){
            
            for (int i = 0; i < 3; i ++){
                for (int j = 0; j < 3; j ++){
                    //Random number between 1 and 9
                    nombreAleatoire = numbers.nextInt(9) + 1;
                    //Checking number already on grid
                    while(b[nombreAleatoire - 1] == nombreAleatoire){
                        nombreAleatoire = numbers.nextInt(9) + 1;
                    }
                    //If not on grid
                    if (b[nombreAleatoire - 1] != nombreAleatoire) {
                        a[i][j] = nombreAleatoire;
                        b[nombreAleatoire - 1] = nombreAleatoire;
                    }
                }
            }
        
            //Display results :
            System.out.println("Sum in column    : " + grid.getColumns());
            System.out.println("Sum in rows      : " + grid.getRows());
            System.out.println("Sum in diagonals : " + grid.getDiagonals());
        
            //Display grid
            System.out.println("\nHere is the grid randomly generated : ");
            grid.displayGrid();
        
            //Display numbers on the grid
            System.out.println("\nAll the following numbers have been placed : ");
            grid.displayB(b);
            System.out.println();
        }
    //}
}
