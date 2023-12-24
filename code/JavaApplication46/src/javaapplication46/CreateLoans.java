/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication46;
import java.util.Scanner;

public class CreateLoans {
    
    public static void main(String[] args) {
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables defintions :
        int ln;
        int lt;
        double ir;
        String cn;
        double al; 
        int loanType;
        String [] LoansArray = new String [5];
        
        for (int i = 0; i < 5; i ++){
            
            System.out.println("\nLoan Type : \n1. Business Loan\n2. Personal Loan");
            loanType = input.nextInt();
            
            System.out.println("Customer Name : ");
            cn = input.next();
            
            System.out.println("Loan Number   : ");
            ln = input.nextInt();
            
            System.out.println("Amount Loan   : ( <= $100 000)");
            al = input.nextDouble();
            while(al > 100000){
                System.out.println("Error.");
                al = input.nextInt();
            }
            
            System.out.println("Loan Term     : (1, 3 or 5 years)");
            lt = input.nextInt();
            while(lt != 1 && lt != 3 && lt != 5){
                System.out.println("Error.");
                lt = input.nextInt();
            }
            
            if (lt == 1 || lt == 3 || lt == 5){
                if (loanType == 1){
                    
                    BusinessLoan business = new BusinessLoan(ln, cn, al, lt);
                    System.out.println("\nLOAN " + (i + 1) + " INFORMATIONS :");
                    business.toString();
                }
                else if (loanType == 2){
                    
                    PersonalLoan personal = new PersonalLoan(ln, cn, al, lt);
                    System.out.println("\nLOAN " + (i + 1) + " INFORMATIONS :");
                    personal.toString();
                }
            }
        }
    }
}
