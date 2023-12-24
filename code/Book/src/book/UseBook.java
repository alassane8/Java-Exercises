/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;
import java.util.Scanner;

public class UseBook {
    
    public static void main(String[] args) {
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definiton
        int theme;
        String title;
        int numberBook;
        double price = 0.0;
        double [] bookPrice = new double[10];
        String [] bookTitle = new String [10];
        
        //Input of 'numberBook' Differents books :
        System.out.println("How many book do you want to display ?");
        numberBook = input.nextInt();
        for(int i = 0; i < numberBook; i ++){
            System.out.println("Enter book " + (i + 1) + " title : ");
            title = input.next();
            System.out.println("Book Theme : \n1. FICTION\n2. NON FICTION");
            theme = input.nextInt();
        
            //If book is fiction
            if (theme == 1){
                Fiction book = new Fiction(title, price);
                book.setPrice();
                bookTitle[i] = book.getTitle();
                bookPrice[i] = book.getPrice();
            }
            //If book is non fiction
            else if (theme == 2){
                NonFiction book = new NonFiction(title, price);
                book.setPrice();
                bookTitle[i] = book.getTitle();
                bookPrice[i] = book.getPrice();
            }
        }
        //Display all books informations :
        System.out.println("\nBOOK'S INFORMATIONS :");
        for (int j = 0; j < numberBook; j ++){
            System.out.print("\nBook " + (j + 1) + " :");
            System.out.print("\n  Title : " + bookTitle[j]);
            System.out.println("\n  Price : " + bookPrice[j]);
        }
    }
}
