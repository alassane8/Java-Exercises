/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantbill;

/**
 *
 * @author wadea
 */
import java.util.Scanner;

public class RestaurantBill{

	public double mealCharge;
	public double tax;
	public double tip;

	public RestaurantBill(double mc, double tx, double tp){
		mealCharge = mc;
		tax = tx;
		tip= tp;
	}

	public double getTax(){
		return tax;
	}

	public double getTip(){
		return tip;
	}

	public double getMeal(){
		return mealCharge;
	}

	public double getMealCharge(){
		return mealCharge + ((mealCharge * tax)/100) + ((mealCharge * tip)/100);
	}
	
	public static void main(String[] args){ 

		//Scanner definition 
		Scanner input = new Scanner(System.in);
	
		//Definiton des variables
		double mc;
		double tx; 
		double tp;
		
		//Saisie valeurs
		System.out.println("Enter meal price:");
		mc = input.nextDouble();		
		System.out.println("Enter tax pourcentage :");
		tx = input.nextDouble();		
		System.out.println("Enter tip pourcentage :");
		tp = input.nextDouble();

		//Creation d'un objet
		RestaurantBill bill = new RestaurantBill(mc, tx, tp);

		//Affichage du ticket
		System.out.println("Meal charge     :" + bill.getMeal());
		System.out.println("Tax Pourcentage :" + bill.getTax());
		System.out.println("Tip Pourcentage :" + bill.getTip());
		System.out.println("Total Bill      :" + bill.getMealCharge());

	}
}