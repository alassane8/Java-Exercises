/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class MonthDays {
    public int month;
    public int year;

    public MonthDays(int mth, int yr){
        month = mth;
        year = yr;
    }
    public int getNumberOfDays(int mth, int yr){
        
        int number = 0;
        int leap = 0;
        
        if ((year / 100)* 100 == year){
            if ((year / 400) * 400 == year){
                leap ++;
            }
        }
        else{
            if ((year / 4) * 4 == year ){
                leap ++;
            }
        }
        
        if ((month <= 7 && ((month / 2) * 2 != month)) || (month >= 8 && ((month / 2) * 2 == month))){
            number = 31;
        }
        else if (month == 2){
            if (leap == 1){
                number = 29;
            }
            else if (leap == 0){
                number = 28;
            }
        }
        else {
            number = 30;
        }
        return number;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int mth;
        int yr;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter month (1-12) : ");
        mth = input.nextInt();
        System.out.print("Enter year : ");
        yr = input.nextInt();
        
        MonthDays date = new MonthDays(mth, yr);
        
        date.getNumberOfDays(mth, yr);
        
        System.out.print("\nThe month "+ mth +" of the year "+ yr +" is a "
                + date.getNumberOfDays(mth, yr) +" days month.");
    }
    
}
