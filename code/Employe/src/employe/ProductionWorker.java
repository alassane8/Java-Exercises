/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employe;

/**
 *
 * @author wadea
 */
public class ProductionWorker extends Employe{
    private int shift;
    private double hourlyPayRate;
    
    public ProductionWorker(String n, int num, String d, int Shift, double hpr){
        super(n, num, d);
        shift = Shift;
        hourlyPayRate = hpr;
    }
    
    public int getShift(){
        return shift;
    }
    public double getHourlyPayRate(){
        return hourlyPayRate;
    }   
}
