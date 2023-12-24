/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discountpolicy;

public class BuyNItemsGetOneFree extends DiscountPolicy {
    protected int N;
    
    protected BuyNItemsGetOneFree(int n){
        N = n;
    }
    
    @Override
    protected double computeDiscount(int count, double itemCost){
        double discount;
        int quantity;
        
        quantity = count / N;
        discount = quantity * itemCost;
        
        return discount;
    }
}
