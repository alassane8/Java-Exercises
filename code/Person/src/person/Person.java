/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author wadea 
 */
public class Person{
    public String personName;
    public String adress;
    public int number;
    
    public Person(String pn, String adr, int num){
        personName = pn;
        adress = adr;
        number = num;
    }
    
    public String getName(){
        return personName;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public int getNumber(){
        return number;
    }
}
