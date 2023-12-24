/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatutorial3;
import java.util.Scanner;

public class SavingsAccounts{
	public double Balance;
	public double Withdraw;
	public double Deposit;
	public double AnnualInterest;
	public double MonthlyInterest;
	public double TotalWithdraw;
	public double TotalDeposit;
	public double TotalInterestEarned;

	public SavingsAccounts(double b, double w, double d, double ai, double mi, double tw, double td, double tie){
		Balance = b;
		Deposit = d;
		Withdraw = w;
		TotalDeposit = td;
		TotalWithdraw = tw;
		AnnualInterest = ai;
		MonthlyInterest = mi;
		TotalInterestEarned = tie;
	}

	public double getMonthlyInterest(){
		MonthlyInterest = AnnualInterest / 12;
		return MonthlyInterest;
	}

	public double getBalance(){
		Balance = Balance - Withdraw + Deposit + (Balance + Deposit - Withdraw) * MonthlyInterest;
		return Balance;
	}

	public double getWithdraw(){
		return Withdraw;
	}

	public double getDeposit(){
		return Deposit;
	}
	public double setTotalWithdraw(){
		TotalWithdraw = TotalWithdraw + Withdraw;
		return TotalWithdraw;
	}
	public double setTotalDeposit(){
		TotalDeposit = TotalDeposit + Deposit;
		return TotalDeposit;
	}
	public double setTotalInterestEarned(){
		TotalInterestEarned = TotalInterestEarned + (Balance + Deposit - Withdraw) * MonthlyInterest;
		return TotalInterestEarned;
	}

	public static void main(String[] args){

		//Scanner definition
		Scanner input = new Scanner(System.in);

		//Variables defintion
		double b = 0;
		double w = 0;
		double d = 0;
		double tw = 0;
		double td = 0;
		double ai = 0;
		double mi = 0;
		double tie = 0;
		int NumberMonths = 0;
		
		//User inputs
		System.out.println("Welcome to your account manager !");
		System.out.println("Annual Interest Rate :");
		ai = input.nextDouble();
		System.out.println("Starting Balance :");
		b = input.nextDouble();
		System.out.println("Number of months that have passed since the account was established :");
		NumberMonths = input.nextInt();

		
		//For every months
		for (int i = 0; i < NumberMonths; i++){
			System.out.println("Month " + (i+1));
			System.out.println("Amount deposited :");
			d = input.nextDouble();
			System.out.println("Amount withdrawed :");
			w = input.nextDouble();
			
			//Creation object
			SavingsAccounts account = new SavingsAccounts(b, w, d, ai, mi, tw, td, tie);
			System.out.print("Balance end Month " + (i+1) +" : ");
			System.out.println(account.getBalance());
			System.out.print("Monthly Interests Month " + (i+1) +" : ");
			System.out.println(account.getMonthlyInterest());

			account.setTotalDeposit();
			account.setTotalWithdraw();
			account.setTotalInterestEarned();
		}
		
		//End Year
		SavingsAccounts account = new SavingsAccounts(b, w, d, ai, mi, tw, td, tie);
		System.out.println("Ending Balance          : " + account.getBalance());
		System.out.println("Total Amount Deposited  : " + account.setTotalDeposit());
		System.out.println("Total Amount Withdrawed : " + account.setTotalWithdraw());
		System.out.println("Total Interest Earned   : " + account.setTotalInterestEarned());

	}
}