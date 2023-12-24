/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discountpolicy;

public class BulkDiscount extends DiscountPolicy {
    
    protected double minimum;
    protected double percent;
    
    protected BulkDiscount(double min, double per){
        minimum = min;
        percent = per;
    }
    
    @Override
    protected double computeDiscount(int count, double itemCost){
        double discount = 0.0;
        
        if (count > minimum){
            discount = (count * itemCost * percent)/100.0;
        }
        return discount;
    }
}
