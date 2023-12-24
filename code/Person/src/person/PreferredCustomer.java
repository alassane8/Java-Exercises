/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author wadea
 */
public class PreferredCustomer extends Customer {
    private int customerPurchases;
    private double customerDiscount;
    
    public PreferredCustomer(String pn, String adr, int num, int cn, boolean ml, int cp, double cd){
        super(pn, adr, num, cn ,ml);
        customerPurchases = cp;
        customerDiscount = cd;
    }
    
    public int getCustomerPurchases(){
        return customerPurchases;
    }
    
    public double getCustomerDiscount(){
        if (customerPurchases <= 500){
            customerDiscount = 5;
        }
        if (customerPurchases > 500 && customerPurchases <= 1000){
            customerDiscount = 6;
        }
        if (customerPurchases > 1000 && customerPurchases <= 1500){
            customerDiscount = 7;
        }
        if (customerPurchases > 1500){
            customerDiscount = 10;
        }
        return customerDiscount;
    }
}
