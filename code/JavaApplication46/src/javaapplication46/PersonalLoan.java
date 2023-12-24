/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication46;

public class PersonalLoan extends Loan{
    
    protected PersonalLoan(int ln, String cn, double al, int lt){
        super(ln, cn, al, lt);
        interestRate = interestRate + 2; 
    }
    
    public String toString(){
        
        System.out.println("Customer Name : " + customerName);
        System.out.println("Loan Number   : " + loanNumber);
        System.out.println("Loan Term     : " + loanTerm + " year(s)");
        System.out.println("Amount Loan   : " + amountLoan + "$");
        System.out.println("Interest Rate : " + interestRate + "%");
        amountLoan = amountLoan + amountLoan * (interestRate/ 100);
        System.out.println("Total due     : " + amountLoan + "$");
        return companyName;
    }
}
