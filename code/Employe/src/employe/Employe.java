/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employe;

/**
 *
 * @author wadea
 */
public class Employe {
    public String name;
    public int number;
    public String hiredate;
    
    public Employe(String n, int num, String d){
        name = n;
        number = num;
        hiredate = d;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public String getDate(){
        return hiredate;
    }
}
