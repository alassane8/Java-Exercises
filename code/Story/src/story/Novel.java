/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package story;

public class Novel extends Story{
    
    protected Novel(String st, String an, String m){
        super(st, an, m);
    }
    
    @Override
    protected void setNumberPages(int np){
        if (numberPages > 100){
            numberPages = np;
        }
    }
    
}
