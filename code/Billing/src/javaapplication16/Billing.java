/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/*
 * @author wadea
 */
public class Billing {

    private double choice;
    private double photo_book_price;
    private double coupon_value;
    private double quantity;
    
    public Billing(double c, double pbp, double q, double cv){
        
        choice = c;
        photo_book_price = pbp;
        quantity = q;
        coupon_value = cv;
    }
    
    public double computeBills(double c, double pbp, double q, double cv){
        
        photo_book_price = (photo_book_price * quantity) - coupon_value;
        photo_book_price += photo_book_price * .08;
        
        return photo_book_price;
    }
}
