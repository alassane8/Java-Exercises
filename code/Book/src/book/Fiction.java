/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author wadea
 */
public class Fiction extends Book{
    
    protected Fiction(String title, double price){
        super(title, price);
    }
    @Override
    protected String getTitle(){
        return bookTitle;
    }
    @Override
    protected double getPrice(){
        return bookPrice;
    }
    
    protected void setPrice(){
        bookPrice = 24.99;
    }
}
