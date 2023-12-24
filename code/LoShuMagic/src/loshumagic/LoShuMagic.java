/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loshumagic;

/**
 *
 * @author wadea
 */
public class LoShuMagic {

    protected int [][] array;
    protected boolean state;
    
    protected LoShuMagic (int [][] a, boolean status){
        array = a;
        state = status;
    }
    
    protected boolean getColumns(){
        //Variables definition : 
        int sum = 0;
        //Going accross the array :
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                sum += array[i][j];
            }
            if (sum != 15){
                state = false;
                break;
            }
            else if (sum == 15){
                state = true;
            }
        }
        //Return state of the sums :
        return state;
    }
    
    protected boolean getRows(){
        //Variables definition : 
        int sum = 0;
        //Going accross the array :
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                sum += array[j][i];
            }
            if (sum != 15){
                state = false;
                break;
            }
            else if (sum == 15){
                state = true;
            }
        }
        //Return state of sum :
        return state;
    }
    
    protected boolean getDiagonals(){
        //Variables definition : 
        int sum = 0;
        //Going accross the array :
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                if (i == j){
                    sum += array[i][j];
                }
                else {}
            }
            if (sum != 15){
                state = false;
                break;
            }
            else if (sum == 15){
                state = true;
            }
        }
        //Return state of the sums :
        return state;
    }
    protected void displayGrid(){
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    protected void displayB(int [] b){
        for (int i = 0; i < 9 ; i ++){
            if (i < 8){
                System.out.print(b[i] +", ");
            }
            if (i == 8){
                System.out.print(b[i]+".");
            }
        }
    }
}
