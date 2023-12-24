/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meadowdaledairyfarm;

import java.util.Scanner;

public class MeadowdaleDairyFarm {

	public double NumberDozenEggs;
	public int NumberSingleEggs;
	public int NumberEggs;
	public double Price = 0;

	public MeadowdaleDairyFarm(double nde, int nse, int ne, double p){
		NumberDozenEggs = nde;
		NumberSingleEggs = nse;
		NumberEggs = ne;
		Price = p;
	}

	public double getTotalEggs(){
		return NumberEggs;
	}

	public double getNumberSingleEggs(){
		NumberSingleEggs = NumberEggs % 12;
		Price = Price + (0.45 * NumberSingleEggs);
		return NumberSingleEggs;
	}

	public double getNumberDozenEggs(){
		NumberDozenEggs = (NumberEggs - NumberSingleEggs) / 12;
		Price = Price + (3.25 * NumberDozenEggs);
		return NumberDozenEggs;
	}
	
	public double getPrice(){
		return Price;
	}

    public static void main(String[] args) {
		
	//Scanner definition
	Scanner input = new Scanner(System.in);

	//Variables definiton
	int nse = 0;
	double nde = 0;
	double p = 0;
	int ne;

	//Get variables 
	System.out.println("How many eggs do you want to order ?");
	ne = input.nextInt();

	//Creation object
	MeadowdaleDairyFarm Eggs = new MeadowdaleDairyFarm(nde, nse, ne, p);


	//Exit
	System.out.println("You ordered "+ Eggs.getTotalEggs() +", that's "+ Eggs.getNumberDozenEggs() +" dozen at $3.25 per dozen and "+ Eggs.getNumberSingleEggs() +" loose eggs at $0.45 each for a total of $"+ Eggs.getPrice() +".");
    }
}