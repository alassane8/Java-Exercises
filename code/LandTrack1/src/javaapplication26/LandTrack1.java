/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class LandTrack1 {
    public int length; 
    public int width;
    
    public LandTrack1(int len, int wid){
        length = len;
        width = wid;
    }

    public int trackArea(){
        return length * width;
    }
    public boolean equals(LandTrack1 track2){
        boolean State;
        
        if (trackArea() == track2.trackArea()){
            State = true; 
        } 
        else {
            State = false; 
        }
        return State;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int len; 
        int wid;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter length of first track : ");
        len = input.nextInt();
        System.out.println("Enter length of first track : ");
        wid = input.nextInt();
        
        LandTrack1 track1 = new LandTrack1(len, wid);
        
        System.out.println(track1.trackArea());
        
        System.out.println("Enter length of second track : ");
        len = input.nextInt();
        System.out.println("Enter length of second track : ");
        wid = input.nextInt();
        
        LandTrack1 track2 = new LandTrack1(len, wid);
        System.out.println(track2.trackArea());
        
        if(track1.equals(track2)){
            System.out.println("Same Land Track for both track.");
        }
        else {
            System.out.println("The two tracks are differents.");
        }
    }
}
