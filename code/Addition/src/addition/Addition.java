/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition;
import java.util.Scanner;

public class Addition{

	protected double variable1;
	protected double variable2;

	protected Addition(double v1, double v2){
		variable1 = v1;
		variable2 = v2;
	}

	protected double calcul(){
		return variable1 + variable2;
	}


	public static void main (String [] args){

		//Variables definition 
		double v1;
		double v2;

		//Scanner definiton :
		Scanner input = new Scanner(System.in);

		//Input variables by user
		System.out.println("Enter number 1 : ");
		v1 = input.nextDouble();

		System.out.println("Enter number 2 : ");
		v2 = input.nextDouble();

		//Creating an object
		Addition result = new Addition(v1, v2);

		//Display results of operations 
		System.out.println("The result of the addition is : " + result.calcul());
	}
}