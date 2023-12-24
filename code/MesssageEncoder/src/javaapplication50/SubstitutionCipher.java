/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication50;

public class SubstitutionCipher implements MessageEncoder {
    
    protected int shift;
    
    protected SubstitutionCipher(int s){
        shift = s;
    }
    @Override
    public String encode(String plainText){
        char [] array = new char[plainText.length()];
        
        for (int i = 0; i < plainText.length(); i ++){
            array[i] = plainText[i + shift];
        }
        return plainText;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
