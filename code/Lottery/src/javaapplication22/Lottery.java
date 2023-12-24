/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;
import java.util.Random;

public class Lottery {
    
    public int [] lotteryNumbers = new int [5];
    public int [] lotRandom = new int [5];
    
    public Lottery (int [] lotNum, int [] lotRand){
        lotteryNumbers = lotNum;
        lotRandom = lotRand;
    }
    
    public int compare (){
        //Variables 
        int a = 0;
        for (int i = 0; i < 5; i ++){
            Random ra = new Random();
            lotRandom [i] = ra.nextInt(9);
        }
        for (int j = 0; j < 5; j ++){
            if (lotRandom [j] != lotteryNumbers[j]){
                return a;
            }
        }
        a++;
        return a;
    }
}
