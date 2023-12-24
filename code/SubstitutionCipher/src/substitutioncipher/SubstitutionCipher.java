/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package substitutioncipher;
import java.util.Scanner;

public class SubstitutionCipher implements MessageEncoder {
    
    protected int shift;
    
    protected SubstitutionCipher(int s){
        shift = s;
    }

    @Override
    public String encode(String pt){
        String res = " ";
        String [] arrayText = new String [100];
        
        for (int i = 0; i < 100; i ++){  
            arrayText[i] = plainText.substring(i,(i + 1));
        }
        for (int j = 0; j < 100; j ++){
            arrayText[j] = arrayText[j + 48 + shift];
            
        }
        return plainText;
    }
    public static void main(String[] args) {
        //Scanner definition :
        Scanner input = new Scanner(System.in);
        
        //Variables definitions :
                
    }
    
}
