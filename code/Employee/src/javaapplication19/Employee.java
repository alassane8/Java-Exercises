/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/*
 * @author wadea
 */
public class Employee {

    public String name;
    public String departement;
    public String position;
    public int idNumber;
    /*
     * @param args the command line arguments
     */
    public Employee(String e_n, int e_ID, String dept, String pos){
        name = e_n;
        idNumber = e_ID;
        departement = dept;
        position = pos;
    }
    public Employee(String e_n, int e_ID){
        name = e_n;
        idNumber = e_ID;
    }
    public static void main(String[] args) {
        
        //Variables
        int a;
        int e_ID = 0;
        int choice;
        String e_n = "";
        String pos = "";
        String dept = "";
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        // TODO code application logic here
        System.out.println("How many employee do you want to display ? (min 5) ");
        a = input.nextInt();
        
        while(a < 5){
            System.out.println("Error.");
            a = input.nextInt();
        }
        
        for (int i = 0; i < a; i++){
            
            System.out.println("Employee " + (i + 1) + " is a :");
            System.out.println("1. New employee.");
            System.out.println("2. Experienced employee.");
            choice = input.nextInt();
            
            Employee E1 = new Employee(e_n, e_ID, dept, pos);
            
            if (choice == 1){
                    System.out.println("Employee "+ (i + 1) +" ID : ");
                    e_ID = input.nextInt();
            
                    System.out.println("Employee "+ (i + 1) +" name : ");
                    e_n = input.next();
                    
                    //Display of the employee data's
                    System.out.println("Employee "+ (i + 1) +" datas : ");
                    System.out.println("- ID number    : " + e_ID);
                    System.out.println("- Name         : "+ e_n);
            }
                    
            else if (choice == 2){
                    System.out.println("Employee "+ (i + 1) +" ID : ");
                    e_ID = input.nextInt();
            
                    System.out.println("Employee "+ (i + 1) +" name : ");
                    e_n = input.nextLine();
            
                    System.out.println("Employee "+ (i + 1) +" position : ");
                    pos = input.nextLine();
            
                    System.out.println("Employee "+ (i + 1) +" departement : ");
                    dept = input.nextLine();
                    
                    //Display of the employee data's
                    System.out.println("Employee "+ (i + 1) +" datas : ");
                    System.out.println("- ID number    : " + e_ID);
                    System.out.println("- Name         : "+ e_n);
                    System.out.println("- Position     : "+ pos);
                    System.out.println("- Departement  : "+ dept);
                    
            }
        }
    }
}
