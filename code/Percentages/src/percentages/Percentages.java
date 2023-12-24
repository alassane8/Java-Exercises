/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percentages;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class Percentages {

    /**
     * @param args the command line arguments
     */
    public void computePercent(double value1, double value2){
        double percent = 0;
        
        percent = (value1 * 100)/ value2;
        System.out.println(value1 + " is " + percent + "% of "+ value2 +".");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables 
        double value1;
        double value2;
        double gate = 0;
        
        System.out.println("Enter value 1:");
        value1 = input.nextDouble();
        System.out.println("Enter value 2:");
        value2 = input.nextDouble();
        Percentages percent = new Percentages();
        
        percent.computePercent(value1, value2);
        
        gate = value1;
        value1 = value2;
        value2 = gate;
        
        percent.computePercent(value1, value2);
    } 
}
