/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabbitjumps;
import java.util.Scanner;


public class RabbitJumps{

    public static void main(String[] args){
    	//Scanner definition :
	Scanner input = new Scanner(System.in);
        
	//Variables definitions : 
        int count = 0; 
	int max = 0;
        int j = 0; 
	int rocks; 
	int loc;

	//Input number ofxwkhksjdnds rocks : 
        System.out.println("Enter number of rocks");
	rocks = input.nextInt();
		
	while (rocks <= 0){
            System.out.println("Error.");
            rocks = input.nextInt();
        }
        rocks = rocks + 1;
        if (rocks > 0){
            //Rocks array :
            int [] rochets = new int [rocks];
            rochets[0] = 0;

            //Input location of rock i :
            for (int i = 1; i < rocks; i ++){			
                System.out.println("Enter location of rock " + i + " :");
                loc = input.nextInt();          
                while (loc <= max){
                    System.out.println("Error.");
                    loc = input.nextInt(); 
                }
                if (loc > max){
                    max = loc; 
                    rochets[i] = max; 
                }
            }
            
            for (int a = 0; a < rocks; a ++){
                if (rochets [a] - rochets [j] > 50){
                    System.out.println(rochets[a - 1]);
                    count ++; 
                    j = a - 1;
                }
            }
            
            //Informations display : 
            System.out.println("Numbers of rocks : " + (rocks - 1));

            for (int i = 1; i < rocks; i ++){
                System.out.print(rochets [i] + " "); 
            }
            System.out.println("\nMinimum number of jump : " + count);
        }
    }
}
