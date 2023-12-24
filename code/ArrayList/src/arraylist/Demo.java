/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;
import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        
        //Variables definitions :
        String [] sn = new String [5];
        int [][] sg = new int [5][5];
        
        //Scanner definition :
        Scanner input = new Scanner (System.in);
        
        //Enter student's informations 
        for (int i = 0; i < 5; i ++){
            System.out.println("Enter name student " + (i + 1) + " : ");
            sn[i] = input.next();
        }
        for (int i = 0; i < sn.length; i ++){
            for (int j = 0; j < 4; j ++){
                
                //Input student's grades : 
                System.out.println("Enter grade " + (j + 1) + "/4 of " + sn[i] + " (out of 100) :");
                sg[i][j] = input.nextInt();
                
                //Errors
                while (sg[i][j] < 0 || sg[i][j] > 100){
                    System.out.println("Error.");
                    sg[i][j] = input.nextInt();
                }
            }
        }
        
        
        //Display student's grades
        for (int i = 0; i < 5; i ++){
            //Creating a students object :
            Students student = new Students(sn, sg);
            System.out.println(student.getStudentsName(i)+ " :"
                    + "\n      Average : " + student.getStudentsAverage(i)
                    + "\n      Grade   : " + student.getsGrade(i));
        }
    }
}
