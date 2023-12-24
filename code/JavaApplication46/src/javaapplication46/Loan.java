/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;

public abstract class Loan implements LoanConstants {
    protected int loanNumber;
    protected String customerName;
    protected double amountLoan;
    protected double interestRate = 5;
    protected int loanTerm;
    
    protected Loan(int ln, String cn, double al, int lt){
        loanNumber = ln;
        customerName = cn;
        loanTerm = lt;
        
        if (amountLoan <= maximumLoanAmount){
            amountLoan = al;
        }
        if (loanTerm == shortTerm){
            loanTerm = shortTerm;
        }
        if (loanTerm == mediumTerm){
            loanTerm = mediumTerm;
        }
        if (loanTerm == longTerm){
            loanTerm = longTerm;
        }
    }
    @Override
    public String toString(){
        return companyName;
    }
}
