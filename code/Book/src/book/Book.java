/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

public abstract class Book {
    protected String bookTitle;
    protected double bookPrice;
    
    protected Book(String title, double price){
        bookTitle = title;
        bookPrice = price;
    }
    protected abstract String getTitle();
    protected abstract double getPrice();
}
