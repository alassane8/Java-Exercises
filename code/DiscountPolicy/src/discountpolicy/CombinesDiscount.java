/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discountpolicy;


public class CombinesDiscount extends DiscountPolicy{
    protected DiscountPolicy para1;
    protected DiscountPolicy para2;
    
    protected CombinesDiscount(DiscountPolicy p1, DiscountPolicy p2){
        para1 = p1;
        para2 = p2;
    }
    
    @Override
    protected double computeDiscount(int count, double itemCost){
        double discount0;
        double discount1;
        
        discount0 = para1.computeDiscount(count, itemCost);
        discount1 = para2.computeDiscount(count, itemCost);
        
        if (discount0 > discount1){
            return discount0;
        }
        else 
            return discount1;
    }
}
