/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package story;
import java.util.Scanner;

public class StoryDemo {
    
    public static void main(String[] args) {
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definition :
        int np;
        String novelType;
        String m;
        String st;
        String an;
        Story nov [] = new Story [6];
        
        for (int i = 0; i < 1; i ++){
            System.out.println("Story Title :");
            st = input.next();
            
            System.out.println("Author Name :");
            an = input.next();
            
            System.out.println("Number Pages:");
            np = input.nextInt(); 
            
            System.out.println("Novel Type  :");
            novelType = input.next();
            
            if (novelType.equals("Novel")){
                if (np < 100){
                    m = "Number of pages to add for the book to be considered a Novel :" + (100 - np);
                }
                else {
                    m = "";
                }
                Novel book = new Novel(st, an, m);
                book.setNumberPages(np);
                System.out.println(book.getStoryTitle());
                System.out.println(book.getAuthorName());
                System.out.println(book.getMessage());
                nov[i] = book;
            }
            else if (novelType.equals("Novella")){
                if (np < 50 || np > 100){
                    m = "Number of pages to add for the book to be considered a Novella :" + (50 - np);
                }
                else if (np > 100){
                    m = "Number of pages to substract for the book to be considered a Novella :" + (np - 50);
                }
                else {
                    m = "";
                }
                Novella book = new Novella(st, an, m);
                book.setNumberPages(np);
                System.out.println(book.getStoryTitle());
                System.out.println(book.getAuthorName());
                System.out.println(book.getMessage());
                nov[i] = book;
            }
            else if (novelType.equals("ShortStory")){
                if (np > 50){
                    m = "Number of pages to substract for the book to be considered a Short Story :" + (np - 50);
                }
                else {
                    m = "";
                }
                ShortStory book = new ShortStory(st, an, m);
                book.setNumberPages(np);
                System.out.println(book.getStoryTitle());
                System.out.println(book.getAuthorName());
                System.out.println(book.getMessage());
                nov[i] = book;
            }
        }
        for (int i = 0; i < 1; i ++){
            System.out.println(nov[i]);
        }
    }
}
