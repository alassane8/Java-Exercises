/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaverage;

/**
 *
 * @author wadea
 */
import java.util.Scanner;

public class SumAverage{

	public double somme;
	public double average;
	public double valeur1;
	public double valeur2;

	public SumAverage(double sum, double avg, double a, double b){
		somme = sum;
		average = avg;
		valeur1 = a;
		valeur2 = b;
	}

	public double getSum(){
		somme = valeur1 + valeur2;
		return somme;
	}


	public double getAvg(){
		average = (valeur1 + valeur2)/2;
		return average;
	}

	public static void main(String[] args){
        
        	//Scanner definition
      	 	Scanner input = new Scanner(System.in);
        
		//Declaration des variables 
		double sum = 0;
		double avg = 0;
		double a;
		double b;

		//Saisie des valeurs 
		System.out.println("Enter the first number:");
		a = input.nextInt();
		System.out.println("Enter the second number:");
		b = input.nextInt();
		
		//Creation d'un objet de la classe
		SumAverage calcul = new SumAverage(sum, avg, a, b);

		//Appel des fonctions de calcul
		System.out.println("Sum     :" + calcul.getSum());
		System.out.println("Average :" + calcul.getAvg());
	}
}
